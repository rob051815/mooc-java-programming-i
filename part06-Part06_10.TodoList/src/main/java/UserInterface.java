
import java.util.Scanner;

public class UserInterface {
  private Scanner scan;
  private TodoList list;

  public UserInterface(TodoList list, Scanner scan) {
    this.scan = scan;
    this.list = list;
  }

  public void start() {
    while (true) {
      System.out.println("Command: ");
      String command = scan.nextLine();
      if (command.equals("stop")) {
        return;
      }
      if (command.equals("add")) {
        System.out.println("To add: ");
        String task = scan.nextLine();
        list.add(task);
        continue;
      }
      if (command.equals("list")) {
        list.print();
        continue;
      }
      if (command.equals("remove")) {
        System.out.println("Which one is removed? ");
        int ind = Integer.parseInt(scan.nextLine());
        list.remove(ind);
        continue;
      }
      System.out.println("Command " + command + " not found");
    }
  }
}
