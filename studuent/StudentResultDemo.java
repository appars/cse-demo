// This program calculates a student's average marks
// and tells whether the student passed or failed.
public class StudentResultDemo {

    // main() is where the program starts running
    public static void main(String[] args) {

        // Step 1: Store the student's details
        String studentName = "Rahul";   // Name of the student
        int totalMarks = 420;           // Total marks scored in all subjects
        int numberOfSubjects = 5;       // How many subjects the student took

        // Step 2: Check before dividing
        // If numberOfSubjects is 0, we cannot calculate the average,
        // so we show an error and stop the program.
        if (numberOfSubjects == 0) {
            System.out.println("Error: Number of subjects cannot be zero.");
            return;   // Stops the program here
        }

        // Step 3: Calculate the average
        // (double) converts totalMarks to a decimal number,
        // so we don't lose the decimal part in the result.
        // Example: 421 / 5 = 84 (int), but (double) 421 / 5 = 84.2
        double average = (double) totalMarks / numberOfSubjects;

        // Step 4: Display the student's name and average
        System.out.println("Student: " + studentName);

        // %.2f  -> show the number with 2 digits after the decimal point
        // %n    -> move to the next line
        System.out.printf("Average: %.2f%n", average);

        // Step 5: Decide PASS or FAIL
        // The student passes if the average is 40 or more
        if (average >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}
