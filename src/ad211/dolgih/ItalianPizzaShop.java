package ad211.dolgih;
import ad211.dolgih.ItalianTypeOfPizza.*;

public class ItalianPizzaShop extends PizzaShop{
    @Override
    public Pizza createPizza(PizzaType type){
        Pizza pizza = null;
        switch (type){
            case CHEESE:{
                pizza = new ItalianCheese();
                break;
            }
            case VEGGIE:{
                pizza=new ItalianVeggie();
                break;
            }
            case PEPPERONI:{
                pizza= new ItalianPepperoni();
                break;
            }
            case MEAT:{
                pizza=new ItalianMeat();
                break;
            }
        }
        return pizza;
    }
}
