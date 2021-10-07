package Tableware;

public enum TypePot {
    SMALL("Small"), AVERAGE("Average"), BIG("Big");

    private final String value;

    TypePot(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
