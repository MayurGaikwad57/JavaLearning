package lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

//    public synchronized void withDraw(int amount){
//        System.out.println(Thread.currentThread().getName()+"Attempting to withdraw money");
//        if(balance>=amount){
//            System.out.println(Thread.currentThread().getName()+"Procedding with withdrawl");
//            try{
//              Thread.sleep(3000);
//              // here the thread is sleeping for 3 sec but the thread 2 doesn't know about it

//    thread 2 will start its execution after thread 1 completes its execution
//   but suppose in case if we are making a db call , then maybe the 3sec task might get delayed
//    but the thread 2 will wait for 1st one to complete its execution
//            } catch(Exception e){
//                System.out.println(e);
//            }
//            balance-= amount;
//            System.out.println("Balance after withdrawl is"+balance);
//        } else{
//            System.out.println("Insufficient Balance");
//        }
//    }

    // LOCK METHODS --> lock.lock , tryLock() , tryLock(longTime,timeUnits) , unlock()
    public void withDraw(int amount) {
        System.out.println(Thread.currentThread().getName() + "Attempting to withdraw money");
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
              if(balance>=amount) {
                  try{
                      System.out.println(Thread.currentThread().getName()+"Proceeding to withdraw amount");
                      Thread.sleep(3000);
                      balance-= amount;
                      System.out.println(Thread.currentThread().getName()+"Completed Withdrawl");
                  } catch(Exception e){
                      Thread.currentThread().interrupt();
                  }
                  finally{
                      lock.unlock();
                  }

              } else {
                  System.out.println(Thread.currentThread().getName()+"Insufficient balance ");
              }

            } else{
                System.out.println(Thread.currentThread().getName()+"Unable to acquire lock");
            }
        } catch(Exception e) {
            Thread.currentThread().interrupt();
//ensures that the state of the thread is restored , while monitoring and maintainenece activity it helps
//additionally,if you want to perform certain tasks when the thread is interrupted you can do it now
 //                        if(Thread.interrupted()) {
//                            // some task
//                       }
        }
    }
}

/* lock.lock() ==> What it does:
Acquires the lock. If the lock is already held by another thread, the current thread will wait (block) until the lock becomes available.
When to use: Use this when you want to ensure only one thread can execute a critical section of code at a time.
 2) lock.tryLock() ==> 1) Tries to acquire lock immediately
                       2) returns true if it acquires immediately
                       3) false if fails to acquire
 When to use : 1) for non-blocking behaviour
               2) if lock is already acquired , then you can do other tasks without waiting
3) lock.tryLock(time,timeUnits) : 1)waits for the specified time to acquire the lock , if lock is not acquired
    in that specific time , returns false
  when to use : 1) if you want to wait for a specified duration  but avoid for indefinite blocking
4) lock.unlock() : 1) It us used to release the lock held by the thread
                   2) always use it in finally block,so that lock is released even if exception occurs
                   3) if the thread does not hold the lock it will throw an IllegalMonitorState Exception
*/
