public class CatFactory implements AbstractAnimalFactory {
    public Animal CreateAnimal() {
        return new Cat();
    }
    public Breeder CreateBreeder() {
        return new CatBreeder();
    }
}
