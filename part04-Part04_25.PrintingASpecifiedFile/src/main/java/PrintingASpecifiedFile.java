
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String file = scanner.nextLine();

        try {
            Scanner userFile = new Scanner(Paths.get(file));
            while(userFile.hasNextLine()) {
                System.out.println(userFile.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
