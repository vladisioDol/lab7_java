package ad211.dolgih;

public abstract class PizzaShop {

    public Pizza orderPizza(PizzaType type){
        Pizza pizza = createPizza(type);
        pizza.makePizza();

        return pizza;
    }
    protected  abstract Pizza createPizza(PizzaType type);
}
