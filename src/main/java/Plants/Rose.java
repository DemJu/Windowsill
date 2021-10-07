package Plants;

public class Rose extends Flower{

    private final boolean thorns;
    static final boolean poison = true;

    public Rose(String colorFlower, int ageFlower, int percentWet, boolean thorns) {
        super(colorFlower, ageFlower, percentWet);
        this.thorns = thorns;
    }

    @Override
    public String toString() {
        return "Flower {" +
                "typeFlower: '" + TypeFlower.ROSE +
                ", colorFlower: '" + colorFlower +
                ", ageFlower: " + ageFlower +
                ", percentWet: " + percentWet + "%" +
                ", thorns: " + thorns + "}";
    }

    @Override
    public void harmfulness() {
        System.out.println("Poison: " + poison);
    }
}
