package decoratorpattern;

/*Main Class that implements the decorator pattern.
To give different flavours in a beverage*/
public class DecoratorPattern {

    public static void main(String[] args) {
        
      //Making a simple beverage object 
      Beverage beverage = new EspressoBeverage(2.0);
      System.out.println("Beverage: "+beverage.description()+"\nCost: "+beverage.cost()+"€");
      System.out.println("Adding Caramel flavour in espresso");
      
      //Making a decorator object for the beverage object
      beverage = new CaramelAddon(beverage);
      System.out.println("Beverage: "+beverage.description()+"\nCost: "+beverage.cost()+"€");
    }
    
}
