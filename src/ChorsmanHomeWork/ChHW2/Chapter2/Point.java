package ChorsmanHomeWork.ChHW2.Chapter2;

public final class Point {
    private final double x;
    private final double y;


    public Point(double y,double x) {
        this.y = y;
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public Point translate(double dx, double dy){
        Point np =new Point(this.x+dx,this.y+dy);
        return np;
    }
    public Point scale(double k){
        Point np =new Point(this.x*k,this.y*k);
        return np;

    }
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
