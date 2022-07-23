import java.util.ArrayList;

public class Stack {
  private ArrayList<String> strList;

  public Stack() {
    this.strList = new ArrayList<>();
  }

  public boolean isEmpty() {
    return strList.isEmpty();
  }

  public void add(String value) {
    strList.add(value);
  }

  public ArrayList<String> values() {
    return this.strList;
  }

  public String take() {
    int topInd = strList.size() - 1;
    String topValue = strList.get(topInd);
    strList.remove(topInd);
    return topValue;
  }
}
