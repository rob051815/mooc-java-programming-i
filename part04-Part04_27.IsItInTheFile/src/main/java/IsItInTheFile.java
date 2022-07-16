
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean found = false;
        try {
            Scanner namesFile = new Scanner(Paths.get(file));
            while(namesFile.hasNextLine()) {
                String row = namesFile.nextLine();
                if(row.contains(searchedFor)) {
                    found = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        System.out.println(found ? "Found!" : "Not found.");
    }
}
