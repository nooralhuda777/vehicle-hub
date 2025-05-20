public class Vehicle {
private String maker;
private String model;
private int year;

public Vehicle(String maker, String model, int year) {
  this.maker = maker;
  this.model = model;
  this.year = year;


}

//getters
public String getMaker() {
  return maker;
}

public String getModel() {
  return model;
}

public int getYear() {
  return year;
}
//setters

public void setMaker(String maker) {
  this.maker = maker;
}

public void setModel(String model) {
  this.model = model;
}

public void setYear(int year) {
  this.year = year;
}

//methods
public void describe(){
  System.out.println("This is a " + this.getYear() + " " + this.getMaker() + " " + this.getModel() + ".");  
}

public void startEngine(){
  System.out.println("Engine has started");}


}