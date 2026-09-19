package assignment2.parta;

public class OllivanderFactory extends WandFactory {
    @Override
    public Wand createWand() {
        return new PhoenixWand();
    }
}