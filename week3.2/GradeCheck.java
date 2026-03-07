import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your grade: ");
        int grade = sc.nextInt();

        String result = (grade >= 40) ? "Pass" : "Fail";

        System.out.println("\n\t Result ");
        System.out.println("\tGrade:\t" + grade);
        System.out.println("\tStatus:\t" + result);

        sc.close();
    }
}