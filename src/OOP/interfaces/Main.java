package OOP.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car obj = new Car();
//
//        obj.start();
//        obj.stop();
//        obj.acc();

//        Media newMedia = new Car();
//        newMedia.start(); // Here the engine is started instead of the media getting started

        BestCar car = new BestCar();
        car.start();
        car.stop();
        car.startMusic();
        car.stopMusic();
        car.upgradeEngine();
        car.start();
    }
}
