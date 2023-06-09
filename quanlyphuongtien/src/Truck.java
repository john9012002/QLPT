public class Truck extends Vehicle{
    private int weight;

    public Truck(String id, String brand, int year, double price, String color, int weight) {
        super(id, brand, year, price, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                '}';
    }
}
