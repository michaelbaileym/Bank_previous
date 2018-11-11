package bank;

import java.util.ArrayList;
import java.util.List;

public class Account implements AccountInterface {
    private double balance;
    private boolean accountOpenStatus;
    private List<TransactionRecord> transactionRecord;
    TransactionRecord transactionEvent;
    private int transactionCount = 0;

    /**
     * constructs a new instance of account with a $0 balance and a account
     * open status of true
     */
    public Account() {
        this.balance = 0.0f;
        this.accountOpenStatus = true;
        this.transactionEvent = new TransactionRecord();
        this.transactionRecord = new ArrayList<>();
    }

    /**
     * Deposits a double value into a customer account instance
     * @param amount is a double dollar amount that is to be deposited into the
     *               customer account
     * @throws AccountClosedException if the accountOpenStatus is false
     * @throws IllegalArgumentException if the deposit amount is a negative number
     */
    public void deposit(double amount) throws AccountClosedException, IllegalArgumentException{
       if (this.accountOpenStatus == false){
           throw new AccountClosedException("Account Closed");
       } else if (amount < 0){
           throw new IllegalArgumentException("Illegal Argument");
       } else{
           this.balance += amount;
           addTransactionRecord("Deposit", amount);
       }
    }

    /**
     * Withdraws a double value from the customer Account Instance
     * @param amount a non negative double value that is withdrawn from the account
     *               balance.
     * @throws InsufficientFundsException if the withdrawal account is a negative
     * value.
     * @throws AccountClosedException if the accountOpen status is closed.
     */
    public void withdraw(double amount) throws InsufficientFundsException, AccountClosedException {
        if (this.accountOpenStatus == false){
            throw new AccountClosedException("Account closed");
        } else if (amount > this.getBalance()){
            throw new InsufficientFundsException("Insufficient balance");
        } else{
            this.balance -= amount;
            addTransactionRecord("Withdraw", amount);
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public void addTransactionRecord(String transactionType, double amount){
        transactionEvent.setTransactionType(transactionType);
        transactionEvent.setTransactionAmount(amount);
        transactionRecord.add(transactionEvent);
    }


    public List<TransactionRecord> getTransactionRecords() {
        return transactionRecord;
    }

    public void printTransactions(){
        //System.out.println(getTransactionRecords().toString());
        for(int i = 0 ; i < transactionRecord.size(); i++){
            System.out.println(transactionRecord.get(i).getTransactionType());
            System.out.println(transactionRecord.get(i).getTransactionAmount());
        }
    }
}
