package ChorsmanHomeWork.ChHW3.Ch3;

public class Sheet {
    private int width;
    private int height;
    private int count;
    private String name;

    public Sheet() {
        this.height=1189;
        this.width=841;
        this.name="A0";
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
    public void cutHalf(){
        int x=this.width;
        this.width=this.height/2;
        count++;
        this.height=x;
        this.name="A"+count;
    }

    @Override
    public String toString() {
        return "Sheet{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
