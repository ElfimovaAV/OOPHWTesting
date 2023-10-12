package seminar1;

public class Latte extends HotDrink {
    private int temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if (temperature < 0) {
            throw new RuntimeException("Incorrect temperature");
        }
        this.temperature = temperature;
    }

    public Latte(String name, double price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    @Override
    public String displayInfo() {
        return String.format("%s - %s - %d - %f", name, brand, temperature, price);
    }
}
