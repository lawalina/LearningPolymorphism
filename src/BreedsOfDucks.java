public enum BreedsOfDucks {
    NORMAL("N", "normal"),
    STRANGE("S", "strange"),
    UNBREEDED("U", "unbreeded");

    private final String shortCode;
    private final String nameToPrint;

    public String getDirectionCode() {
        return this.shortCode;
    }

    public String getNameToPrint() {
        return nameToPrint;
    }

    BreedsOfDucks(String code, String print) {
        this.shortCode = code;
        this.nameToPrint = print;
    }
}
