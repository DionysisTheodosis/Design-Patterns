package strategypattern;


public class HuntingBehavior implements Behavior {

    @Override
    public void perform() {
        System.out.println("The animal is hunting.");
    }
    
}
