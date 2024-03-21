package strategypattern;


public class Dog implements Animal {
    private Behavior behavior;

    public Dog(Behavior behavior) {
        this.behavior = behavior;
    }

    @Override
    public void display() {
        System.out.println("Dog");
        behavior.perform();
    }
}
