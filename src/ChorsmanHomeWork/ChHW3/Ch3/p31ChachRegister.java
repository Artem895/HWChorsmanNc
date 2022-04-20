package ChorsmanHomeWork.ChHW3.Ch3;

public class p31ChachRegister {
    private double purchase;
    private double payment;
    private int count;
    private double tax;
    public p31ChachRegister(double tax) {
        this.tax=tax;
    }
    public void recordPurchase(double amount)
    {
        purchase += amount;//скок стоит
        count++;

    }
    public double  getTotalTax(double amount){
        return (amount/100)*this.tax;
    }
    public void recordTaxablePurchase (double amount){
        purchase+=amount+getTotalTax(amount);
    }

    public void receivePayment(double amount)
    {
        payment+= amount;//скок заплатил
    }

    public double giveChange()
    {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
    public int getitemCount(){
        return count;
    }
}
