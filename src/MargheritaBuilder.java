public class MargheritaBuilder extends PizzaBuilder {
    @Override
    public void buildName() {
        pizza.setName("Margherita");
    }

    @Override
    public void buildDough() {
        pizza.setDough("Thin Crust");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Tomato Sauce");
    }

    @Override
    public void buildToppings() {
        pizza.addTopping("Mozzarella Cheese");
        pizza.addTopping("Basil");
        pizza.addTopping("Tomatoes");
    }
}