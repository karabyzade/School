package School;

import java.util.ArrayList;
import java.util.List;

public class Student<Credit> extends Person{
    int year;
    List<Credit> CreditArr;
    public Student(String name, String surname) {
        super(name, surname);
        CreditArr=new ArrayList<Credit>();
    }

    public boolean addNewCredit(Credit newCredit){

        //Array must be sorted first
        if(this.CreditArr.size()>20)
        {
            return false;
        }
        else
        {
            this.CreditArr.add(newCredit);
            return true;
        }
    }
}
