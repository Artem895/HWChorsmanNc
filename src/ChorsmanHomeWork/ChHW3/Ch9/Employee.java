package ChorsmanHomeWork.ChHW3.Ch9;

public abstract class Employee {
    private String name ;

    public Employee(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
    public abstract double weeklyPay(int hoursWorked);
}
