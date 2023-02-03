import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

 Student student=new Student();
    student.name="Ainura";
    student.age=18;
    student.group="Java 9";

        Student student1=new Student();
        student1.name="Akylai";
        student1.age=19;
        student1.group="Java 9";


        Student student2=new Student();
        student2.name="Aktan";
        student2.age=23;
        student2.group="Js";

        Student student3=new Student();
        student3.name="Aisha";
        student3.age=17;
        student3.group="Js";

        Student student4=new Student();
        student4.name="Aika";
        student4.age=19;
        student4.group="Java 9";


        Student student5=new Student();
        student5.name="bek";
        student5.age=19;
        student5.group="Js ";

   Student[] students={student,student1,student2,student3,student4,student5};
int counter = 0;
  int counter1=0;
  String java=new String("Java 9");
  String js=new String("Js");
        for (int i = 0; i <students.length ; i++) {
            if (students[i].group.equals(java)) {
                counter++;
            } else if (students[i].group.equals(js)) {
                counter1++;
            }
        }
            System.out.println((counter+ " Java 9"));
            System.out.print(counter1+ " Js");

        }







       }




