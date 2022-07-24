import java.util.ArrayList;

public class Hold {
  private final ArrayList<Suitcase> suitcases;
  private final int maxWeight;

  public Hold(int maxWeight) {
    this.maxWeight = maxWeight;
    this.suitcases = new ArrayList<>();
  }

  public int totalWeight() {
    int sum = 0;
    for(Suitcase suitcase: suitcases) {
      sum += suitcase.totalWeight();
    }
    return sum;
  }

  private boolean canAddWeight(int weight) {
    return this.totalWeight() + weight <= maxWeight;
  }

  @Override
  public String toString() {
    return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
  }

  public void addSuitcase(Suitcase suitcase) {
    if(canAddWeight(suitcase.totalWeight())) {
      suitcases.add(suitcase);
    }
  }

  public void printItems() {
    for(Suitcase suitcase: suitcases) {
      suitcase.printItems();
    }
  }
}
