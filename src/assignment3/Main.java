package assignment3;

public class Main {
    public static void main(String[] args) {
        HouseEffect gryffindor = new GryffindorEffect();
        HouseEffect slytherin = new SlytherinEffect();

        Wizard harry = new Student("Harry Potter", gryffindor);
        harry.castSpell();

        Wizard snape = new Professor("Severus Snape", slytherin);
        snape.castSpell();

        System.out.println("\n--- Dynamic Runtime Switch ---");

        snape.setHouseEffect(gryffindor);
        snape.castSpell();
    }
}