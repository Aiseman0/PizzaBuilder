public class PepperoniBuilder extends PizzaBuilder {
    @Override
    public void buildName() {
        pizza.setName("Pepperoni");
    }

    @Override
    public void buildDough() {
        pizza.setDough("Traditional Crust");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Spicy Tomato Sauce");
    }

    @Override
    public void buildToppings() {
        pizza.addTopping("Spicy Pepperoni");
        pizza.addTopping("Mozzarella Cheese");
    }
}