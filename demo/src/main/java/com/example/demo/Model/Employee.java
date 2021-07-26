package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @Column(name = "empID")
    @GeneratedValue
    private  Integer empID;

    @Column(name = "empName")
    private  String empName;

    @Column(name = "salary")
    private  Integer salary;

    @Column(name = "dept")
    private  String dept;

public Employee()
{

}

    public Employee(Integer empID, String empName, Integer salary, String dept) {
        super();
        this.empID = empID;
        this.empName = empName;
        this.salary = salary;
        this.dept = dept;
    }


    @Override
    public String toString() {
        return String.format("Employee [employeeID = %d, empName = %s, salary = %d, department= %s", empID, empName, salary, dept);
    }


    public int getEmpID() {
        return empID;
    }
    public String getEmpName() {
        return empName;
    }
    public int getSalary() {
        return salary;
    }
    public String getDept() {
        return dept;
    }

    public void setEmpId(Integer empID)
    {
        this.empID=empID;
    }
    public void setEmpName(String empName)
    {
        this.empName=empName;
    }
    public void setSalary(Integer salary)
    {
        this.salary=salary;
    }
    public void setDept(String dept)
    {
        this.dept=dept;
    }
}
