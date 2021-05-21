public class Duck extends Animal {

    private BreedsOfDucks breed;

    Duck (){
        this.height=0.3;
        this.weight=3;
        this.voiceVolume=70;
        this.haveWool=false;
        this.breed=BreedsOfDucks.UNBREEDED;
    }

    Duck (double Height, double Weight){
        this();
        this.height=Height;
        this.weight=Weight;
    }

    Duck (double Height, double Weight, int VoiceVolume){
        this(Height, Weight);
        this.voiceVolume=VoiceVolume;
    }

    Duck (double Height, double Weight, boolean haveWool){
        this(Height, Weight);
        this.haveWool=haveWool;
    }

    Duck (double Height, double Weight, int VoiceVolume, boolean haveWool){
        this(Height, Weight);
        this.voiceVolume=VoiceVolume;
        this.haveWool=haveWool;
    }


    Duck (double Height, double Weight, int VoiceVolume, boolean haveWool, BreedsOfDucks breed){
        this(Height, Weight, VoiceVolume, haveWool);
        this.breed=breed;
    }

    @Override
    public void printInfo() {

        System.out.println("This is a duck.");
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