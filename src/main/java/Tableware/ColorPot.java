package Tableware;

public enum ColorPot {
    GREEN("Green"), RED("Red"), YELLOW("Yellow"), WHITE("White"), BLACK("Black"), PURPLISH("Purplish"), BLUE("Blue");

    private final String value;

    ColorPot(String value){
        this.value = value;
    }


    @Override
    public String toString() {
        return value;
    }
}
