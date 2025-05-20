public class Car extends Vehicle{
  private int numberOfDoors;
  


public Car(String maker, String model, int year, int numberOfDoors) {
  super(maker, model, year);
  this.numberOfDoors = numberOfDoors;
}
//getter
public int getNumberOfDoors() {
  return numberOfDoors;
}
//setter
public void setNumberOfDoors(int numberOfDoors) {
  this.numberOfDoors = numberOfDoors;}

  public void describe() {
    System.out.println("This is a " + this.getYear() + " " + this.getMaker() + " " + this.getModel() + " with " + this.getNumberOfDoors() + " doors.");
  }
  public void honk(){
    System.out.println("Car is honking!");
  }
    


}