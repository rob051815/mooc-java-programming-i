import java.util.ArrayList;
import java.util.Arrays;

public class Points {
  private ArrayList<Integer> points;

  public Points() {
    this.points = new ArrayList<>();
  }

  public boolean isValidGrade(int point) {
    return point >= 0 && point <= 100;
  }

  public void addPoint(int point) {
    if (isValidGrade(point)) {
      this.points.add(point);
    }
  }

  public double pointsAverage() {
    double sum = 0;
    for (int point : points) {
      sum += point;
    }
    return sum / points.size();
  }

  public boolean isPassingGrade(int point) {
    return point >= 50;
  }

  public double pointsAveragePassing() {
    double sum = 0;
    int passing = 0;
    for (int point : points) {
      if (isPassingGrade(point)) {
        sum += point;
        passing++;
      }
    }
    if (sum == 0) {
      return -1;
    }
    return sum / passing;
  }

  public double passingPercentage() {
    double sum = 0;
    for (int point : points) {
      if (isPassingGrade(point)) {
        sum++;
      }
    }
    return 100 * sum / points.size();
  }

  public void gradeDistribution() {
    int[] stars = new int[6];
    Arrays.fill(stars, 0);

    System.out.println("Grade distribution:");
    for (int point : points) {
      if (point >= 90) {
        stars[5]++;
        continue;
      }
      if (point >= 80) {
        stars[4]++;
        continue;
      }
      if (point >= 70) {
        stars[3]++;
        continue;
      }
      if (point >= 60) {
        stars[2]++;
        continue;
      }
      if (point >= 50) {
        stars[1]++;
        continue;
      }
      stars[0]++;
    }
    for(int i = stars.length - 1; i >= 0; i--) {
      System.out.print(i + ": ");
      for(int j = 0; j < stars[i]; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
