
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        if (file.isEmpty()) {
            return persons;
        }
        try {
            Scanner fileScan = new Scanner(Paths.get(file));
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                if(line.isEmpty()) {
                    continue;
                }
                String[] lineArr = line.split(",");
                String name = lineArr[0];
                int age = Integer.parseInt(lineArr[1]);
                persons.add(new Person(name, age));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        // and printing the read records
        for(Person p: persons) {
            System.out.println(p);
        }
        return persons;

    }
}
