package Factory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal1 = animalFactory.getAnimal("Birds");
        animal1.animalDoes();
        Animal animal2 = animalFactory.getAnimal("Fish");
        animal2.animalDoes();
    }
}
