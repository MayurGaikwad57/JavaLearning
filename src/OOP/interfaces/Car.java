package OOP.interfaces;

public class Car implements Engine,Media {
    int a = 100;
    @Override
    public void start() {
        System.out.println("Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Engine Stopped");
    }

    @Override
    public void acc() {
        System.out.println("Car Accelerated");
    }
}
