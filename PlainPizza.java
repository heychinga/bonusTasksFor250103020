public class PlainPizza implements Pizza {

    private double price = 5;
    private String description = "Plain Dough & Sauce";

    public void PlainPizza(double price, String description) {
        if (price >= 0) {
            this.price = price;
        }
        if (description != null && description.trim() != "") {
            this.description = description;
        }
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