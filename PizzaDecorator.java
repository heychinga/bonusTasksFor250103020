public abstract class PizzaDecorator implements Pizza {
    protected final Pizza wrapped;

    public PizzaDecorator(Pizza wrapped){
        if(wrapped==null){
            throw new IllegalArgumentException("invalid value!");
        }
        this.wrapped=wrapped;
    }

    @Override
    public double getPrice() {
        return wrapped.getPrice();
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription();
    }

}
