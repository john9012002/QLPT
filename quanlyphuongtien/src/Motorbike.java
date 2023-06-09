public class Motorbike extends Vehicle{
    private String capacity;

    public Motorbike(String id, String brand, int year, double price, String color, String capacity) {
        super(id, brand, year, price, color);
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "capacity='" + capacity + '\'' +
                '}';
    }
}
