package allCodeInOne.object;

public class Student {
    int id;
    String name;



}
 class TestStudent {
     public static void main(String[] args) {
        // List<Student> list = new ArrayList<>();
         Student student = new Student();
         student.id = 2;
         student.name = "madan";
         System.out.println(student.id+ " "+student.name);

     }
}
