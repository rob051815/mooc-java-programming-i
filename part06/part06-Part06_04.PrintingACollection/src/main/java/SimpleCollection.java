
import java.util.ArrayList;

public class SimpleCollection {

  private String name;
  private ArrayList<String> elements;

  public SimpleCollection(String name) {
    this.name = name;
    this.elements = new ArrayList<>();
  }

  public void add(String element) {
    this.elements.add(element);
  }

  public ArrayList<String> getElements() {
    return this.elements;
  }

  @Override
  public String toString() {
    StringBuilder output = new StringBuilder("The collection " + this.name);
    if(elements.isEmpty()) {
      return output + " is empty.";
    }
    output.append(" has ");
    if(elements.size() == 1) {
      output.append(String.format("1 element:\n%s", elements.get(0)));
      return output.toString();
    }
    output.append(String.format("%d elements:\n", elements.size()));
    for(String el: elements) {
      output.append(String.format("%s\n", el));
    }
    return output.toString();
  }
}
