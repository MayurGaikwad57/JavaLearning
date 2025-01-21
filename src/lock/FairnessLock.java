package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessLock {

    private final Lock lock = new ReentrantLock(true);
    //the fair true means all the threads will get the chance , and no one will die of starvation
    // without using fair:true some threads may or may not get chance to execute
    // ex-> you have 20 threads so there can be a chance that 1 or few of threads might not get chance to execute
    // so fair:true will ensure that all the threads will get a chance

    public void accessResources() {
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+"Lock Acquired");
            Thread.sleep(3000);
        }catch(Exception e){
            Thread.currentThread().interrupt();
        }
        finally{
            System.out.println(Thread.currentThread().getName()+"Lock Released");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        FairnessLock call = new FairnessLock();
        Runnable example = new Runnable() {
            @Override
            public void run() {
                call.accessResources();
            }
        };
        Thread t1 = new Thread(example,"Thread 1");
        Thread t2 = new Thread(example,"Thread 2");
        Thread t3 = new Thread(example,"Thread 3");
        t1.start();
        t2.start();
        t3.start();
/* locks are unfair in the sense , we don't know the order in which they will access the resource
but to make it fair we can pass fair: true to constructor of reentrant lock
............................................NOTE...........................................
*** 1) don't go the terminal output because terminal output is based on the OS/Scheduler/JVM
so sometimes in above example thread 3 might start first , 2 might or 1 might
this access is based on which thread is requesting for resource access
so this is determined by OS as of which thread can request for access
** 2) But with fair:true all the threads will get a chance and internally it will be ordered providing chance for all
and output of console doesn't matter as we have made sure all the threads can access the resource and no one is dying of
starvation
                                      */
    }
}
