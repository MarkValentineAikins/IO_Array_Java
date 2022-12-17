import java.util.Scanner;
public class IOArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int Student = 2;
        int [] TestScores = new int[Student];

        System.out.println("Enter all Test scores for the " + Student + " Students in your class");

        System.out.println("Student 1 test score:");
        TestScores [0] = sc.nextInt();

        System.out.println("Student 2 test score:");
        TestScores [1] = sc.nextInt();

        System.out.println("These are the scores you entered for the two students!");
        System.out.println("Students 1 has " + TestScores[0]);
        System.out.println("Student 2 has " + TestScores[1]);

        sc.close();
    }
}
