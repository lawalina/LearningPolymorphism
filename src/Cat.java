public class Cat extends Animal {

    private BreedsOfCats breed;

    Cat (){
        this.height=0.3;
        this.weight=5;
        this.voiceVolume=70;
        this.haveWool=true;
        this.breed=BreedsOfCats.UNBREEDED;
    }

    Cat (double Height, double Weight){
        this();
        this.height=Height;
        this.weight=Weight;
    }

    Cat (double Height, double Weight, int VoiceVolume){
        this(Height, Weight);
        this.voiceVolume=VoiceVolume;
    }

    Cat (double Height, double Weight, boolean haveWool){
        this(Height, Weight);
        this.haveWool=haveWool;
    }

    Cat (double Height, double Weight, int VoiceVolume, boolean haveWool){
        this(Height, Weight);
        this.voiceVolume=VoiceVolume;
        this.haveWool=haveWool;
    }


    Cat (double Height, double Weight, int VoiceVolume, boolean haveWool, BreedsOfCats breed ){
        this(Height, Weight, VoiceVolume, haveWool);
        this.breed=breed;
    }

    @Override
    public void printInfo() {

        System.out.println("This is a Cat.");
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
