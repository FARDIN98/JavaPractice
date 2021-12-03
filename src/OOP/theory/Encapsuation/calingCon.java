package OOP.theory.Encapsuation;

class Time{
    private int second;
    private int minute;
    private int hour;

    public Time(int second, int minute, int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    //writing getter method for private properties
    public int getSecond(){
        return second;
    }
    public int getMinute(){
        return minute;
    }
    public int getHour(){
        return hour;
    }
    //writing setter method for set the values of private property
    public void setSecond(int second){
        if (second >= 0 && second < 60){
            this.second = second;
        }
    }
    public void setMinute(int minute){
        if(minute >= 0 && minute < 60) {
            this.minute = minute;
        }
    }
    public void setHour(int hour){
        if(hour >= 0 && hour < 24) {
            this.hour = hour;
        }
    }
}

public class calingCon{
    public static void main(String[] args) {
        Time t = new Time();
        t.setSecond(20);
        t.setMinute(40);
        t.setHour(10);
        System.out.println("Second: " + t.getSecond());
        System.out.println("Minute: " + t.getMinute());
        System.out.println("Hour: " + t.getHour());

    }
}
