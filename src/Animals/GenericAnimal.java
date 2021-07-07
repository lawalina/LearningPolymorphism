package Animals;

public class GenericAnimal<T extends Animal> implements Comparable<GenericAnimal> {
    private T animal;

    public GenericAnimal(T animal) {
        this.animal = animal;
    }

    public void printInfo() {
        animal.printInfo();
    }

    @Override
    public int compareTo(GenericAnimal genericAnimal) {
        return this.animal.compareTo(genericAnimal.animal);
    }
}
