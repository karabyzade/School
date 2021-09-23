package School;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{

    List<Course> courseArr;
    public  Teacher(String name,String surname)
    {
        super(name,surname);
        courseArr=new ArrayList<Course>();
    }
    public boolean addNewCourse(Course newCourse){

        //Array must be sorted first
       if(this.courseArr.size()>3)
       {
           return false;
       }
        else
       {
            this.courseArr.add(newCourse);
            return true;
       }
    }

}

