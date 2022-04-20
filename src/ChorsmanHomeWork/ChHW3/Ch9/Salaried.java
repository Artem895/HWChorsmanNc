package ChorsmanHomeWork.ChHW3.Ch9;

public class Salaried extends Employee{
    private double annulsalary;
    private  final int WEEKS_PER_YEAR = 52;
    public Salaried(String name,double annulsalary) {
        super(name);
        this.annulsalary=annulsalary;
    }

    @Override
    public double weeklyPay(int hoursWorked) {
        return this.annulsalary/WEEKS_PER_YEAR;
    }
}
