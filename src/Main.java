// https://github.com/nataliedeyonna/Inheritance
public class Main {
    public static void main(String[] args) {
        //create two person object
        Person p1 = new Person();

//        Person p2 = new Person(72, 70, "Black", "Barack Obama", 170);
//        System.out.println(p2.name);
        Person p2 = new Person(72, 70);
        System.out.println(p2.age);

        Person p3 = p2.Call_Private();

        Student s1 = new Student();
        s1.age = 20;
        s1.gpa = 4.00;
        System.out.println(s1.gpa);


        Instructor i1 = new Instructor();
        i1.Instructor_id = 21289;
        i1.course_name = "ENGL 101";
        i1.course_number = 321;

        System.out.println("Instructor id: " + i1.Instructor_id);
        System.out.println("Course name: " + i1.course_name);
        System.out.println("Course number: " + i1.course_number);



    }
}