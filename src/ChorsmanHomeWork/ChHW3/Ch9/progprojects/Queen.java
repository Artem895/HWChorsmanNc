package ChorsmanHomeWork.ChHW3.Ch9.progprojects;

public class Queen extends ChessPice {
    private String color;
    private int x;
    private int y;

    public Queen(String color) {
        this.color = color.toLowerCase();
        this.x=3;
        super.setName("Queen");
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
        return "Queen{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
