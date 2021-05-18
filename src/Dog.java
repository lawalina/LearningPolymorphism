public class Dog extends Animal {

    Dog (){
        super();
    }

    Dog (double Height, double Weight){
        this();
        setHeight(Height);
        setWeight(Weight);
    }

    Dog (double Height, double Weight, int VoiceVolume){
        this(Height, Weight);
        setVoiceVolume(VoiceVolume);
    }

    Dog (double Height, double Weight, boolean haveWool){
        this(Height, Weight);
        setHaveWool(haveWool);
    }

    Dog (double Height, double Weight, int VoiceVolume, boolean haveWool){
        this(Height, Weight);
        setVoiceVolume(VoiceVolume);
        setHaveWool(haveWool);
    }

    @Override
    protected void setDefault (){
        setDefaultHeight(1);
        setDefaultWeight(10);
        setDefaultHaveWool(true);
        setDefaultVoiceVolume(70);
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
        System.out.println();

    }

    @Override
    public void printInfo(String additionalInformation){
        printInfo();
        System.out.println("Additional information: " + additionalInformation);
        System.out.println();
    }

}