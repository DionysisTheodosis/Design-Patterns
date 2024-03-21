package strategypattern;


public class StrategyPattern {

   
    public static void main(String[] args) {
       // Creating instances of objects type Animal with different behaviors
        Animal dog = new Dog(new PlayfulBehavior());
        Animal lion = new Lion(new HuntingBehavior());
        Animal dolphin = new Dolphin(new SocialBehavior());

        // Displaying animals and their behaviors
        dog.display();
        lion.display();
        dolphin.display();
    }
    
}
