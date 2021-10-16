import java.util.Random;

public class Die{

  private int sides;
  private int value;

  public Die(int sides) {
    setSides(sides);
    value = 1;
  }// end of Constructor

  public int getSides() {
    return sides;
  }
  
  public int getValue() {
    return value;
  }
  
  public void setSides(int sides) {
    this.sides = sides; 
  }

  public void setValue(int value) {
    this.value = value;
  }

  public void roll() {
    Random rand = new Random();
    value = rand.nextInt(sides) + 1; //plus one is to account for starting at 0
  }
}// end of Die