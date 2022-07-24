import java.util.Scanner;

public class UserInterface {
  private final Scanner scan;
  private final BirdDb birds;

  UserInterface(Scanner scan) {
    this.scan = scan;
    this.birds = new BirdDb();
  }

  public void start() {
    while (true) {
      System.out.println("? ");
      String command = scan.nextLine();
      if (command.equals("Quit")) {
        break;
      }
      if (command.equals("Add")) {
        addBird();
        continue;
      }
      if (command.equals("Observation")) {
        observeBird();
        continue;
      }
      if (command.equals("All")) {
        System.out.println(birds);
        continue;
      }
      if (command.equals("One")) {
        printBird();
      }
    }
  }

  public void addBird() {
    System.out.print("Name: ");
    String name = scan.nextLine();
    System.out.print("Name in Latin: ");
    String nameInLatin = scan.nextLine();
    this.birds.add(new Bird(name, nameInLatin));
  }

  public void printBird() {
    System.out.print("Bird? ");
    String birdName = scan.nextLine();
    Bird bird = birds.findBird(birdName);
    if (bird != null) {
      System.out.println(bird);
    }
  }

  public void observeBird() {
    System.out.print("Bird? ");
    String birdName = scan.nextLine();
    Bird bird = this.birds.findBird(birdName);
    if (bird != null) {
      bird.addObservation();
    }
  }
}
