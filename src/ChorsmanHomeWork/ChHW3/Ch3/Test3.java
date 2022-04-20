package ChorsmanHomeWork.ChHW3.Ch3;

import ChorsmanHomeWork.ChHW3.Ch3.Student;

public class Test3 {
    public static void main(String[] args) {
        /*PWFp36 p=new PWFp36("Jeck");
        PWFp36 p1=new PWFp36("Vasiliy");
        PWFp36 p2=new PWFp36("Artem");
        PWFp36 p3=new PWFp36("Bob");
        PWFp36 p4=new PWFp36("Gek");
        p.befriend(p1);
        p.befriend(p2);
        p.befriend(p3);
        p.befriend(p4);
        p4.befriend(p2);
        p1.befriend(p3);
        p2.befriend(p1);
        System.out.println(p.getFriends()+"-Jeck friends ");
        p.getFreindcount();
        System.out.println(p4.getFriends()+"-Gek friends ");
        p.unfriend(p4);
        System.out.println(p.getFriends()+"-Jeck friends ");
        p.getFreindcount();
        System.out.println(p4.getFriends()+"-Gek friends ");
        System.out.println(p1.getFriends()+"-Vasiliy friends ");*/
        Student student=new Student("Artem");
        student.addQuiz(12);
        student.addQuiz(22);
        student.addQuiz(42);
        student.addQuiz(61);
        System.out.println(student.getName());
        System.out.println(student.getAverageScore());
        System.out.println(student.getTotallScore());
    }
}
