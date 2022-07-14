
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String stringVar = scan.nextLine();
        System.out.println("Give an integer:");
        int integerVar = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double doubleVar = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean booleanVar = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + stringVar);
        System.out.println("You gave the integer " + integerVar);
        System.out.println("You gave the double " + doubleVar);
        System.out.println("You gave the boolean " + booleanVar);
    }
}
