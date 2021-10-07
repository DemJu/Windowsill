package Plants;

public class FORGET_ME_NOT extends Flower{

    private final boolean withShade;
    static final boolean poison = false;

    public FORGET_ME_NOT(String colorFlower, int ageFlower, int percentWet, boolean withShade) {
        super(colorFlower, ageFlower, percentWet);
        this.withShade = withShade;
    }

    @Override
    public String toString() {
        return "Flower {" +
                "typeFlower: '" + TypeFlower.FORGET_ME_NOT +
                ", colorFlower: '" + colorFlower +
                ", ageFlower: " + ageFlower +
                ", percentWet: " + percentWet + "%" +
                ", with a shade: " + withShade + "}";
    }

    @Override
    public void harmfulness() {
        System.out.println("Poison: " + poison);
    }
}
