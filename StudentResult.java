
public class StudentResult {

    public static void main(String[] args) {

        String student = "Rahul";
        int marks1 = 85;
        int marks2 = 78;
        int marks3 = 90;

        int total = marks1 + marks2 + marks3;
        double percentage = total / 3.0;

        System.out.println("Student Result System");
        System.out.println("---------------------");
        System.out.println("Name: " + student);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}
