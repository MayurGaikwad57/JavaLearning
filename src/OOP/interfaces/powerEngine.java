package OOP.interfaces;

public class powerEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Power Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stopped");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine Accelerated");
    }
}
