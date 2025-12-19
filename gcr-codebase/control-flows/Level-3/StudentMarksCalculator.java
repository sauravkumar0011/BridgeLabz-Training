// Creating a class named StudentGradeCalculator purpose  to calculate percentage, grade, and remarks.
import java.util.Scanner;

class StudentGradeCalculator {

    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Taking marks input for three subjects
        System.out.print("Enter Physics marks: ");
        int physics = input.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = input.nextInt();
        System.out.print("Enter Maths marks: ");
        int maths = input.nextInt();

        // Calculating total and average percentage
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        char grade;
        String remarks;
        // Calculating grade and remarks 
        if (percentage >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        }
        else if (percentage >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        }
        else if (percentage >= 60) {
            grade = 'C';
            remarks = "Level 2, below but approaching agency-normalized standards";
        }
        else if (percentage >= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        }
        else if (percentage >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        }
        else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        // Display the result
        System.out.println("Average Mark: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}
