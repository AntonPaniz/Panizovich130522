
public class Cardetailed  {
   /* @Override implements CarAction
    public void mileage() {
        double maxMileage = carSeat.tankCapacity - carSeat.fuelConsumption;
        System.out.println(maxMileage);
    }
*/
    private String carMark;
    private String carModel;
    private double motorVolume;
    private double tankCapacity;
    private double fuelConsumption;

    public Cardetailed(String carMark, String carModel, double motorVolume, double tankCapacity, double fuelConsumption) {
        this.carMark = carMark;
        this.carModel = carModel;
        this.motorVolume = motorVolume;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public String getCarMark() {
        return carMark;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getMotorVolume() {
        return motorVolume;
    }

    public void setMotorVolume(double motorVolume) {
        this.motorVolume = motorVolume;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

   // Cardetailed carSeat = new Cardetailed("Seat", "toledo", 87, 91, 8.3);
    //Cardetailed carCitroen = new Cardetailed("Citroen", "desse", 63, 69, 11.3);

}












