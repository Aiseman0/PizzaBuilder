public class Main {
    public static void main(String[] args) {
        Director director = new Director();


        PizzaBuilder margheritaBuilder = new MargheritaBuilder();
        director.setBuilder(margheritaBuilder);
        Pizza margherita = director.makePizza();
        System.out.println(margherita);


        PizzaBuilder fourCheeseBuilder = new FourCheeseBuilder();
        director.setBuilder(fourCheeseBuilder);
        Pizza fourCheese = director.makePizza();
        System.out.println(fourCheese);


        PizzaBuilder pepperoniBuilder = new PepperoniBuilder();
        director.setBuilder(pepperoniBuilder);
        Pizza pepperoni = director.makePizza();
        System.out.println(pepperoni);
    }
}