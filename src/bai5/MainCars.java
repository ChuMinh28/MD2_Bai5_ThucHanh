package bai5;

public class MainCars {
    public static void main(String[] args) {
        Car car1 = new Car("Kia","Honda");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Kia 3","Honda City");
        System.out.println(Car.numberOfCars);

    }
}
