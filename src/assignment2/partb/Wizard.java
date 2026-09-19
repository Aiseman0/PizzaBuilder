package assignment2.partb;

public class Wizard {
    private Robe robe;
    private Broom broom;

    // Клиент получает фабрику и не использует new для конкретных вещей
    public Wizard(HouseEquipmentFactory factory) {
        this.robe = factory.createRobe();
        this.broom = factory.createBroom();
    }

    public void prepareForLesson() {
        robe.wear();
        broom.fly();
    }
}
