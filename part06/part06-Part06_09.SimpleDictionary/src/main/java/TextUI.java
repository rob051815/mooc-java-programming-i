import java.util.Scanner;

public class TextUI {
  private Scanner scan;
  private SimpleDictionary dictionary;

  public TextUI(Scanner scan, SimpleDictionary dictionary) {
    this.scan = scan;
    this.dictionary = dictionary;
  }

  public void start() {
    while(true) {
      System.out.println("Command: ");
      String command = scan.nextLine();

      if(command.equals("end")) {
        System.out.println("Bye bye!");
        return;
      }
      if(command.equals("add")) {
        System.out.println("Word: ");
        String word = scan.nextLine();
        System.out.println("Translation: ");
        String translation = scan.nextLine();
        dictionary.add(word, translation);
        continue;
      }
      if(command.equals("search")) {
        System.out.println("Word: ");
        String query = scan.nextLine();
        String result = dictionary.translate(query);
        if(result == null) {
          System.out.println("Word " + query + " was not found");
          continue;
        }
        System.out.println(result);
        continue;
      }
      System.out.println("Unknown command");
    }
  }
}
