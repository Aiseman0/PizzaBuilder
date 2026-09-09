public class FourCheeseBuilder extends PizzaBuilder {
    @Override
    public void buildName() {
        pizza.setName("Four Cheese");
    }

    @Override
    public void buildDough() {
        pizza.setDough("Pan Dough");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Cream Sauce");
    }

    @Override
    public void buildToppings() {
        pizza.addTopping("Mozzarella");
        pizza.addTopping("Gorgonzola");
        pizza.addTopping("Parmesan");
        pizza.addTopping("Cheddar");
    }
}