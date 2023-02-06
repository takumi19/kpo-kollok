public class App {
    public static void main(String[] args) {
        AbstractAnimalFactory dgf = new DogFactory();
        Breeder dgb = dgf.CreateBreeder();
        Animal dg = dgf.CreateAnimal();
        AbstractAnimalFactory ctf = new CatFactory();
        Breeder ctb = ctf.CreateBreeder();
        Animal ct = ctf.CreateAnimal();
        ct.MakeSound();
        dg.MakeSound();
        ctb.Breed();
        dgb.Breed();
    }
}
