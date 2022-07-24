
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Write your program here -- consider breaking the program into
    // multiple classes.
    Points points = new Points();

    System.out.println("Enter point totals, -1 stops:");
    while (true) {
      int input = Integer.parseInt(scanner.nextLine());
      if(input == -1) {
        break;
      }
      points.addPoint(input);
    }
    System.out.println("Point average (all): " + points.pointsAverage());
    System.out.println("Point average (passing): " + points.pointsAveragePassing());
    System.out.println("Pass percentage: " + points.passingPercentage());
    points.gradeDistribution();
  }
}
