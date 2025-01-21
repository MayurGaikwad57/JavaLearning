package synchronization;

public class Threads extends Thread {
     private Counter counter;

     public Threads(Counter counter){
          this.counter = counter;
     }

    @Override
    public void run() {
      for (int i = 0; i< 1000; i++) {
          counter.setCounter();
          /*1) we are not getting 2000 as output when it is expected because, both threads are simultaneously
          * updating the counter ,i.e same object count is being modified by both of them
          * so we are not getting excatly 2000 as return everytime , instead we are getting random values  */
      }
    }
}
