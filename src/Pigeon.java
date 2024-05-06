public class Pigeon extends Bird implements Flyable, Dancable{
    @Override
    public void dance() {
        System.out.println("Pigeon dance");
    }

    @Override
    public void fly() {
        System.out.println("Pigeon fly");
    }

    @Override
    public void makeSound() {
        System.out.println("Pigeon makeSound");
    }
}
