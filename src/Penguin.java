public class Penguin extends Bird implements Dancable{
    @Override
    public void dance() {
        System.out.println("Penguin dance");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin makeSound");
    }
}
