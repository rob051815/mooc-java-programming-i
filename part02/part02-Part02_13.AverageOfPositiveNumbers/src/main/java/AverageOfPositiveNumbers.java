
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int qt = 0;

        while (true) {
            System.out.println("Give a number");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            if (num < 0) {
                continue;
            }
            qt++;
            sum += num;
        }
        if (sum > 0) {
            System.out.println(sum / qt);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
