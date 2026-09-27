package assignment3;

public class GryffindorEffect implements HouseEffect {
    @Override
    public void applyMagic(String wizardName, int power) {
        int damage = power * 2;
        System.out.println(wizardName + " casts Gryffindor offensive spell! Deals " + damage + " attack damage.");
    }
}