
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum;
        int numbers;
        sum = numbers = 0;
        while(true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0) {
                break;
            }
            numbers++;
            sum += num;
        }
        System.out.println("Average of the numbers: " + (sum / numbers));
    }
}
