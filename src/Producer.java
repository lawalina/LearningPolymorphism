import Animals.*;
import Breeds.BreedsOfCats;
import Breeds.BreedsOfDogs;
import Breeds.BreedsOfDucks;
import Exceptions.EnumMessageException;
import Exceptions.NoBreedException;
import Exceptions.NullEqualsException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Producer {
    public static void main(String[] args) throws NullEqualsException {

        try {
            Animal ayka = new Cat(0.30, 5, 90, true, BreedsOfCats.TURKISH_VAN, "Ayka", null);
            Animal sipsik = new Dog(0.35, 7, 200, true, BreedsOfDogs.CHIHUAHUA, "Sipsik", null);
            Animal strangeDuck = new Duck(0.5, 1, 1000, true, BreedsOfDucks.STRANGE, "StrangeDuck", null);

            String additionalInformationAboutDagon = "This cat isn't afraid of water and loves to make a mess.";
            Animal dagon = new Cat(0.5, 7, "Dagon", additionalInformationAboutDagon);

            //Vector

            Vector animalVector = new Vector();

            animalVector.add(ayka);
            animalVector.add(sipsik);
            animalVector.add(strangeDuck);
            animalVector.add(dagon);

            Vector<GenericAnimal> animalVectorGenerics = new Vector<>();

            for (int i = 0; i < animalVector.size(); i++)
                animalVectorGenerics.add(new GenericAnimal ((Animal) animalVector.get(i)));

            System.out.println("");
            System.out.println("This is a Vector!");
            System.out.println("");

            for (GenericAnimal<Animal> animalVectorGeneric : animalVectorGenerics){
                animalVectorGeneric.printInfo();
            }

            //LinkedList
            LinkedList animalLinkedList = new LinkedList();

            animalLinkedList.add(ayka);
            animalLinkedList.add(sipsik);
            animalLinkedList.add(strangeDuck);
            animalLinkedList.add(dagon);

            LinkedList<GenericAnimal> animalLinkedListGenerics = new LinkedList<>();

            for (int i = 0; i < animalLinkedList.size(); i++)
                animalLinkedListGenerics.add(new GenericAnimal ((Animal) animalLinkedList.get(i)));

            System.out.println("");
            System.out.println("This is a Linked List!");
            System.out.println("");

            for (GenericAnimal<Animal> animalLinkedListGeneric : animalLinkedListGenerics){
                animalLinkedListGeneric.printInfo();
            }

            //ArrayList
            ArrayList animalsArrayList = new ArrayList();

            animalsArrayList.add(ayka);
            animalsArrayList.add(sipsik);
            animalsArrayList.add(strangeDuck);
            animalsArrayList.add(dagon);

            ArrayList<GenericAnimal> animalsArrayListGenerics = new ArrayList<>();

            for (int i = 0; i < animalsArrayList.size(); i++)
                animalsArrayListGenerics.add(new GenericAnimal ((Animal) animalsArrayList.get(i)));

            System.out.println("");
            System.out.println("This is a Array List!");
            System.out.println("");

            for (GenericAnimal<Animal> animalsArrayListGeneric : animalsArrayListGenerics){
                animalsArrayListGeneric.printInfo();
            }

            //Simple Array
            Animal[] animals = new Animal[]{ayka, sipsik, strangeDuck, dagon};

            GenericAnimal<Animal>[] animalGenerics = new GenericAnimal[animals.length];

            for (int i = 0; i < animals.length; i++)
                animalGenerics[i] = new GenericAnimal<>(animals[i]);

            System.out.println("");
            System.out.println("This is a simple Array!");
            System.out.println("");

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
