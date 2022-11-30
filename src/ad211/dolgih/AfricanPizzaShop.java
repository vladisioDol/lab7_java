package ad211.dolgih;

import ad211.dolgih.AfricanTypeOfPizza.*;

public class AfricanPizzaShop extends PizzaShop{
    @Override
    public Pizza createPizza(PizzaType type){
        Pizza pizza = null;
        switch (type){
            case CHEESE:{
                pizza = new AfricanCheese();
                break;
            }
            case VEGGIE:{
                pizza=new AfricanVeggie();
                break;
            }
            case PEPPERONI:{
                pizza= new AfricanPepperoni();
                break;
            }
            case MEAT:{
                pizza=new AfricanMeat();
                break;
            }
        }
        return pizza;
    }
}
