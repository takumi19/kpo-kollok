public class DogFactory implements AbstractAnimalFactory {
    public Animal CreateAnimal() {
        return new Dog();
    }
    public Breeder CreateBreeder() {
        return new DogBreeder();
    }
}
