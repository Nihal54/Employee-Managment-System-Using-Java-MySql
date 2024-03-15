package com.nihal.empapp;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        EmployeeDaoIntrfc dao = new EmployeeDaoImpl();
        System.out.println("Welcome to Employee Managment Apllication");
        Scanner sc = new Scanner(System.in);
        do{

            System.out.println("1. Add Employee\n"+
                    "2. Show All Employee\n"+
                    "3. Show Employee Based on Id\n"+
                    "4. Update the Employee\n"+
                    "5. Delete the Employee\n");
System.out.println("Enter the Choice:->");
int ch = sc.nextInt();

switch(ch)
{
    case 1:
        Employee emp = new Employee();

        System.out.println(" Enter ID: ");
        int id = sc.nextInt();
        System.out.println("Enter Name");
        String Name = sc.next();
        System.out.println("Enter Salary");
        double Salary = sc.nextDouble();
        System.out.println("Enter Age");
        int age= sc.nextInt();
        emp.setId(id);
        emp.setName(Name);
        emp.setSalary(Salary);
        emp.setAge(age);



        dao.createEmployee(emp);
        break;

    case 2:
        dao.showAllEmployees();
        break;

    case 3:
        System.out.println("Enter id to Show the Details");
int empid = sc.nextInt();
dao.showEmployeeBasedOnId(empid);
break;
    case 4:
System.out.println("Enter id to update the name");
int emid = sc.nextInt();
    System.out.println("Enter the new Name");

    String Name2 = sc.next();
    dao.UpdateEmployee(emid,Name2);
    break;

    case 5:
System.out.println("Enter the id to Delete");
id = sc.nextInt();
dao.deleteEmployee(id);

break;
    case 6:
        System.out.println("thank you for using our application");
        System.exit(0);
    default:
        System.out.println("Enter Valid Choice");


}
        }while(true);
    }
}
