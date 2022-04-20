package ChorsmanHomeWork.ChHW3.Ch9.progprojects;

import java.util.Locale;

public class King extends ChessPice {
    private String color;
    private int x;
    private int y;

    public King(String color) {
        this.color = color.toLowerCase();
        this.x=4;
        super.setName("King");
        //Locale.ROOT
        if(this.color.equals("black")){
            this.y=8;
        }else{
            this.y=1;
        }
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
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
        return "King{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
