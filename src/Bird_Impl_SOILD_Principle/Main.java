package Bird_Impl_SOILD_Principle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Penguin bird1 = new Penguin();
         bird1.dance();
         bird1.makeSound();
        Pigeon bird2 = new Pigeon();
        bird2.dance();
        bird2.fly();
        bird2.makeSound();
    }
}
