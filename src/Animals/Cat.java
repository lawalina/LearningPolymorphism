package Animals;

import Breeds.BreedsOfCats;
import Exceptions.NoBreedException;
import Exceptions.NullEqualsException;

public class Cat extends Animal {

    private BreedsOfCats breed;

    @Override
    public BreedsOfCats getBreed() {
        return breed;
    }

    public Cat (){
        this.height=0.3;
        this.weight=5;
        this.voiceVolume=70;
        this.haveWool=true;
        this.breed=BreedsOfCats.UNBREEDED;
        this.name="No name";
    }

    public Cat (double Height, double Weight, String name){
        this();
        this.height=Height;
        this.weight=Weight;
        this.name=name;
    }

    public Cat (double Height, double Weight, int VoiceVolume, String name){
        this(Height, Weight, name);
        this.voiceVolume=VoiceVolume;
    }

    public Cat (double Height, double Weight, boolean haveWool, String name){
        this(Height, Weight, name);
        this.haveWool=haveWool;
    }

    public Cat (double Height, double Weight, int VoiceVolume, boolean haveWool, String name){
        this(Height, Weight, name);
        this.voiceVolume=VoiceVolume;
        this.haveWool=haveWool;
    }


    public Cat(double Height, double Weight, int VoiceVolume, boolean haveWool, BreedsOfCats breed, String name) {
            this(Height, Weight, VoiceVolume, haveWool, name);
            this.breed=breed;
    }

    @Override
    public void printInfo() {

        System.out.println("This is " + getName() + ". It's a cat.");
        System.out.println();
        System.out.println("Cat height is " + getHeight() + ".");
        System.out.println("Cat weight is " + getWeight() + ".");

        if(isHaveWool())
            System.out.println("This is a hairy cat.");
        else
            System.out.println("The cat has no wool.");

        System.out.println("Cat volume is " + getVoiceVolume() + ".");
        System.out.println("This cat is a " + breed.getNameToPrint() + ".");
        System.out.println();

    }

    @Override
    public void printInfo(String additionalInformation){
        printInfo();
        System.out.println("Additional information: " + additionalInformation);
        System.out.println();
    }

}
