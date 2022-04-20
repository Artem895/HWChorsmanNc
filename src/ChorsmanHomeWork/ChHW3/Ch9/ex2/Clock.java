package ChorsmanHomeWork.ChHW3.Ch9.ex2;

import java.time.LocalTime;

public class Clock {
    private int alh;
    private int alm;
    public String getHours(){
        return LocalTime.now().toString().split(":")[0];
    }
    public String getMinutes(){
        return LocalTime.now().toString().split(":")[1];
    }
    public String getTime(){
        return this.getHours()+" "+this.getMinutes()+":Your Time"+this.alarm();
    }
    public void setAlarm(int hours,int minutes){
        this.alh=hours;
        this.alm=minutes;
    }
    //LocalTime.now()
    private String alarm(){
        if(Integer.parseInt(this.getHours())==this.alh&&Integer.parseInt(this.getMinutes())==this.alm){
            this.alh=0;
            this.alm=0;
            return "Тревога!!!!";
        }
        else return " ";
    }


}
