package synchronization;

public class Main {
    public static void main(String[] args) {
        Counter count = new Counter();
        Threads t1 = new Threads(count);
        Threads t2 = new Threads(count);
        /* Here threads t1 and t2 both are sharing the same object count ,
        * as the same resource is being shared there are issues in getting the same output as
        * both are getting updated at the same time
        * NOTE-->1) The above situation is also called as race condition , where two threads are trying to access
        * the same resource     */
        t1.start();
        t2.start();
        try{
            t1.join(); // join method will ensure that as soon as thread finishes execution , next one can start
            t2.join(); // t2 starts as t1 finishes
        } catch(Exception e){
            System.out.println(e);
        }
        System.out.println(count.getCounter());
    }
}

/*  PROBLEMS WITH SYNCHRONIZATION
1) Indefinite blocking of thread
2) It doesn't have fairness , meaning thread can die of starvation
3) Interruptibility , meaning you cannot interrupt the thread
4) It doesn't know about READ/WRITE lock , haas no idea which is read lock or write lock
                      All these shortcomings can be overcome by explicit locks
 */
