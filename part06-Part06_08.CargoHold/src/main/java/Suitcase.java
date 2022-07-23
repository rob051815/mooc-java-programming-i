import java.util.ArrayList;

public class Suitcase {
  private ArrayList<Item> items;
  private int maxWeight;


  public Suitcase(int maxWeight) {
    this.items = new ArrayList<>();
    this.maxWeight = maxWeight;
  }

  public boolean canAddWeight(int weight) {
    return totalWeight() + weight <= maxWeight;
  }

  public void addItem(Item item) {
    if(canAddWeight(item.getWeight())) {
      items.add(item);
    }
  }

  public int totalWeight() {
    int sum = 0;
    for(Item item: items) {
      sum += item.getWeight();
    }
    return sum;
  }

  public boolean isSuitcaseEmpty() {
    return this.items.size() == 0;
  }

  @Override
  public String toString() {
    if(isSuitcaseEmpty()) {
      return "no items (0 kg)";
    }
    if(this.items.size() == 1) {
      return "1 item (" + this.items.get(0).getWeight() + " kg)";
    }
    return this.items.size() + " items (" + this.totalWeight() + " kg)";
  }

  public void printItems() {
    for(Item item: items) {
      System.out.println(item);
    }
  }

  public Item heaviestItem() {
    if(isSuitcaseEmpty()) {
      return null;
    }
    Item heaviest = this.items.get(0);
    for(int i = 1; i < this.items.size(); i++) {
      Item cur = this.items.get(i);
      if(cur.getWeight() > heaviest.getWeight()) {
        heaviest = cur;
      }
    }
    return heaviest;
  }


}
