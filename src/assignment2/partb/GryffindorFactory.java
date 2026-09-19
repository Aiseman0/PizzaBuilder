package assignment2.partb;

public class GryffindorFactory implements HouseEquipmentFactory {
    @Override
    public Robe createRobe() {
        return new GryffindorRobe();
    }

    @Override
    public Broom createBroom() {
        return new GryffindorBroom();
    }
}
