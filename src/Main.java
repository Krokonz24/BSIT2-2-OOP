public class Main {

public static void main(String[] args) {
    GradeCalculator GC = new GradeCalculator();

    String student = "John Smith";
    double average = GC.calculateAverage(85.5, 92.0, 78.5, 90.0);
    String grade = GC.getLetterGrade(average);

    GC.displayResult(student, average);
    GC.displayResult(student, average, grade);
    }
}
