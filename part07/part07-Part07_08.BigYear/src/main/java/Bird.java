public class Bird {
  private String name, nameInLatin;
  private int observations;

  public Bird(String name, String nameInLatin) {
    this.name = name;
    this.nameInLatin = nameInLatin;
  }

  @Override
  public String toString() {
    return this.name + "(" + nameInLatin + "): " + this.observations + " observations";
  }

  public void addObservation() {
    this.observations++;
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj) {
      return true;
    }
    if(!(obj instanceof Bird)) {
      return false;
    }
    Bird b = (Bird) obj;
    return this.name.equals(b.name) && this.nameInLatin.equals(b.nameInLatin);
  }

  public String getName() {
    return name;
  }
}
