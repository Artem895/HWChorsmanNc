package ChorsmanHomeWork.ChHW3.Ch9.progprojects;

public class Rook extends ChessPice{
    private String color;
    private char side;
    private int x;
    private int y;

    public Rook(String color,char side) {
        this.color = color.toLowerCase();
        this.side=side;
        super.setName("Rook");
        //Locale.ROOT
        if(this.color.equals("black")){
            this.y=8;
        }else{
            this.y=1;
        }
        if(this.side=='l'){
            this.x=0;
        }else this.x=7;
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
        return "Rook{" +
                "color='" + color + '\'' +
                ", side=" + side +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
