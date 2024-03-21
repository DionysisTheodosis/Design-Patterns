package strategypattern;


public class SocialBehavior implements Behavior {

    @Override
    public void perform() {
        System.out.println("The animal is socializing...");
    }
    
}
