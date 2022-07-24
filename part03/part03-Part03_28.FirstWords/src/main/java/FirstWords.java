
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String phrase = scanner.nextLine();
            if(phrase.equals("")) {
                break;
            }
            System.out.println(phrase.split(" ")[0]);
        }
    }
}
