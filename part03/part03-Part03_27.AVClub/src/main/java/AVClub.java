
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine();

            if (str.equals("")) {
                break;
            }

            for (String word : str.split(" ")) {
                if (word.contains("av".toLowerCase())) {
                    System.out.println(word);
                }
            }
        }
    }
}