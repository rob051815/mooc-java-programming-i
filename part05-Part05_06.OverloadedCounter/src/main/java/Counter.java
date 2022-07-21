public class Counter {
  private int value;

  public Counter(int startValue) {
    this.value = startValue;
  }

  public Counter() {
    this(0);
  }

  public int value() {
    return this.value;
  }

  public void increase() {
    this.increase(1);
  }

  public void decrease() {
    this.decrease(1);
  }

  public void increase(int increaseBy) {
    if(Integer.signum(increaseBy) == 1) {
    this.value += increaseBy;
    }
  }

  public void decrease(int decreaseBy) {
    if(Integer.signum(decreaseBy) == 1){
    this.value -= decreaseBy;
    }
  }
}
