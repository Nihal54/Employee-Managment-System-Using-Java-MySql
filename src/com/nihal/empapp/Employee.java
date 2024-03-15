package com.nihal.empapp;

public class Employee {

    private int id ;
    private String Name;

    private double salary;
    private int age;

    public Employee()
    {

    }


    public Employee(int id, String name, double salary, int age) {
        this.id = id;
        Name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
