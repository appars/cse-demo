public class StudentResultDemo {

    public static void main(String[] args) {

        String studentName = "Rahul";
        int totalMarks = 420;
        int numberOfSubjects = 5;

        // Check before dividing
        if (numberOfSubjects == 0) {
            System.out.println("Error: Number of subjects cannot be zero.");
            return;
        }

        double average = (double) totalMarks / numberOfSubjects;

        System.out.println("Student: " + studentName);
        System.out.printf("Average: %.2f%n", average);

        // Pass if average is 40 or more
        if (average >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}
