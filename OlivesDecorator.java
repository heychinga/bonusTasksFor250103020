public class OlivesDecorator extends PizzaDecorator {
    public OlivesDecorator(Pizza wrapped) {
        super(wrapped);
    }

    @Override
    public double getPrice() {
        return wrapped.getPrice() + 1;
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + " + Olives";
    }

}