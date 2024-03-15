package com.nihal.empapp;

public interface EmployeeDaoIntrfc {


    //Create Employyee
    public void createEmployee(Employee emp);

    //ShowAll Employee

    public void showAllEmployees();

    //Show Based On Id

    public void showEmployeeBasedOnId(int id);

    //Update Employee

    public void UpdateEmployee(int id , String name);

    //Delete Employuee

    public void deleteEmployee(int id);


}
