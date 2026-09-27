package assignment3;

public class SlytherinEffect implements HouseEffect {
    @Override
    public void applyMagic(String wizardName, int power) {
        int shield = power + 50;
        System.out.println(wizardName + " casts Slytherin defensive spell! Generates a shield of " + shield + " power.");
    }
}