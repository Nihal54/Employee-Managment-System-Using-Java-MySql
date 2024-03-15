package com.nihal.empapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDaoImpl implements EmployeeDaoIntrfc{

    Connection con;
    @Override
    public void createEmployee(Employee emp) {

         con = DBConnection.getDBConnection();

         String query = "insert into Employee values(?,?,?,?)";
        try{
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1,emp.getId());
            pstm.setString(2,emp.getName());
            pstm.setDouble(3,emp.getSalary());
            pstm.setInt(4,emp.getAge());
            int cnt = pstm.executeUpdate();
            if(cnt!=0)
            {
                System.out.println("Employee Inserted Successfully");

            }
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }


    }

    @Override
    public void showAllEmployees() {

        con = DBConnection.getDBConnection();
        String query = "select * from Employee";
        System.out.println("Employee Details::");
        System.out.format("%s\t%s\t%s\t%s\n","ID","Name","Salary","\t\tAge");
        System.out.println("_______________________________");
        try{

            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);

            while(result.next())
            {

                System.out.format("%d\t%s\t%f\t%d\n",result.getInt(1),result.getString(2),result.getDouble(3),result.getInt(4));
System.out.println("_______________________________");
            }

        }catch(Exception ex)
        {
            ex.printStackTrace();
        }


    }

    @Override
    public void showEmployeeBasedOnId(int id) {
con = DBConnection.getDBConnection();
        String query = "select *from employee where id ="+id;

        try{

            Statement stmt = con.createStatement();
            ResultSet result  =  stmt.executeQuery(query);
            while(result.next())
            {
                System.out.println("_______________________________");
                System.out.format("%d\t%s\t%f\t%d\n",result.getInt(1),result.getString(2),result.getDouble(3),result.getInt(4));
                System.out.println("_______________________________");
            }



        }catch(Exception ex)
        {
            ex.printStackTrace();
        }



    }

    @Override
    public void UpdateEmployee(int id, String name) {

        con = DBConnection.getDBConnection();
        String query = "update employee set name =? where id =?";
        try{
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1,name);
            pstm.setInt(2,id);
           int cnt =  pstm.executeUpdate();

           if (cnt!= 0)
           {
               System.out.println("Employee Details updated Sucessfully");
           }


        }catch(Exception ex)
        {
            ex.printStackTrace();
        }

    }

    @Override
    public void deleteEmployee(int id) {

        con = DBConnection.getDBConnection();
        String query = "delete from employee where id =?";

        try{
            PreparedStatement pstr = con.prepareStatement(query);
            pstr.setInt(1,id);
            int cnt = pstr.executeUpdate();
            if(cnt != 0)
            {
                System.out.println("Employee Deleted Sucessfully! "+id);
            }


        }catch(Exception ex)
        {
            ex.printStackTrace();
        }

    }
}
