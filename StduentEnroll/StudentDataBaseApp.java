package StduentEnroll;
public class StudentDataBaseApp {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Student student1 = new Student();
        //student1.UniqueID();
        student1.enroll();
        // student1.ViewBalance();
        student1.PayTuition();
        student1.status();
    }
}