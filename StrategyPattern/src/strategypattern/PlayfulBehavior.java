
package strategypattern;

public class PlayfulBehavior implements Behavior {

    @Override
    public void perform() {
        System.out.println("The animal is playing...");
    }
    
}
