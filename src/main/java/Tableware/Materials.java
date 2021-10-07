package Tableware;

public enum Materials {
    PLASTIC("Plastic"), CLAY("Clay"), GLASS("Glass"), CERAMICS("Ceramics");

    private final String value;

    Materials(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
