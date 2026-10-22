public class PlainPizza implements Pizza {

    private final double price;
    private final String description;

    public PlainPizza(double price, String description) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Description cannot be null or empty.");
        }
        this.description = description;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}