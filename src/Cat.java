public class Cat extends Animal {

    Cat (){
        super();
    }

    Cat (double Height, double Weight){
        this();
        setHeight(Height);
        setWeight(Weight);
    }

    Cat (double Height, double Weight, int VoiceVolume){
        this(Height, Weight);
        setVoiceVolume(VoiceVolume);
    }

    Cat (double Height, double Weight, boolean haveWool){
        this(Height, Weight);
        setHaveWool(haveWool);
    }

    Cat (double Height, double Weight, int VoiceVolume, boolean haveWool){
        this(Height, Weight);
        setVoiceVolume(VoiceVolume);
        setHaveWool(haveWool);
    }

    @Override
    protected void setDefault(){
        setDefaultHeight(0.5);
        setDefaultWeight(4);
        setDefaultHaveWool(true);
        setDefaultVoiceVolume(70);
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
        System.out.println();

    }

    @Override
    public void printInfo(String additionalInformation){
        printInfo();
        System.out.println("Additional information: " + additionalInformation);
        System.out.println();
    }

}
