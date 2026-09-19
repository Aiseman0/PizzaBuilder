package assignment2.parta;

public class GregorovitchFactory extends WandFactory {
    @Override
    public Wand createWand() {
        return new DragonWand();
    }
}