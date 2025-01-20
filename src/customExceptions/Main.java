package customExceptions;

public class Main {
    public static void main(String[] args) {
        Bank take = new Bank(10);
        try{
            take.withdraw(11);
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
