public interface CarFactory {
    String[] carModels = {"Seat", "Volvo", "Honda", "Talbot", "Saab", "Lancia", "Plymouth"};
    Car[] cars(int n);
}
