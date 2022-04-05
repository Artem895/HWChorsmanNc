package ChorsmanHomeWork.ChHW2;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.IOException;

public  class Car  extends Rectangle {
    private final int maxvoluem;
    private final String carBrand;
    private final int consumption;//расход топлива
    private int levelofFuel;
    private int mills;

    public Car(int  maxvoluem, int consumption,String carBrand) {
        super(0,271,20,20);
        super.setFill(Color.BLACK);
        this.maxvoluem = maxvoluem;
        this.consumption = consumption;
        this.carBrand=carBrand;
    }

    public int getConsumption() {
        return consumption;
    }

    public void zapravka(int fuellgal){

        this.levelofFuel+=fuellgal;
    }

    public int getLevelofFuel() {
        return levelofFuel;
    }

    public void movcar(){
            this.setX(this.getX() + 10);
            if(levelofFuel>0&&levelofFuel-consumption>0){
            this.levelofFuel-=this.consumption;
            }
    }
   public void ras(){
        this.levelofFuel-=this.consumption;
   }
}
