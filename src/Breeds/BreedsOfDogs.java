package Breeds;

public enum BreedsOfDogs {
    SHEEP_DOG("S","Sheep dog"),
    GOLDEN_RETRIVER("G", "Golden Retriver"),
    CHIHUAHUA("С", "Chihuahua"),
    UNBREEDED("U", "unbreeded");

    protected final String shortCode;
    private final String nameToPrint;

    public String getDirectionCode() {
        return this.shortCode;
    }

    public String getNameToPrint() {
        return nameToPrint;
    }

    BreedsOfDogs(String code, String print) {
        this.shortCode = code;
        this.nameToPrint = print;
    }
}
