package Cw11.z3;

public class Manager extends Employee {
    double bonus;

    public Manager(String fname, String lname, int birthdayYer, int hireday, String companyName, double salary, double bonus) {
        super(fname, lname, birthdayYer, hireday, companyName, salary);
        this.bonus = bonus;
    }
    public double getSalary() {
        return getSalary1()+bonus;
    }

    @Override
    public String toString() {
        return "Manager with "+fname + " " + lname + " and age " + getAge() + " " + " has salary " + getSalary();
    }
}

