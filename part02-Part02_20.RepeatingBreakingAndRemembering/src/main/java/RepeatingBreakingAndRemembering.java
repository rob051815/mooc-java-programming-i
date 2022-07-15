
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        int even = 0;
        int odd = 0;
        while(true) {
            // Get a number from user
            System.out.println("Give numbers:");
            int num = Integer.valueOf(scanner.nextLine());

            // Break if the number is -1
            if(num == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            // Increment sum with user input (num)
            sum += num;
            // Increment num count.
            numbers++;
            //Increment even or odd
            if(num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + 1.0 * sum / numbers);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
