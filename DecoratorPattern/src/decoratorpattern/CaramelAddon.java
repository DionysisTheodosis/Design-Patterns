package decoratorpattern;

//Class that implements the decorator abstract class
public class CaramelAddon extends AddonDecorator{
    //Declaration of an Beverage object (To make to (has-a) rellationship 
    Beverage beverage;
    
    //Initialize the properties
    public CaramelAddon(Beverage beverage){
        this.beverage = beverage;
    }
    
    //Return the properties values by overriding the methods of the abstract class Beverage 
    @Override
    public double cost() {
       return (this.beverage.cost() + 0.5);
    }

    @Override
    public String description() {
          return (this.beverage.description() + " + Caramel flavour.");
    }
    
}
