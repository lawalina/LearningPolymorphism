package Animals;

public class GenericAnimal<T extends Animal> {
    private T animal;

    public GenericAnimal(T animal) {
        this.animal = animal;
    }

    public void printInfo() {
        animal.printInfo();
    }

}
