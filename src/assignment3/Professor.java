package assignment3;

public class Professor extends Wizard {
    private static final int BASE_POWER = 100;

    public Professor(String name, HouseEffect houseEffect) {
        super(name, houseEffect);
    }

    @Override
    public void castSpell() {
        System.out.print("[Professor] ");
        houseEffect.applyMagic(name, BASE_POWER);
    }
}