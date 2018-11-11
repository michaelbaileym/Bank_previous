package test;

import bank.Account;
import bank.AccountClosedException;

public class test {

    public static void main(String[] args){
        Account TestAccount = new Account();

        try{
            TestAccount.deposit(5.00d);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("New Balance: " + TestAccount.getBalance());

        try{
            TestAccount.withdraw(1.00d);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("New Balance: " + TestAccount.getBalance());

        TestAccount.printTransactions();
    }




}
