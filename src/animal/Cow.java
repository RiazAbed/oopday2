package animal;

public class Cow extends LandAnimal implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Mooo");
    }
}
