package multithreading;

public class Main {
    public static void main(String[] args) {
        Threads threadObj = new Threads();
        // here when we create the object the thread is in NEW state
        threadObj.start(); // will start executing the thread
//The above execution is RUNNABLE state means it is ready to start and waiting for cpu resources

        Run secondThreadObj = new Run(); // first create instance of the class
        Thread t2 = new Thread(secondThreadObj); //next create instance of thread
        t2.start(); // now we can use run method here
// The above way of creating threads is when you use runnable interface

        for( ; ; ){
            System.out.println(java.lang.Thread.currentThread().getName());
        }
        // here we are executing two thread concurrently
        // there is no order here , as they are executed concurrently
        // system.out.println(Thread.currentThread().getName()) will output current thread name
    }
}
