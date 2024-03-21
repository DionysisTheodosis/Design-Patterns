
package strategypattern;


public class Dolphin implements Animal {
    private Behavior behavior;

    public Dolphin(Behavior behavior) {
        this.behavior = behavior;
    }

    @Override
    public void display() {
        System.out.println("Dolphin");
        behavior.perform();
    }
}
