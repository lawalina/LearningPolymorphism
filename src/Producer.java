import Animals.*;
import Breeds.BreedsOfCats;
import Breeds.BreedsOfDogs;
import Breeds.BreedsOfDucks;
import Exceptions.EnumMessageException;
import Exceptions.NoBreedException;
import Exceptions.NullEqualsException;

public class Producer {
    public static void main(String[] args) throws NullEqualsException {

        try {
            Animal ayka = new Cat(0.30, 5, 90, true, BreedsOfCats.TURKISH_VAN, "Ayka", null);
            Animal sipsik = new Dog(0.35, 7, 200, true, BreedsOfDogs.CHIHUAHUA, "Sipsik", null);
            Animal strangeDuck = new Duck(0.5, 1, 1000, true, BreedsOfDucks.STRANGE, "StrangeDuck", null);

            String additionalInformationAboutDagon = "This cat isn't afraid of water and loves to make a mess.";
            Animal dagon = new Cat(0.5, 7, "Dagon", additionalInformationAboutDagon);

            Animal[] animals = new Animal[]{ayka, sipsik, strangeDuck, dagon};

            GenericAnimal<Animal>[] animalGenerics = new GenericAnimal[animals.length];

            for (int i = 0; i < animals.length; i++)
                animalGenerics[i] = new GenericAnimal<>(animals[i]);

            for (GenericAnimal<Animal> animalGeneric : animalGenerics) {
                animalGeneric.printInfo();
            }


            for (Animal animal : animals) {
                if (animal.getVoiceVolume() <= 0)
                    throw new NullEqualsException("Exception: no voice volume of " + animal.getName() + ".");
            }
            if (ayka.getBreed() == BreedsOfCats.UNBREEDED
                    || sipsik.getBreed() == BreedsOfDogs.UNBREEDED
                    || strangeDuck.getBreed() == BreedsOfDucks.UNBREEDED
                    || dagon.getBreed() == BreedsOfCats.UNBREEDED)
                throw new NoBreedException("Exception: WARNING! Some animal has no breed.");
        } catch (NullEqualsException excp1) {
            System.out.println(excp1);
        } catch (NoBreedException excp) {
            System.out.println(excp);
        }

        try {
            BreedsOfCats.valueOf("Z");
        } catch (IllegalArgumentException excp) {
        } finally {
            try {
                throw new EnumMessageException("Exception: Program will ignore that line.");
            } catch (EnumMessageException excp1) {
                System.out.println(excp1.getMessage());
            }
        }

    }

    static void printInfo(Animal animal) {

        animal.printInfo();
    }
}
