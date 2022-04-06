package ChorsmanHomeWork.ChHW2.Chapter3;

public class Employ implements Measurable{
    private int salary;
    private String Name;

    public Employ(int salary,String name) {
        this.salary = salary;
        this.Name=name;
    }

    public String getName() {
        return Name;
    }

    @Override
    public double getMeasure() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "salary=" + salary +
                ", Name='" + Name + '\'' +
                '}';
    }
}
