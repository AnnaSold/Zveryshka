package Anna;

public class Cat extends Zveryushka implements Noisy {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void runAway() {
        System.out.println(this.name + " убегат");
    }

    @Override
    public void speak() {
        System.out.println("Мяу-мяу");

    }

    @Override
    public void beScarry() {
        System.out.println(this.name + "пугает");

    }
}
