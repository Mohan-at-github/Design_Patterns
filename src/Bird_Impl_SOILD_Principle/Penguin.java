package Bird_Impl_SOILD_Principle;

public class Penguin extends Bird implements Dancable {
    @Override
    public void dance() {
        System.out.println("Bird_Impl_SOILD_Principle.Penguin dance");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird_Impl_SOILD_Principle.Penguin makeSound");
    }
}
