package assignment2.parta;

public abstract class WandFactory {
    // Фабричный метод
    public abstract Wand createWand();

    public void prepareWand() {
        Wand wand = createWand();
        System.out.println("The craftsman makes a wand...");
        wand.castSpell();
    }
}