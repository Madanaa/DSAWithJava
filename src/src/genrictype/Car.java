package genrictype;

public class Car extends Vehicle{
    private String carModel;

    public Car(int vehicleId, String carModel) {
        super(vehicleId);
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                '}';
    }
}
