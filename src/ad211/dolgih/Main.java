package ad211.dolgih;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte answer;
        Scanner console = new Scanner(System.in);

        System.out.println("Приветствую вас,дорогой покупатель, сделайте свой выбор:");
        System.out.println("1.African Pizzeria\n2.Italian Pizzeria ");
        answer=console.nextByte();

        if (answer == 1) {
            PizzaShop africanPizzaShop = new AfricanPizzaShop();
            AfricanMenu();
            answer = console.nextByte();

            switch (answer) {
                case 1: {
                    africanPizzaShop.orderPizza(PizzaType.CHEESE);
                    System.out.println("Вот ваш африканский сыр,приятного аппетита!!!");
                    break;
                }
                case 2: {
                    africanPizzaShop.orderPizza(PizzaType.MEAT);
                    System.out.println("Вот ваше африканское мясо,приятного аппетита!!!");
                    break;
                }
                case 3: {
                    africanPizzaShop.orderPizza(PizzaType.PEPPERONI);
                    System.out.println("Вот ваша африканская пепперони,приятного аппетита!!!");
                    break;
                }
                case 4: {
                    africanPizzaShop.orderPizza(PizzaType.VEGGIE);
                    System.out.println("Вот ваши африканские овощи,приятного аппетита!!!");
                    break;
                }
            }


        }else if(answer==2){

            PizzaShop italianPizzaShop = new ItalianPizzaShop();
            ItalianMenu();
            answer = console.nextByte();

            switch (answer){
                case 1:{
                    italianPizzaShop.orderPizza(PizzaType.CHEESE);
                    System.out.println("Вот ваш итальянский сыр,приятного аппетита!!!");
                    break;
                }
                case 2:{
                    italianPizzaShop.orderPizza(PizzaType.MEAT);
                    System.out.println("Вот ваше итальянское мясо,приятного аппетита!!!");
                    break;
                }
                case 3:{
                    italianPizzaShop.orderPizza(PizzaType.PEPPERONI);
                    System.out.println("Вот ваша итальянская пепперони,приятного аппетита!!!");
                    break;
                }
                case 4:{
                    italianPizzaShop.orderPizza(PizzaType.VEGGIE);
                    System.out.println("Вот ваши итальянские овощи,приятного аппетита!!!");
                    break;
                }
            }
        }else{
            System.out.println("Ваш выбор оказался ошибочным");
        }
        console.close();
    }


    public static void ItalianMenu(){
        System.out.println("Приветствую вас,дорогой итальито,вот ваше меню,заказывайте скорее");
        ShowMenu();
    }

    public static void ShowMenu(){
        System.out.println("1.Cheese Pizza");
        System.out.println("2.Meat Pizza");
        System.out.println("3.Pepperoni Pizza");
        System.out.println("4.Veggie Pizza");
    }

    public static void AfricanMenu(){
        System.out.println("Приветствую вас,дорогой африкатито,вот ваше меню,заказывайте скорее");
        ShowMenu();
    }
}

