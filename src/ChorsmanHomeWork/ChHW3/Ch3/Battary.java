package ChorsmanHomeWork.ChHW3.Ch3;

public class Battary {
    private double capacity;
    private double origcapacity;


    public Battary(double capacity) {
        this.origcapacity=capacity;
        this.capacity = capacity;
    }
    public void drain(double amount){
        this.capacity-=amount;
    }
    public void charge(){
        this.capacity=this.origcapacity;
    }
    public double getRemainingCapacity(){
        return this.capacity;
    }

}
