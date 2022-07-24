
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift");
        double giftVal = Double.valueOf(scan.nextLine());
        if (giftVal > 1_000_000) {
            System.out.println("Tax: " + (142_100 + (giftVal - 1_000_000) * 0.17));
        } else if (giftVal > 200_000) {
            System.out.println("Tax: " + (22_100 + (giftVal - 200_000) * 0.15));
        } else if (giftVal > 55_000) {
            System.out.println("Tax: " + (4_700 + (giftVal - 55_000) * 0.12));
        } else if (giftVal > 25_000) {
            System.out.println("Tax: " + (1_700 + (giftVal - 25_000) * 0.10));
        } else if (giftVal > 5000) {
            System.out.println("Tax: " + (100 + (giftVal - 5000) * 0.08));
        } else {
            System.out.println("No tax!");
        }
    }
}
