public class Duck extends Animal {
    Duck (double Height, double Weight, int VoiceVolume, boolean haveWool){
        this.height = Height;
        this.weight = Weight;
        this.voiceVolume = VoiceVolume;
        this.haveWool = haveWool;
    }

    @Override
    public void printInfo() {
        System.out.println("This is a duck.");
        System.out.println("Duck height is " + height + ".");
        System.out.println("Duck weight is " + weight + ".");
        if(haveWool)
            System.out.println("This is a hairy duck.");
        else
            System.out.println("The duck has no wool.");
        System.out.println("Duck volume is " + voiceVolume + ".");
    }
}