import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scan = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();
        String option;
        while (true) {
            String title;
            int pages, publicationYear;

            System.out.println("Title: ");
            title = scan.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            pages = Integer.parseInt(scan.nextLine());

            System.out.println("Publication year: ");
            publicationYear = Integer.parseInt(scan.nextLine());

            books.add(new Book(title, pages, publicationYear));
        }

        System.out.println("What information will be printed?");
        option = scan.nextLine();
        if (option.equals("everything")) {
            for (Book b : books) {
                System.out.println(b);
            }
        }
        if (option.equals("name")) {
            for (Book b: books) {
                System.out.println(b.getName());
            }
        }
    }
}
