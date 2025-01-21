package multithreading;

public class Daemon extends Thread{
    @Override
    public void run() {
        while(true) {
            System.out.println("Hello world");
        }
    }

    public static void main(String[] args) {
        Daemon t2 = new Daemon();
        t2.setDaemon(true);
        t2.start();
        System.out.println("basicJava.Main Thread Done");
    }
}
