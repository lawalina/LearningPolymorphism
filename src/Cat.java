public class Cat extends Animal {
    Cat (double Height, double Weight, int VoiceVolume, boolean haveWool){
        this.height = Height;
        this.weight = Weight;
        this.voiceVolume = VoiceVolume;
        this.haveWool = haveWool;
    }

    @Override
    public void printInfo() {
        System.out.println("This is a Cat.");
        System.out.println("Cat height is " + height + ".");
        System.out.println("Cat weight is " + weight + ".");
        if(haveWool)
            System.out.println("This is a hairy cat.");
        else
            System.out.println("The cat has no wool.");
        System.out.println("Cat volume is " + voiceVolume + ".");
    }
}
