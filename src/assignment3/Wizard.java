package assignment3;

public abstract class Wizard {
    protected String name;
    protected HouseEffect houseEffect; // The Bridge reference

    public Wizard(String name, HouseEffect houseEffect) {
        this.name = name;
        this.houseEffect = houseEffect;
    }

    public void setHouseEffect(HouseEffect houseEffect) {
        this.houseEffect = houseEffect;
    }

    public abstract void castSpell();
}