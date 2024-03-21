package decoratorpattern;

//Class that implements the beverage abstract class
public class EspressoBeverage extends Beverage{
    //Declaration of the properties for espresso beverage
    private double price;
    private String beverageName;
    
    //Initialize the properties
    public EspressoBeverage(double price){
        this.price = price;
        this.beverageName = "Espresso";
        
    }
    
    /*Return the properties values by overriding the methods
    of the abstract class Beverage*/ 
    @Override
    public double cost() {
        return this.price;
    }

    @Override
    public String description() {
        return this.beverageName;
    }
}
