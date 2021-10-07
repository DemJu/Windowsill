package Tableware;

public class Pot {

    //public final int dateAdmission;
    public String typeFlowerPot;
    public String colorFlowerPot;
    public String materialsPot;

    public Pot(String typeFlowerPot, String colorFlowerPot, String materualsPot) {
        this.typeFlowerPot = typeFlowerPot;
        this.colorFlowerPot = colorFlowerPot;
        this.materialsPot = materualsPot;
    }

    @Override
    public String toString() {
        return "Pot{" +
                "typeFlowerPot: '" + typeFlowerPot +
                ", colorFlowerPot: '" + colorFlowerPot +
                ", materialsPot: '" + materialsPot +
                '}';
    }
}
