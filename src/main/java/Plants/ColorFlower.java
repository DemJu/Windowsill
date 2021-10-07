package Plants;

public enum ColorFlower {
    GREEN("Green"), RED("Red"), YELLOW("Yellow"), WHITE("White"), PURPLISH("Purplish");

    private final String value;

    ColorFlower(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
