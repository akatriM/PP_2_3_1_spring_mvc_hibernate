package web;

public class Car {
    private final String model;
    private final Integer release;
    private final Integer price;

    public Car(String model, Integer release, Integer price) {
        this.model = model;
        this.release = release;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public Integer getRelease() {
        return release;
    }

    public Integer getPrice() {
        return price;
    }
}
