package Cw11.z3;

import Cw11.z3.Person;

public class Employee extends Person {
    private int hireday;
    private String companyName;
    private double salary;

    public Employee(String fname, String lname, int birthdayYer, int hireday, String companyName, double salary) {
        super(fname, lname, birthdayYer);
        this.hireday = hireday;
        this.companyName = companyName;
        this.salary = salary;
    }
    public double getJobSeniority() {
        return hireday-getAge();
    }
    public double getSalary1() {
        return salary;
    }
}
