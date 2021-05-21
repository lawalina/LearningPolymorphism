public enum BreedsOfCats {
    PERSIAN("P", "Persian"),
    TURKISH_VAN("T", "Turkish van"),
    SPHINX("S", "Sphinx"),
    UNBREEDED("U", "unbreeded");

    private final String shortCode;
    private final String nameToPrint;

    public String getDirectionCode() {
        return this.shortCode;
    }

    public String getNameToPrint() {
        return nameToPrint;
    }

    BreedsOfCats(String code, String print) {
        this.shortCode = code;
        this.nameToPrint = print;
    }
}



