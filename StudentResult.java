public class StudentResult {

    public static void main(String[] args) {

        String studentName = "Rahul";
        int totalMarks = 420;
        int numberOfSubjects = 5;

        int average = totalMarks / numberOfSubjects;
        // test
        System.out.println("Student: " + studentName);
        System.out.println("Average: " + average);

        if (average <= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        System.out.printf("Percentage: %.2f%%%n", (double) average);
    }
}
