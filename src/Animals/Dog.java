package Animals;

import Breeds.BreedsOfDogs;

public class Dog extends Animal {

    private BreedsOfDogs breed;

    @Override
    public BreedsOfDogs getBreed() {
        return breed;
    }

    public Dog() {
        this.height = 0.5;
        this.weight = 7;
        this.voiceVolume = 70;
        this.haveWool = true;
        this.breed = BreedsOfDogs.UNBREEDED;
        this.name = "No name";
        this.additionalInformation = null;
    }

    public Dog(double Height, double Weight, String name, String additionalInformation) {
        this();
        this.height = Height;
        this.weight = Weight;
        this.name = name;
        this.additionalInformation = additionalInformation;
    }

    public Dog(double Height, double Weight, int VoiceVolume, String name, String additionalInformation) {
        this(Height, Weight, name, additionalInformation);
        this.voiceVolume = VoiceVolume;
    }

    public Dog(double Height, double Weight, boolean haveWool, String name, String additionalInformation) {
        this(Height, Weight, name, additionalInformation);
        this.haveWool = haveWool;
    }

    public Dog(double Height, double Weight, int VoiceVolume, boolean haveWool, String name, String additionalInformation) {
        this(Height, Weight, name, additionalInformation);
        this.voiceVolume = VoiceVolume;
        this.haveWool = haveWool;
    }


    public Dog(double Height, double Weight, int VoiceVolume, boolean haveWool, BreedsOfDogs breed, String name, String additionalInformation) {
        this(Height, Weight, VoiceVolume, haveWool, name, additionalInformation);
        this.breed = breed;
    }

    @Override
    public void printInfo() {

        System.out.println("This is " + getName() + ". It's a Dog.");
        System.out.println();
        System.out.println("Dog height is " + getHeight() + ".");
        System.out.println("Dog weight is " + getWeight() + ".");

        if (isHaveWool())
            System.out.println("This is a hairy dog.");
        else
            System.out.println("The dog has no wool.");

        System.out.println("Dog volume is " + getVoiceVolume() + ".");
        System.out.println("This dog is a " + breed.getNameToPrint() + ".");
        System.out.println();

        if (getAdditionalInformation() != null)
            System.out.println("Additional information: " + getAdditionalInformation());
        System.out.println();
    }
}