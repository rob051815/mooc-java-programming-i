
public class Apartment {

  private int rooms;
  private int squares;
  private int princePerSquare;

  public Apartment(int rooms, int squares, int pricePerSquare) {
    this.rooms = rooms;
    this.squares = squares;
    this.princePerSquare = pricePerSquare;
  }

  public int price() {
    return this.princePerSquare * this.squares;
  }
  public boolean largerThan(Apartment compared) {
    return this.squares  > compared.squares;
  }

  public int priceDifference(Apartment compared) {
    if(this.largerThan(compared)) {
      return this.price() - compared.price();
    }
    return compared.price() - this.price();
  }

  public boolean moreExpensiveThan(Apartment compared) {
    return this.largerThan(compared) && this.priceDifference(compared) > 0;
  }
}
