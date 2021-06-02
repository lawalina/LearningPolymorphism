package Animals;

import Breeds.BreedsOfDucks;

public class Duck extends Animal {

    private BreedsOfDucks breed;

    @Override
    public BreedsOfDucks getBreed() {
        return breed;
    }

    public Duck() {
        this.height = 0.3;
        this.weight = 3;
        this.voiceVolume = 70;
        this.haveWool = false;
        this.breed = BreedsOfDucks.UNBREEDED;
        this.name = "No name";
        this.additionalInformation = null;
    }

    public Duck(double Height, double Weight, String name, String additionalInformation) {
        this();
        this.height = Height;
        this.weight = Weight;
        this.name = name;
        this.additionalInformation = additionalInformation;
    }

    public Duck(double Height, double Weight, int VoiceVolume, String name, String additionalInformation) {
        this(Height, Weight, name, additionalInformation);
        this.voiceVolume = VoiceVolume;
    }

    public Duck(double Height, double Weight, boolean haveWool, String name, String additionalInformation) {
        this(Height, Weight, name, additionalInformation);
        this.haveWool = haveWool;
    }

    public Duck(double Height, double Weight, int VoiceVolume, boolean haveWool, String name, String additionalInformation) {
        this(Height, Weight, name, additionalInformation);
        this.voiceVolume = VoiceVolume;
        this.haveWool = haveWool;
    }


    public Duck(double Height, double Weight, int VoiceVolume, boolean haveWool, BreedsOfDucks breed, String name, String additionalInformation) {
        this(Height, Weight, VoiceVolume, haveWool, name, additionalInformation);
        this.breed = breed;
    }

    @Override
    public void printInfo() {

        System.out.println("This is " + getName() + ". It's a duck.");
        System.out.println();
        System.out.println("Duck height is " + getHeight() + ".");
        System.out.println("Duck weight is " + getWeight() + ".");

        if (isHaveWool())
            System.out.println("This is a hairy duck.");
        else
            System.out.println("The duck has no wool.");

        System.out.println("Duck volume is " + getVoiceVolume() + ".");
        System.out.println("This duck is a " + breed.getNameToPrint() + ".");
        System.out.println();

        if (getAdditionalInformation() != null)
            System.out.println("Additional information: " + getAdditionalInformation());
        System.out.println();
    }
}