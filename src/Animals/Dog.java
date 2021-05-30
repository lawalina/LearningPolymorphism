package Animals;

import Breeds.BreedsOfDogs;
import Exceptions.NoBreedException;
import Exceptions.NullEqualsException;

public class Dog extends Animal {

    private BreedsOfDogs breed;

    @Override
    public BreedsOfDogs getBreed() {
        return breed;
    }

    public Dog (){
        this.height=0.5;
        this.weight=7;
        this.voiceVolume=70;
        this.haveWool=true;
        this.breed=BreedsOfDogs.UNBREEDED;
        this.name="No name";
    }

    public Dog (double Height, double Weight, String name){
        this();
        this.height=Height;
        this.weight=Weight;
        this.name=name;
    }

    public Dog (double Height, double Weight, int VoiceVolume, String name){
        this(Height, Weight, name);
        this.voiceVolume=VoiceVolume;
    }

    public Dog (double Height, double Weight, boolean haveWool, String name){
        this(Height, Weight, name);
        this.haveWool=haveWool;
    }

    public Dog (double Height, double Weight, int VoiceVolume, boolean haveWool, String name){
        this(Height, Weight, name);
        this.voiceVolume=VoiceVolume;
        this.haveWool=haveWool;
    }


    public Dog(double Height, double Weight, int VoiceVolume, boolean haveWool, BreedsOfDogs breed, String name){
        this(Height, Weight, VoiceVolume, haveWool, name);
        this.breed=breed;
    }

    @Override
    public void printInfo() {

        System.out.println("This is " + getName() + ". It's a Dog.");
        System.out.println();
        System.out.println("Dog height is " + getHeight() + ".");
        System.out.println("Dog weight is " + getWeight() + ".");

        if(isHaveWool())
            System.out.println("This is a hairy dog.");
        else
            System.out.println("The dog has no wool.");

        System.out.println("Dog volume is " + getVoiceVolume() + ".");
        System.out.println("This dog is a " + breed.getNameToPrint() + ".");
        System.out.println();

    }

    @Override
    public void printInfo(String additionalInformation){
        printInfo();
        System.out.println("Additional information: " + additionalInformation);
        System.out.println();
    }

}