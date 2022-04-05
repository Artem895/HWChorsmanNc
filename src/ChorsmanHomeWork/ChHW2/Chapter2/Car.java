package ChorsmanHomeWork.ChHW2.Chapter2;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public  class Car extends ImageView {
    private final int maxvoluem;
    private final String carBrand;
    private final int consumption;//расход топлива
    private int levelofFuel;
    private int mills;

    public Car(int  maxvoluem, int consumption,String carBrand) throws FileNotFoundException {
        super( new Image(new FileInputStream("src/ChorsmanHomeWork/ChHW2/Chapter2/car.jpg")));
        super.setFitWidth(30);
        super.setFitHeight(30);
        super.setY(260);
        this.maxvoluem = maxvoluem;
        this.consumption = consumption;
        this.carBrand=carBrand;
    }
    public int zapashoda(){
        return this.levelofFuel/this.consumption;
    }
    public int getConsumption() {
        return consumption;
    }

    public int getMaxvoluem() {
        return maxvoluem;
    }

    public void zapravka(int fuellgal){
        if(this.levelofFuel<this.maxvoluem){
                this.levelofFuel+=fuellgal;
        }
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
