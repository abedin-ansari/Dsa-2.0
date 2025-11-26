import java.util.Scanner;

public class A_InputAndOutput {
    public static void main(String[] args) {
        int[] marks = new int[50];

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter marks of Physics, Chemistry and Maths: ");

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        int arrLength  = marks.length;
        System.out.println("Length of array: " + arrLength);

        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemestry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);

        // marks[2] = 71;
        // System.out.println("Updated Maths marks: " + marks[2]);

        int percentage = ((marks[0] + marks[1] + marks[2]) / 3);
        System.out.println("Percentage: " + percentage);
    }
}
