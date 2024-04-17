package Anna;

import Anna.Cat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурка");
        Mouse mouse = new Mouse("Микки");
        Dog dog = new Dog("Полкан");
        mouse.getScared(cat);
        cat.getScared(dog);
        dog.getScared(new Noisy() {

                          @Override
                          public void beScarry() {
                              System.out.println(" пугает");
                          }
                      }
        );


    }
}