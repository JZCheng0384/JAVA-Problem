package StduentEnroll;
import java.util.Scanner;

public class Student {
    private String FName;
    private String LName;
    private String YearOfStudent;
    private String SchoolYear;
    private String UniqueID;
    private String Courses;
    private static int SingleCoursesCost = 600;
    private int TuitionFee = 0;
    private int TotalCourse = 0;
    private int remindingBalance = 0;

    // prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter student's First name: ");
        this.FName = in.nextLine();
        System.out.print("Please enter student's Last name: ");
        this.LName = in.nextLine();
        System.out.println("What year are you in: \n1-Freshmen \n2-Spoemnor \n3-Junior \n4-Senior");
        this.YearOfStudent = in.nextLine();

        int numberOfYear = Integer.parseInt(YearOfStudent);
        // System.out.println("Year of Student is: " + YearOfStudent);
        if (numberOfYear == 1) {
            SchoolYear = "Freshmen";
        }
        if (numberOfYear == 2) {
            SchoolYear = "Spoemnor";
        }
        if (numberOfYear == 3) {
            SchoolYear = "Junior";
        }
        if (numberOfYear == 4) {
            SchoolYear = "Senior";
        }

        System.out.println(FName + " " + LName + ", You are in year: " + SchoolYear);

    }

    // create id
    public void UniqueID() {
        this.UniqueID = YearOfStudent + "" + (int) (Math.random() * 10000);
        // System.out.println((int) (Math.random() * 10000));
        System.out.println(FName + " " + LName + ", Your ID will be: " + UniqueID);
    }

    // enroll the course
    public void enroll() {

        // while (i != 0) {
        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter the corse that you want to enroll (Q for Quit)");
        // String course = in.nextLine();
        // Courses = Courses + "\n" + course;
        // if (!course.equals("Q") || !course.equals("q")) {
        // i--;
        // }

        // System.out.println("The Enroll courses are: " + Courses);
        // }
        int i = 1;
        while (i > 0) {
            System.out.print("Enter the corse that you want to enroll (Q for Quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (course.equals("Q")) {
                i = -1;
                break;

            } else {
                this.Courses = Courses + "\n" + course;
                TotalCourse += 1;
                TuitionFee = TuitionFee + SingleCoursesCost;

            }
        }
        Courses = Courses.substring(4);
        System.out.println("You have " + TotalCourse + " Courses in total");
        System.out.println("The Enroll courses are: " + Courses);
        System.out.println("Total of the Enroll courses are: " + TuitionFee);

    }

    // view balance
    public void ViewBalance() {
        System.out.println("Your balance is: " + TuitionFee);
    }

    // pay tuition
    public void PayTuition() {
        System.out.println("Which method you perfer to pay: \n1-Cash \n2-Credit \n3-Debit \n4-Check");
        Scanner in = new Scanner(System.in);
        int PayMethod = Integer.parseInt(in.nextLine());
        //System.out.println("HEEYYYYYYY");
        //System.out.println(PayMethod);
        if (PayMethod == 1) {
            System.out.print("For Cash: that you can go to our office to pay with cash");
        }
        if (PayMethod == 2) {
            System.out.println("For Credit: Wait for the System to process");
            System.out.println("<------------------------------------>");
            System.out.print("Please enter the amount that you want to pay: ");
            Scanner number = new Scanner(System.in);
            int payment = number.nextInt();
            System.out.println("You enter: $" + payment + ". Is this correct? Yes/No"); 
            Scanner answers = new Scanner(System.in);
            String Comfort = answers.nextLine();
            // while (!Comfort.equals("Yes") || !Comfort.equals("yes") || !Comfort.equals("No") || !Comfort.equals("no")){
            //     System.out.println("Sorry, I didn't get");
            // }
            
                if (Comfort.equals("Yes") || Comfort.equals("yes")) {
                    this.remindingBalance = TuitionFee - payment;
                    System.out.println("Your reminding balance is: " + (TuitionFee - payment));
                }

        }
        if (PayMethod == 3) {
            System.out.print("For Debit: Wait for the System to process");
            System.out.println("<------------------------------------>");
            System.out.print("Please enter the amount that you want to pay: ");
            Scanner number = new Scanner(System.in);
            int payment = number.nextInt();
            System.out.println("You enter: $" + payment + ". Is this correct? Yes/No"); 
            Scanner answers = new Scanner(System.in);
            String Comfort = answers.nextLine();
            // while (!Comfort.equals("Yes") || !Comfort.equals("yes") || !Comfort.equals("No") || !Comfort.equals("no")){
            //     System.out.println("Sorry, I didn't get");
            // }
            
                if (Comfort.equals("Yes") || Comfort.equals("yes")) {
                    this.remindingBalance = TuitionFee - payment;
                    System.out.println("Your reminding balance is: " + (TuitionFee - payment));
                }
        }
        if (PayMethod == 4) {
            System.out.print("For Check: You can mail to check to ###########");
        }
    }
    // show status

    public void status(){
        System.out.println("===================================================================================");
        System.out.println("Here is the summary of the Student info");
        System.out.println("Here is Student's name: "+FName+" "+LName);
        System.out.println("The Year in College is: "+SchoolYear);
        System.out.println("Courses will taking are: "+Courses);
        System.out.println("Total cost of the coures: "+TuitionFee);
        System.out.println("The reminding balance is: "+remindingBalance);
        
    }
}
