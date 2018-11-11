package bank;


public class TransactionRecord {
    private int transactionNumber;
    private String transactionType;
    private double transactionAmount;


    public TransactionRecord(){
        this.transactionType = "Account Open";
        this.transactionAmount = 0.0d;
    }

    public TransactionRecord(String transactionType, double transactionAmount){
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionType(){
        String gTT = this.transactionType;
        return gTT;
    }

    public double getTransactionAmount(){
        double gTA = this.transactionAmount;
        return gTA;
    }



}
