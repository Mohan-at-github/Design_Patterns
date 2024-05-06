package Bird_Impl_SOILD_Principle;

public class Pigeon extends Bird implements Flyable, Dancable {
    @Override
    public void dance() {
        System.out.println("Bird_Impl_SOILD_Principle.Pigeon dance");
    }

    @Override
    public void fly() {
        System.out.println("Bird_Impl_SOILD_Principle.Pigeon fly");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird_Impl_SOILD_Principle.Pigeon makeSound");
    }
}
