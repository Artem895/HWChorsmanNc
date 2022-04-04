package ChorsmanHomeWork.ChHW2;

import java.io.IOException;

public  class Car  {
    private final int maxvoluem;
    private final String carBrand;
    private final int consumption;//расход топлива
    private int levelofFuel;
    private int mills;

    public Car(int  maxvoluem, int consumption,String carBrand) {
        this.maxvoluem = maxvoluem;
        this.consumption = consumption;
        this.carBrand=carBrand;
    }
    public void zapravka(int fuellgal){

        this.levelofFuel+=fuellgal;
    }

    public int getLevelofFuel() {
        return levelofFuel;
    }

    public void start1(int mills){
        int i=0;
        if(this.levelofFuel==0){
            System.out.println("Заправте автомобиль");
        }
        else if(this.levelofFuel/this.consumption<mills){
            System.out.println("Нехватит топлива на весь путь , заправтесь ");
        }
        else {
            while (this.levelofFuel > 0 && i <= mills) {
                System.out.println("Бензина осталось на:" + this.levelofFuel / this.consumption + " миль");
                System.out.println("Уровень топлива:" + this.levelofFuel);
                this.levelofFuel -= this.consumption;
                i++;
            }
        }
    }
}
