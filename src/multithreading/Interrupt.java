package multithreading;

public class Interrupt extends Thread{

    public Interrupt(String name){
        super(name);
    }

    @Override
    public void run() {
       try{
           Thread.sleep(1000);
           System.out.println("Running the Thread");
       }
       catch(Exception e){
           System.out.println(e);
       }
    }

    public static void main(String[] args) {
        Interrupt t1 = new Interrupt("Interrupting");
        t1.start();
        t1.interrupt();
        /* multithreading.Interrupt method will make sure that thread stops whatever work it is doing
        * in our case the thread is sleeping and we have interrupted it so we get an exception
        * sleep interrupted              */
    }
}
