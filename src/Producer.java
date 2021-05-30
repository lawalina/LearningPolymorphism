import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Duck;
import Breeds.BreedsOfCats;
import Breeds.BreedsOfDogs;
import Breeds.BreedsOfDucks;
import Exceptions.EnumMessageException;
import Exceptions.NoBreedException;
import Exceptions.NullEqualsException;

public class Producer {
    public static void main(String[] args) throws NullEqualsException {

        try {
        Animal ayka = new Cat(0.30,5,90,true, BreedsOfCats.TURKISH_VAN,"Ayka");
        Animal sipsik = new Dog(0.35,7,200,true, BreedsOfDogs.CHIHUAHUA,"Sipsik");
        Animal strangeDuck = new Duck(0.5,1,1000,true, BreedsOfDucks.STRANGE, "StrangeDuck");

        printInfo(ayka);
        printInfo(sipsik);
        printInfo(strangeDuck);

        Animal dagon =  new Cat(0.5, 7,"Dagon");
        String additionalInformationAboutDagon = "This cat isn't afraid of water and loves to make a mess.";

        printInfo(dagon, additionalInformationAboutDagon);

        Animal[] animals= new Animal[]{ayka, sipsik, strangeDuck, dagon};

        for (Animal animal:animals){
            if (animal.getVoiceVolume() <= 0)
                throw new NullEqualsException ("Exception: no voice volume of " +animal.getName() + ".");
        }
        if (ayka.getBreed() == BreedsOfCats.UNBREEDED
                || sipsik.getBreed() == BreedsOfDogs.UNBREEDED
                || strangeDuck.getBreed() == BreedsOfDucks.UNBREEDED
                || dagon.getBreed() == BreedsOfCats.UNBREEDED)
            throw new NoBreedException("Exception: WARNING! Some animal has no breed.");
        }catch (NullEqualsException excp1){
            System.out.println(excp1);
        }
        catch (NoBreedException excp){
        System.out.println(excp);
        }

        try {
            BreedsOfCats.valueOf("Z");
        }catch (IllegalArgumentException excp){
        }finally {
            try{
                throw new EnumMessageException("Exception: Program will ignore that line.");
            }
            catch (EnumMessageException excp1){
                System.out.println(excp1.getMessage());
            }
        }

    }

    static void printInfo(Animal animal){

        animal.printInfo();
    }

    static void printInfo(Animal animal, String info){
        animal.printInfo(info);
    }
}
