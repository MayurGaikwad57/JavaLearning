package customExceptions;

public class Bank {
    private double balance;
    public Bank(double amount){
        this.balance = amount;
    }
    public void withdraw(double amount) throws InsufficientFundsException{
       if(amount>balance)  {
           throw new InsufficientFundsException(amount);
       }
       balance-=amount;
    }
}
