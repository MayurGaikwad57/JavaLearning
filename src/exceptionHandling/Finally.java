package exceptionHandling;

public class Finally {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(divide(a,b));
    }
    static int divide(int a , int b){
        try{
            return a/b;
        }
        catch(Exception e){
            System.out.println(e);
            return -1;
        }
        finally {
            // finally will always execute even if the exception is caught or not
            // this is used when even after returning something you want to do some
            // additional tasks in that case it is very useful
            System.out.println("Statement printed after exception caught");
        }
    }
}

class name {
    public static void main(String[] args) {
        try{
            int c = 10/0;
            System.out.println(c);
        } catch(Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Execution is fixed");
        }
    }
}

