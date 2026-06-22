import java.util.Scanner;
public class IT26100171Lab9Q4 {
    public static double calcFinalMark(double assignment, double exam) {
        return (assignment * 0.30) + (exam * 0.70);
    }
    public static String findGrades(double finalMark) {
        if (finalMark >= 75) return "A";
        else if (finalMark >= 60) return "B";
        else if (finalMark >= 50) return "C";
        else return "F";
    }
    public static void printDetails(String name, double finalMark, String grade) {
        System.out.printf("%-15s%-15.2f%s%n", name, finalMark, grade);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-15s%-15s%s%n", "Name", "Final Mark", "Grade");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Name of Student " + i + ": ");
            String name = input.next();
            System.out.print("Enter Assignment Mark (out of 100) for " + name + ": ");
            double assignment = input.nextDouble();
            System.out.print("Enter Exam Paper Mark (out of 100) for " + name + ": ");
            double exam = input.nextDouble();
            double finalMark = calcFinalMark(assignment, exam);
            String grade = findGrades(finalMark);
            printDetails(name, finalMark, grade);
        }
    }
}