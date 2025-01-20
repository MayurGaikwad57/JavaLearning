package multithreading;

public class Threads extends Thread {
 // To create thread you have to create a class and extend the thread class
 // then we will override a method run() and write code to perform actions inside run method
 // whatever code we write will run on new thread
 // start method will be called to initiate the new thread
    @Override
    public void run() {
        for(; ;) {
            System.out.println(java.lang.Thread.currentThread().getName());
            // will output the name of the current thread
        }
    }
}
