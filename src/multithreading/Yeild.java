package multithreading;

public class Yeild extends Thread {
    Yeild(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i< 10; i++){
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
//multithreading.Yeild() method makes sure that other threads also get the chance to execute
// Meaning we can tell JVM that other threads should also get chance to execute simultaneously
        }
    }

    public static void main(String[] args) {
        Yeild t1 = new Yeild("One");
        Yeild t2 = new Yeild("Two");
        t1.start();
        t2.start();
    }
}
