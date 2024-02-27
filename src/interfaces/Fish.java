package interfaces;

public class Fish implements Both {
    @Override
    public void flee() {
        System.out.println("im fleeing from smaller fish!");
    }

    @Override
    public void hunt() {
        System.out.println("I am hunting bigger fish!");
    }

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
