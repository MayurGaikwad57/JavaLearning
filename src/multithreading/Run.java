package multithreading;

public class Run implements Runnable {
    @Override
    public void run() {
        for( ; ; ) {
            System.out.println("Runnable");
        }
    }
    /*   WHEN TO USE THREADS AND RUNNABLE INTERFACE
    * 1) Suppose you have a situation, where you there is a class which is extending
    * anothere class in that case you have to use RUNNABLE interface
    * example-> 1) class B{
    *
    * }
    * class A extends B , Thread {
    *
    * }
    * In this case you cannot extend the THREAD class and use as multiple inheritance is not
    * supported in JAVA so in that case we have to implement the RUNNABLE Interface
    * When no other class is extended at that time you can use THREAD or RUNNABLE Interface
    * class A extends Thread {

    * }
    * Here you can also implement the runnable interface
    * class A implements Runnable Interface {

    * }
    *    */
}
