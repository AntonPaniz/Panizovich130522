public class CheckClass {
    public static void main(String[] args) {
        int n = 9;
        Car[] cars = new CarFactoryImpl().cars(n);
        for (Car car: cars) {
            System.out.println(car.getCarModel());
                    }
        Cardetailed adas = new Cardetailed("dasdas", "asdasd", 22, 23, 2);
       // Cardetailed.mileage();
    }
}
