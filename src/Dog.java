public class Dog extends Animal {
    Dog (double Height, double Weight, int VoiceVolume, boolean haveWool){
        this.height = Height;
        this.weight = Weight;
        this.voiceVolume = VoiceVolume;
        this.haveWool = haveWool;
    }

    @Override
    public void printInfo() {
        System.out.println("This is a Dog.");
        System.out.println("Dog height is " + height + ".");
        System.out.println("Dog weight is " + weight + ".");
        if(haveWool)
            System.out.println("This is a hairy dog.");
        else
            System.out.println("The dog has no wool.");
        System.out.println("Dog volume is " + voiceVolume + ".");
    }
}