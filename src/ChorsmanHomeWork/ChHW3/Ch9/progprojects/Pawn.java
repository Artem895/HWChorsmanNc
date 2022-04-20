package ChorsmanHomeWork.ChHW3.Ch9.progprojects;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;

public class Pawn extends ChessPice {
    private String color;
    private int  x;
    private int y;
    private ImageView vpawn;

    public Pawn(String color,int x) throws FileNotFoundException {
        this.color=color.toLowerCase(Locale.ROOT);
        this.x=x;
        super.setName("Pawn");
        //Locale.ROOT
        if(this.color.equals("black")){
            this.y=7;
        }else{
            this.y=2;
        }
        Image pawn1=new Image(new FileInputStream("src/ChorsmanHomeWork/ChHW3/Ch9/progprojects/img_2.png"));
        this.vpawn = new ImageView(pawn1);

    }

    public ImageView getVpawn() {
        return vpawn;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }
    @Override
    public void setposition(String s) {
        super.setposition(s);
    }

    @Override
    public String toString() {
        return "Pawn{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
