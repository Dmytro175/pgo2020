package Cw11.z3;

import java.time.LocalDate;

abstract class Person {
    String fname,lname;
    private int birthdayYer;

    public Person(String fname, String lname, int birthdayYer) {
        this.fname = fname;
        this.lname = lname;
        this.birthdayYer = birthdayYer;
    }
public int getAge(){
        int curent= LocalDate.now().getYear();
        return curent-birthdayYer;
}
}
