package assignment3;

public class Student extends Wizard {
    private static final int BASE_POWER = 20;

    public Student(String name, HouseEffect houseEffect) {
        super(name, houseEffect);
    }

    @Override
    public void castSpell() {
        System.out.print("[Student] ");
        houseEffect.applyMagic(name, BASE_POWER);
    }
}