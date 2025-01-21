package multithreading;

public class Priority extends Thread{

    public Priority(String name){
        super(name); // we can pass name in the constructor where we create instance of thread
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is-" +Thread.currentThread().getName()+ "-multithreading.Priority- " +Thread.currentThread().getPriority() +" Count is " + i);
        }
        try{
            Thread.sleep(1000);
        } catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
       Priority  t1 = new Priority("Mayur");
       Priority t2 = new Priority("Anil");
       Priority t3 = new Priority("Ashish");
       // The above is the way to give names to the thread to easily identify thread
       t1.setPriority(MIN_PRIORITY);
       t2.setPriority(NORM_PRIORITY);
       t3.setPriority(MAX_PRIORITY);
       // Here we are setting the priorities of the thread , min is 1 ,norm is 5 and max is 10
/* NOTE--> 1) Setting the priorities of the thread doesn't mean that they will execute according to
* priorities set by you
* 2) It is a way to inform JVM about the priorities of the thread
* 3) They can be executed in any order
 */
        t1.start();
        t2.start();
        t3.start();
    }
}
