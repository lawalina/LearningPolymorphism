package Animals;

import Breeds.BreedsOfCats;

public class Cat extends Animal {

    private BreedsOfCats breed;

    @Override
    public BreedsOfCats getBreed() {
        return breed;
    }

    public Cat() {
        this.height = 0.3;
        this.weight = 5;
        this.voiceVolume = 70;
        this.haveWool = true;
        this.breed = BreedsOfCats.UNBREEDED;
        this.name = "No name";
        this.additionalInformation = null;
    }

    public Cat(double Height, double Weight, String name, String additionalInformation) {
        this();
        this.height = Height;
        this.weight = Weight;
        this.name = name;
        this.additionalInformation = additionalInformation;
    }

    public Cat(double Height, double Weight, int VoiceVolume, String name, String additionalInformation) {
        this(Height, Weight, name, additionalInformation);
        this.voiceVolume = VoiceVolume;
    }

    public Cat(double Height, double Weight, boolean haveWool, String name, String additionalInformation) {
        this(Height, Weight, name, additionalInformation);
        this.haveWool = haveWool;
    }

    public Cat(double Height, double Weight, int VoiceVolume, boolean haveWool, String name, String additionalInformation) {
        this(Height, Weight, name, additionalInformation);
        this.voiceVolume = VoiceVolume;
        this.haveWool = haveWool;
    }


    public Cat(double Height, double Weight, int VoiceVolume, boolean haveWool, BreedsOfCats breed, String name, String additionalInformation) {
        this(Height, Weight, VoiceVolume, haveWool, name, additionalInformation);
        this.breed = breed;
    }

    @Override
    public void printInfo() {
        System.out.println("This is " + getName() + ". It's a cat.");
        System.out.println();
        System.out.println("Cat height is " + getHeight() + ".");
        System.out.println("Cat weight is " + getWeight() + ".");

        if (isHaveWool())
            System.out.println("This is a hairy cat.");
        else
            System.out.println("The cat has no wool.");

        System.out.println("Cat volume is " + getVoiceVolume() + ".");
        System.out.println("This cat is a " + breed.getNameToPrint() + ".");
        System.out.println();

        if (getAdditionalInformation() != null)
            System.out.println("Additional information: " + getAdditionalInformation());
        System.out.println();
    }
}
