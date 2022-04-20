package ChorsmanHomeWork.ChHW3.Ch3;

public class Student {
    private String name;
    private double alltestbal;
    private int count;

    public Student(String name) {
        this.name = name;
    }

    public double getTotallScore() {
        return alltestbal;
    }

    public String getName() {
        return name;
    }
    public void addQuiz(int score){
        this.alltestbal+=score;
        count++;
    }
    public double getAverageScore(){
        return this.alltestbal/count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", alltestbal=" + alltestbal +
                ", count=" + count +
                '}';
    }
}
