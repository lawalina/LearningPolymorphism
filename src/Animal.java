public abstract class Animal {

    private double height;
    private double weight;
    private boolean haveWool;
    private int voiceVolume;

    private double defaultHeight;
    private double defaultWeight;
    private boolean defaultHaveWool;
    private int defaultVoiceVolume;

    public double getDefaultHeight() {
        return defaultHeight;
    }

    public void setDefaultHeight(double defaultHeight) {
        this.defaultHeight = defaultHeight;
    }

    public double getDefaultWeight() {
        return defaultWeight;
    }

    public void setDefaultWeight(double defaultWeight) {
        this.defaultWeight = defaultWeight;
    }

    public boolean isDefaultHaveWool() {
        return defaultHaveWool;
    }

    public void setDefaultHaveWool(boolean defaultHaveWool) {
        this.defaultHaveWool = defaultHaveWool;
    }

    public int getDefaultVoiceVolume() {
        return defaultVoiceVolume;
    }

    public void setDefaultVoiceVolume(int defaultVoiceVolume) {
        this.defaultVoiceVolume = defaultVoiceVolume;
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