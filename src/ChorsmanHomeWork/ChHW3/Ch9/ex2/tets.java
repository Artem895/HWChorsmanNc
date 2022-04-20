package ChorsmanHomeWork.ChHW3.Ch9.ex2;

public class tets {
    public static void main(String[] args) {
        Clock clock=new Clock();
        clock.setAlarm(12,12);
        System.out.println(clock.getHours());
        System.out.println(clock.getMinutes());
        System.out.println(clock.getTime());
        WordClock wordClock=new WordClock(3);
        wordClock.setAlarm(12,13);//Будильнил работает и на мировом и на локальном времени
        System.out.println(wordClock.getHours());
        System.out.println(wordClock.getMinutes());
        System.out.println(wordClock.getTime());

    }
}
