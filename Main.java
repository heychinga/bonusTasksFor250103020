public class Main {
    public static void main(String[] args){
        Pizza pizza = new PlainPizza(5.0, "Thin Crust");
        pizza = new CheeseDecorator(pizza);
        pizza = new OlivesDecorator(pizza);
        pizza = new PineappleDecorator(pizza);

        System.out.println("Description: " + pizza.getDescription());
        System.out.println("Price: $" + pizza.getPrice());
    }
}
