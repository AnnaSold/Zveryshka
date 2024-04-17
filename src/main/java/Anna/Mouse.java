package Anna;

public class Mouse extends Zveryushka {


    public Mouse(String name) {
        super(name);
    }

    @Override
    public void runAway() {
        System.out.println(this.name + " убегат");

    }

    @Override
    public void speak() {
        System.out.println("Пи-пи");

    }
}
