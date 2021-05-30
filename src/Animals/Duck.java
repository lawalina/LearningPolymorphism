package Animals;

import Breeds.BreedsOfDucks;
import Exceptions.NoBreedException;
import Exceptions.NullEqualsException;

public class Duck extends Animal {

    private BreedsOfDucks breed;

    @Override
    public BreedsOfDucks getBreed() {
        return breed;
    }

    public Duck (){
        this.height=0.3;
        this.weight=3;
        this.voiceVolume=70;
        this.haveWool=false;
        this.breed=BreedsOfDucks.UNBREEDED;
        this.name="No name";
    }

    public Duck (double Height, double Weight, String name){
        this();
        this.height=Height;
        this.weight=Weight;
        this.name=name;
    }

    public Duck (double Height, double Weight, int VoiceVolume, String name){
        this(Height, Weight, name);
        this.voiceVolume=VoiceVolume;
    }

    public Duck (double Height, double Weight, boolean haveWool, String name){
        this(Height, Weight, name);
        this.haveWool=haveWool;
    }

    public Duck (double Height, double Weight, int VoiceVolume, boolean haveWool, String name){
        this(Height, Weight, name);
        this.voiceVolume=VoiceVolume;
        this.haveWool=haveWool;
    }


    public Duck (double Height, double Weight, int VoiceVolume, boolean haveWool, BreedsOfDucks breed, String name){
        this(Height, Weight, VoiceVolume, haveWool, name);
        this.breed=breed;
    }

    @Override
    public void printInfo() {

        System.out.println("This is " + getName() + ". It's a duck.");
        System.out.println();
        System.out.println("Duck height is " + getHeight() + ".");
        System.out.println("Duck weight is " + getWeight() + ".");

        if(isHaveWool())
            System.out.println("This is a hairy duck.");
        else
            System.out.println("The duck has no wool.");

        System.out.println("Duck volume is " + getVoiceVolume() + ".");
        System.out.println("This duck is a " + breed.getNameToPrint() + ".");
        System.out.println();

    }

    @Override
    public void printInfo(String additionalInformation){
        printInfo();
        System.out.println("Additional information: " + additionalInformation);
        System.out.println();
    }

}