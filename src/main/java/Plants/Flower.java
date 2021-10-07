package Plants;

public abstract class Flower implements Toxicity{

    public String colorFlower;
    public int ageFlower;
    /*public final int dateAdmission;*/
    public final int percentWet;

    @Override
    public String toString() {
        return "Flower{" +
                ", colorFlower: '" + colorFlower +
                ", ageFlower: " + ageFlower +
                ", percentWet: " + percentWet + "%}";
    }

    public Flower(String colorFlower, int ageFlower, int percentWet) {
        this.colorFlower = colorFlower;
        this.ageFlower = ageFlower;
        this.percentWet = percentWet;
    }
}
