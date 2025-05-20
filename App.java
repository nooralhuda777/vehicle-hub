public class App {
  public static void main(String[] args) {
    System.out.println("The car is: ");
    Car car = new Car("Honda", "Civic", 2020, 4);
    car.describe();
    car.startEngine();
    car.honk();
    System.out.println("The bike is: ");
    Bike bike = new Bike("Honda", "Goldend Wing Tour", 2024, "Motorcycle");
    bike.startEngine();
    bike.describe();
    bike.ringBell();

    
    
  }
}
