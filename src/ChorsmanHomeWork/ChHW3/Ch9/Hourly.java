package ChorsmanHomeWork.ChHW3.Ch9;

public class Hourly extends Employee{
    private double hourlyWage;

    public Hourly(String name,double hourlyWage) {
        super(name);
        this.hourlyWage=hourlyWage;
    }

    @Override
    public double weeklyPay(int hoursWorked) {
        double salary=hoursWorked*this.hourlyWage;
        if(hoursWorked>40){
            salary+=(hoursWorked-40)*0.5*this.hourlyWage;
        }
        return salary;
    }
}
