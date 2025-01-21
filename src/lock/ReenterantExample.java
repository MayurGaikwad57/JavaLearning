package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReenterantExample {
   private final Lock lock = new ReentrantLock();
    public void outerMethod() {
        lock.lock(); // lock acquired by main thread
        // count of locks ==> 1
        try{
            System.out.println("Outer method"); // statement executed
            innerMethod(); // call to innerMethod
        }
         finally {
            lock.unlock(); // locks count goes to ==> 0 , all locks released
        }
    }

    public void innerMethod() {
        lock.lock(); // count of locks goes to ==> 2
        // main thread acquires this lock also ?? HOW
/* 1) This is a magic of re-enterant lock , it allows one thread to hold multiple locks
* Mechanism --> Reenterant lock maintains count of lock, everytime a new lock is acquired this count is incremented
* once it encounters unlock() this count is decremented
* NOTE---> Every lock must have its unlock , in the same method where the lock is acquired
* otherwise other threads might access the critical section code
* .....................................IMP POINT........................................................
* 1) Each lock must have unlock() , lock() and unlock() must be paired in correct order
* 2) If there is no order maintained , then other threads can access the critical section code
*                                            */

        try{
            System.out.println("Inner Method");// after acquiring lock statement is executed
        }
        finally{
            lock.unlock(); // here the lock is released of the innerMethod , count goes to 1
        }
    }

    public static void main(String[] args) {
        ReenterantExample lock = new ReenterantExample();
        lock.outerMethod();
    }
}
