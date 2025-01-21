package synchronization;

public class Counter {
    private int counter = 0;
    public synchronized void setCounter(){
          counter++;
    }
    /* Keyword synchronized makes sure
   1) Only one thread can the method setCounter() at given time
   2) when one particular thread has access to the setCounter() method the others will wait
   3) other threads cannot access the setCounter() method until that particular threads completes its execution
   4) The above method is called as critical section which means ,the shared resource is being updated here
   5) Mutual exclusion is another term , which ensures multiple threads should not access the shared resource
      */
    /* 1) we do not have to make the entire method as synchronized , suppose if we have many tasks that one
    method handles then we can make only that particular block as synchronized
    example --->  synchronized(this){
                    count++ ;
this keyword here refers to the scope that is the block in which the synchronized keyword is used
                        }
                   */
    public int getCounter(){
        return counter;
    }
}
