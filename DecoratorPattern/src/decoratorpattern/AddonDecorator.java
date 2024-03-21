package decoratorpattern;

//Decleration of the  decorator class
public abstract class AddonDecorator extends Beverage {
    
    /*Implementation of the methods of the extendes abstract class beverage 
    and declare them as abstract because we want to implement them in another
    class*/
    @Override
    public abstract double cost();
    @Override
    public abstract String description();
}
