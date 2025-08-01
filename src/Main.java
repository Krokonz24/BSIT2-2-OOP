import java.util.Scanner;
public class Main {

    String StudentID = "";
    String FirstName = "";
    String LastName  = "";
    String Course = "";
    String Section = "";

    //Student Grade
    int Midterm = 0;
    int Final = 0;
    int Project = 0;
    int AttendancePercentage = 0;

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);


        System.out.print("Student ID: ");
        String StudentID = Scan.nextLine();

        System.out.print("Last name: ");
        String LastName = Scan.nextLine();

        System.out.print("First name: ");
        String FirstName = Scan.nextLine();

        System.out.print("Course: ");
        String Course = Scan.nextLine();

        System.out.print("Section: ");
        String Section = Scan.nextLine();

        System.out.println(LastName + " " + FirstName + " " + Course + " " + Section);


        System.out.print("Input your scores in Midterm Exam: ");
        int Midterm = Scan.nextInt();

        System.out.print("Input your scores in Final Exam: ");
        int Final = Scan.nextInt();

        System.out.print("Input your scores in your project: ");
        int Project = Scan.nextInt();

        System.out.print("Input your scores in your Attendance: ");
        int AttendancePercentage = Scan.nextInt();

        int allOverScore = Midterm + Final + Project + AttendancePercentage;

        double averageScore = allOverScore / 400.0 * 100;

        if (averageScore > 75) {
            System.out.println("PASSED! Your average is:" + averageScore);
        }
        else {
            System.out.println("FAILED. Your average is:" + averageScore);
        }

        Scan.close();
    }
}