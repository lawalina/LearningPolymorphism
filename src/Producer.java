import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Duck;
import Breeds.BreedsOfCats;
import Breeds.BreedsOfDogs;
import Breeds.BreedsOfDucks;
import Exceptions.EnumMessageException;

public class Producer {
    public static void main(String[] args) {

        Animal ayka = new Cat(0.30,5,90,true, BreedsOfCats.TURKISH_VAN);
        Animal sipsik = new Dog(0.35,7,200,true, BreedsOfDogs.CHIHUAHUA);
        Animal strangeDuck = new Duck(0.5,1,1000,true, BreedsOfDucks.STRANGE);

        printInfo(ayka);
        printInfo(sipsik);
        printInfo(strangeDuck);

        Animal dagon =  new Cat(0.5, 7);
        String additionalInformationAboutDagon = "This cat isn't afraid of water and loves to make a mess.";
        printInfo(dagon, additionalInformationAboutDagon);

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
