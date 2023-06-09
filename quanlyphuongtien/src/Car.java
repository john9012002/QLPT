public class Car extends Vehicle{
    private int numOfSeats;
    private String engineType;

    public Car(String id, String brand, int year, double price, String color, int numOfSeats, String engineType) {
        super(id, brand, year, price, color);
        this.numOfSeats = numOfSeats;
        this.engineType = engineType;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numOfSeats=" + numOfSeats +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
