package Animals;

public abstract class Animal implements Comparable<Animal> {

    protected double height;
    protected double weight;
    protected boolean haveWool;
    protected int voiceVolume;
    protected Enum breed;
    protected String name;
    protected String additionalInformation;

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getName() {
        return name;
    }

    public Enum getBreed() {
        return breed;
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


    public abstract void printInfo();

    @Override
    public int compareTo(Animal animal) {
        return this.name.compareTo(animal.name);
    }
}