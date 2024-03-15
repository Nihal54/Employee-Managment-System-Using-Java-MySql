package com.nihal.empapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection con;

    public static Connection getDBConnection()
    {

        //load Driver
        try {
            //Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");


            //getConnection
            String url= "jdbc:mysql://localhost:3306/employeeDB?useSSL=false";
            String password ="Nihal@123";
            String username = "root";
            con = DriverManager.getConnection(url,username,password);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return con;

    }
}
