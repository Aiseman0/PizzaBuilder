package assignment2.partb;

public class SlytherinFactory implements HouseEquipmentFactory {
    @Override
    public Robe createRobe() {
        return new SlytherinRobe();
    }

    @Override
    public Broom createBroom() {
        return new SlytherinBroom();
    }
}
