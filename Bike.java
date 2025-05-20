public class Bike extends Vehicle{
private String type;

public Bike(String maker, String model, int year, String type){
  super(maker, model, year);
  this.type = type;
}
//getter

public String getType() {
  return type;
}
//setter
public void setType(String type) {
  this.type = type;
}
//methods
public void describe(){
  System.out.println("This is a " + this.getYear() + " " + this.getMaker() + " " + this.getModel() + " " + this.getType() + ".");}

  public void ringBell(){
    System.out.println("Bike bell is ringing!");
  }



}
