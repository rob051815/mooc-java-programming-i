import java.util.ArrayList;

public class Room {
  private ArrayList<Person> persons;

  public Room() {
    this.persons = new ArrayList<>();
  }

  public void add(Person person) {
    persons.add(person);
  }

  public boolean isEmpty() {
    return this.persons.size() == 0;
  }

  public ArrayList<Person> getPersons() {
    return this.persons;
  }

  public Person shortest() {
    if (isRoomEmpty()) {
      return null;
    }
    Person shortest = this.persons.get(0);
    for (int i = 1; i < this.persons.size(); i++) {
      Person cur = this.persons.get(i);
      if (shortest.getHeight() > cur.getHeight()) {
        shortest = cur;
      }
    }
    return shortest;
  }

  public Person take() {
    if(isRoomEmpty()) {
      return null;
    }
    Person shortest = this.shortest();
    persons.remove(shortest);
    return shortest;
  }

  private boolean isRoomEmpty() {
    return this.persons.size() == 0;
  }
}
