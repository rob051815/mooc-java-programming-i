import java.util.Scanner;

public class UserInterface {
  private Container container1;
  private Container container2;
  private Scanner scan;

  public UserInterface(Scanner scan) {
    this.scan = scan;
    this.container1 = new Container();
    this.container2 = new Container();
  }

  public void start() {
    while (true) {
      System.out.println("First: " + container1);
      System.out.println("Second: " + container2);

      String input = scan.nextLine().trim();
      if (input.equals("quit")) {
        break;
      }

      String command = input.split(" ")[0];
      int amount = Integer.parseInt(input.split(" ")[1]);

      if (command.equals("add")) {
        container1.add(amount);
        continue;
      }
      if (command.equals("remove")) {
        container2.remove(amount);
        continue;
      }
      if (command.equals("move")) {
        container1.moveTo(container2, amount);
      }
    }
  }
}
