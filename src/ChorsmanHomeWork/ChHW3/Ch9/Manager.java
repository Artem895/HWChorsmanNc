package ChorsmanHomeWork.ChHW3.Ch9;

public class Manager extends Salaried{
    private  double bonus;
    public Manager(String name, double annulsalary,double bonus) {
        super(name, annulsalary);
        this.bonus=bonus;
    }

    @Override
    public double weeklyPay(int hoursWorked) {
        return super.weeklyPay(hoursWorked)+bonus;
    }
}
