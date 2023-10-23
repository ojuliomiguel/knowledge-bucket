package Java.Basic.OPP.Vehicle;

public class Car implements Vehicle {

  @Override
  public void speedUp() {
    System.out.println("Speeding up celtinha!");
  }

  @Override
  public void brake() {
       System.out.println("Braking celtinha!");
  }
  
}
