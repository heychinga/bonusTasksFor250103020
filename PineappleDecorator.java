public class PineappleDecorator extends PizzaDecorator {
    
    public PineappleDecorator(Pizza wrapped) {
        super(wrapped);
    }

    @Override
    public double getPrice() {
        return wrapped.getPrice() + 1.5;
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + " + Pineapple";
    }

}