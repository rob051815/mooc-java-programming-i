
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        try {
            Scanner scanFile = new Scanner(Paths.get(file));
            while(scanFile.hasNextLine()) {
                String[] rowArr = scanFile.nextLine().split(",");
                String name = rowArr[0];
                int age = Integer.parseInt(rowArr[1]);

                System.out.println(name + ", age: " + age + (age != 1 ? " years" : " year"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
