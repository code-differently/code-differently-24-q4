package com.codedifferently.lesson15;

public class Employee {
  private int id;
  private String name;
  private String department;
  private double salary;

  public Employee(int id, String name, String department, double salary) {
    this.id = id;
    this.name = name;
    this.department = department;
    this.salary = salary;
  }

  // Getters and setters
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public boolean isEqualTo(int otherId) {
    return this.id == otherId;
  }

  public String getDetails() {
    return "id: " + this.getId() + " name: " + this.getName() + " department: " + this.getDepartment() + " salary: " + this.getSalary();
    

  }

public void put(Employee employee) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'put'");
}
}
