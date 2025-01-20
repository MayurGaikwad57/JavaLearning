package multithreading;

public class LifeCycle extends Thread {
    // Thread LifeCycle in detail
    @Override
    public void run() {
        System.out.println("Running");
       try{
           Thread.sleep(2000);
       } catch(InterruptedException e) {
           System.out.println(e);
       }
    }

    public static void main(String[] args) throws InterruptedException {
        LifeCycle threadObj = new LifeCycle(); // state here is NEW
        System.out.println(threadObj.getState()); //output the state
        threadObj.start(); // Here it is in Runnable state
/* 1) NOTE--> Even though for executing state we call it as running
but java thread lifecycle doesn't have any running state so the running state of thread
is also referred to as RUNNABLE state
  */
        System.out.println(threadObj.getState());
        Thread.sleep(200);
        System.out.println(threadObj.getState());
        threadObj.join();
        // Join waits for the thread to complete its execution , once the execution is complete
        // The state gets updated
        System.out.println(threadObj.getState());
    }
}
