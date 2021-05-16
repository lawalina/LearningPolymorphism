public class Duck extends Animal {

    Duck (){
        setDefault();
    }

    Duck (double Height, double Weight){
        setDefault();
        setHeight(Height);
        setWeight(Weight);
    }

    Duck (double Height, double Weight, int VoiceVolume){
        setDefault();
        setHeight(Height);
        setWeight(Weight);
        setVoiceVolume(VoiceVolume);
    }

    Duck (double Height, double Weight, boolean haveWool){
        setDefault();
        setHeight(Height);
        setWeight(Weight);
        setHaveWool(haveWool);
    }

    Duck (double Height, double Weight, int VoiceVolume, boolean haveWool){

        setHeight(Height);
        setWeight(Weight);
        setVoiceVolume(VoiceVolume);
        setHaveWool(haveWool);
        setDefault();

    }

    void setDefault (){
        setDefaultHeight(0.3);
        setDefaultWeight(3);
        setDefaultHaveWool(false);
        setDefaultVoiceVolume(70);
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
        System.out.println();

    }

    @Override
    public void printInfo(String additionalInformation){
        printInfo();
        System.out.println("Additional information: " + additionalInformation);
        System.out.println();
    }

}