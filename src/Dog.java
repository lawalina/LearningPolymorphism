public class Dog extends Animal {

    private BreedsOfDogs breed;

    Dog (){
        this.height=0.5;
        this.weight=7;
        this.voiceVolume=70;
        this.haveWool=true;
        this.breed=BreedsOfDogs.UNBREEDED;
    }

    Dog (double Height, double Weight){
        this();
        this.height=Height;
        this.weight=Weight;
    }

    Dog (double Height, double Weight, int VoiceVolume){
        this(Height, Weight);
        this.voiceVolume=VoiceVolume;
    }

    Dog (double Height, double Weight, boolean haveWool){
        this(Height, Weight);
        this.haveWool=haveWool;
    }

    Dog (double Height, double Weight, int VoiceVolume, boolean haveWool){
        this(Height, Weight);
        this.voiceVolume=VoiceVolume;
        this.haveWool=haveWool;
    }


    Dog (double Height, double Weight, int VoiceVolume, boolean haveWool, BreedsOfDogs breed){
        this(Height, Weight, VoiceVolume, haveWool);
        this.breed=breed;
    }

    @Override
    public void printInfo() {

        System.out.println("This is a Dog.");
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