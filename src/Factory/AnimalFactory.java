package Factory;

public class AnimalFactory {
    public Animal getAnimal(String animalType){
        if(animalType.equalsIgnoreCase("Birds")){
            return new Birds();
        }else if (animalType.equalsIgnoreCase("Fish")){
            return new Fish();
        }else {
            throw new RuntimeException("Unknown type of animal");
        }
    }
}
