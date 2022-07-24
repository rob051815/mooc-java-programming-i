import java.util.ArrayList;

public class BirdDb {
  private ArrayList<Bird> birds;

  public BirdDb() {
    this.birds = new ArrayList<>();
  }

  public void add(Bird bird) {
    this.birds.add(bird);
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    for (Bird bird : this.birds) {
      output.append(bird).append("\n");
    }
    return output.toString();
  }

  public Bird findBird(String searchedBird) {
    for (Bird b : this.birds) {
      if (b.getName().equals(searchedBird)) {
        return b;
      }
    }
    return null;
  }
}