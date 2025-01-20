package customExceptions;

public class InsufficientFundsException extends Exception {
    private double amount ;

    InsufficientFundsException(double amount){
        super("You dont have money work hard sir");
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }
}
