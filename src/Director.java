public class Director {
    private PizzaBuilder builder;

    public void setBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza makePizza() {
        builder.createNewPizza();
        builder.buildName();
        builder.buildDough();
        builder.buildSauce();
        builder.buildToppings();
        return builder.getPizza();
    }
}