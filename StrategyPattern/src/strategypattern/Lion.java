package strategypattern;

public class Lion implements Animal {
    private Behavior behavior;

    public Lion(Behavior behavior) {
        this.behavior = behavior;
    }

    @Override
    public void display() {
        System.out.println("Lion");
        behavior.perform();
    }
}