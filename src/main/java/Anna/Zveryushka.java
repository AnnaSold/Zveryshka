package Anna;

public abstract class Zveryushka {
    String name;

    public Zveryushka(String name) {
        this.name = name;
    }

    public abstract  void runAway();
    public abstract  void speak();
 public void getScared(Noisy z){
     System.out.println(z + " пугает " + this.name);
     speak();
     runAway();

 }

    @Override
    public String toString() {
        return "Zveryushka{" +
                "name='" + name + '\'' +
                '}';
    }
}
