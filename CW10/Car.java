package CW10;

public class Car extends Vehicle {
    @Override
    public void start() {
        super.start();
        System.out.println("rósza");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("stop");
    }
    public int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
