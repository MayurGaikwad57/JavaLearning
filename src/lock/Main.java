package lock;

public class Main {
    public static void main(String[] args) {
        Bank withdraw = new Bank();
        Runnable obj = new Runnable() {
            @Override
            public void run() {
              withdraw.withDraw(50);
            }
        };
        Thread t1 = new Thread(obj,"Thread 1");
        Thread t2 = new Thread(obj,"Thread 2");
        t1.start();
        t2.start();
    }
}
