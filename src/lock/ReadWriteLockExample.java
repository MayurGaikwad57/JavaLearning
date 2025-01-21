package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {
    private int count = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

     public void increment() {
       writeLock.lock();
        try{
            count++;
        }
        finally{
            writeLock.unlock();
        }
     }

     public int getCount() {
        readLock.lock();
         try{
             return count;
         }
         finally{
             readLock.unlock();
         }
     }


    public static void main(String[] args) throws InterruptedException {
        ReadWriteLockExample exmp = new ReadWriteLockExample();
        Runnable readThread = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i< 10; i++) {
                    System.out.println(Thread.currentThread().getName()+" reading thread "+exmp.getCount());
                }
            }
        };
        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i< 10;i++) {
                    exmp.increment();
                    System.out.println(Thread.currentThread().getName()+" Incremented ");
                }
            }
        };
        Thread writeThread = new Thread(writeTask," Thread 3 ");
        Thread readThread1 = new Thread(readThread," Thread 1 ");
        Thread readThread2 = new Thread(readThread," Thread 2 ");

        writeThread.start();
        readThread1.start();
        readThread2.start();

        writeThread.join();
        readThread1.join();
        readThread2.join();

        System.out.println(" Final Count "+exmp.count);
    }
}