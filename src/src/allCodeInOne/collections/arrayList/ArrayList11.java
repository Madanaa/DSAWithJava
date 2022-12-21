package allCodeInOne.collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList11 {
    public static void main(String[] args) {
        Student student = new Student(12,
                "karan",21
        );
        Student student1 = new Student(1,
                "Madan", 24
        );
        ArrayList<Student> li = new ArrayList<>();
        li.add(student);
        li.add(student1);
        Iterator it = li.iterator();
        while (it.hasNext()) {
            Student st = (Student)it.next();
            System.out.println(st.roll_no+" "+st.name+" "+st.age);
        }


    }
}
