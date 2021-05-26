package Animals;

import Exceptions.NullEqualsException;

public abstract class Animal {

    protected double height;
    protected double weight;
    protected boolean haveWool;
    protected int voiceVolume;

    Animal(){
        try {
            if (this.voiceVolume == 0){
                throw new NullEqualsException("Exception: zero values of voice volume.");
            }
        }catch (NullEqualsException excp){
            System.out.println(excp.getMessage());
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHaveWool() {
        return haveWool;
    }

    public void setHaveWool(boolean haveWool) {
        this.haveWool = haveWool;
    }

    public int getVoiceVolume() {
        return voiceVolume;
    }

    public void setVoiceVolume(int voiceVolume) {
        this.voiceVolume = voiceVolume;
    }


    public abstract void printInfo ();

    public abstract void printInfo(String additionalInformation);
}