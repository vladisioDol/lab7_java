package ad211.dolgih;

import ad211.dolgih.TypeOfPizza.*;

public class PizzaFactory {

    public Pizza createPizza(PizzaType type){
        Pizza pizza = null;

        switch (type){
            case CHEESE:{
                pizza = new Cheese();
                break;
            }
            case VEGGIE:{
                pizza=new Veggie();
                break;
            }
            case PEPPERONI:{
                pizza= new Pepperoni();
                break;
            }
            case MEAT:{
                pizza=new Meat();
                break;
            }
        }
        return pizza;
    }
}
