public class Container {

  private static final int capacity = 100;
  private int content;

  public Container() {
    this.content = 0;
  }

  public int contains() {
    return this.content;
  }

  public void add(int amount) {
    if (Integer.signum(amount) == -1) {
      return;
    }
    if (this.content + amount > 100) {
      this.content = 100;
      return;
    }
    this.content += amount;
  }

  public void remove(int amount) {
    if (Integer.signum(amount) == -1) {
      return;
    }
    if (this.content - amount < 0) {
      this.content = 0;
      return;
    }
    this.content -= amount;
  }

  public void moveTo(Container recipient, int amount) {
    if(Integer.signum(amount) == -1) {
      return;
    }
    if(amount > this.content) {
      amount = this.content;
    }
    this.remove(amount);
    recipient.add(amount);
  }

  @Override
  public String toString() {
    return this.content + "/100";
  }
}

