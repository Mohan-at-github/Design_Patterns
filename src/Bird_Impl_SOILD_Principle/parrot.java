package Bird_Impl_SOILD_Principle;

public class parrot extends Bird implements Flyable, Dancable {
    @Override
    public void makeSound() {
        System.out.println("Parrot Sound");
    }

    @Override
    public void dance() {
        System.out.println("Parrot Dance");
    }

    @Override
    public void fly() {
        System.out.println("Parrot Fly");
    }
}
