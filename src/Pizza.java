import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private String dough;
    private String sauce;
    private List<String> toppings = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    @Override
    public String toString() {
        return "Pizza: " + name + "\n" +
                "Dough: " + dough + "\n" +
                "Sauce: " + sauce + "\n" +
                "Toppings: " + String.join(", ", toppings) + "\n";
    }
}