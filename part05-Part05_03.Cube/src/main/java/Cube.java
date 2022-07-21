public class Cube {
  private int edgeLengh;

  public Cube(int edgeLengh) {
    this.edgeLengh = edgeLengh;
  }

  public int volume() {
    return this.edgeLengh * this.edgeLengh * this.edgeLengh;
  }

  @Override
  public String toString() {
    return "The length of the edge is " + this.edgeLengh + " and the volume " + this.volume();
  }
}
