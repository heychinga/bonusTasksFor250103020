public class CheeseDecorator extends PizzaDecorator {
    public void PizzaDecorator(Pizza wrapped) {
        super(wrapped);
    }

    @Override
    public double getPrice() {
        return wrapped.getPrice() + 2;
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + " +Cheese";
    }

}