package Anna;

public class Dog extends Zveryushka implements Noisy {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void runAway() {
        System.out.println(this.name + " убегат");
    }

    @Override
    public void speak() {
        System.out.println("Гав-гав");

    }

    @Override
    public void beScarry() {
        System.out.println(this.name + "пугает");

    }
}
