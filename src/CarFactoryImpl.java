import java.util.Random;

public class CarFactoryImpl implements CarFactory {
    @Override
    public Car[] cars(int n) {
        Car[] cars = new Car[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int randomIndex = rand.ints(0, carModels.length - 1)
                    .findFirst()
                    .getAsInt();
            cars[i] = new Car(carModels[randomIndex]);
        }
        return cars;
    }


}




