class Time{
    int hour, minute, second;
    
    Time(){
        // this.hour = 0;
        // this.minute = 0;
        // this.second = 0;
        this(0, 0, 0);
    }
    
    // Validate and assign
    // hour - 0 to 23
    // minute - 0 to 59
    // second - 0 to 59
    Time(int hour, int minute, int second){
        if(hour >= 0 && hour <= 23) {
            // object's hour = parameters hour
            this.hour = hour;
        }
        if(minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
        if(second >= 0 && second <= 59) {
            this.second = second;
        }
    }
    
    // Validate and assign
    Time(int hour, int minute) {
        this(hour, minute, 0);
        // if(hour >= 0 && hour <= 23) {
        //     // object's hour = parameters hour
        //     this.hour = hour;
        // }
        // if(minute >= 0 && minute <= 59) {
        //     this.minute = minute;
        // }
        // this.second = 0;
    }
    
    // Format - HH:MM:SS Ex. 07:08:09
    void display(){
        System.out.printf("%02d:%02d:%02d\n", this.hour, this.minute, this.second);
    }
    
    Time secondsToTime(int seconds){
        int hour = seconds / 3600;
        seconds = seconds % 3600;
        int minute = seconds / 60;
        seconds = seconds % 60;
        int second = seconds;
        return new Time(hour, minute, second);
    }
    
    Time add(Time time2){
        int time1InSeconds = this.hour * 3600 + this.minute * 60 + this.second;
        int time2InSeconds = time2.hour * 3600 + time2.minute * 60 + time2.second;
        int sum = time1InSeconds + time2InSeconds;
        return this.secondsToTime(sum);
    }
    
    Time subtract(Time time2){
        int time1InSeconds = this.hour * 3600 + this.minute * 60 + this.second;
        int time2InSeconds = time2.hour * 3600 + time2.minute * 60 + time2.second;
        int diff = Math.abs(time1InSeconds - time2InSeconds);
        return this.secondsToTime(diff);
    }
}

public class ThisOperator{
    public static void main(String args[]){
        Time time1 = new Time(11, 45, 23);
        Time time2 = new Time(2, 34);
        Time time3 = new Time();
        
        System.out.println("Time 1");
        time1.display(); // 11:45:23
        // display(time1), this = time1
        System.out.println("Time 2");
        time2.display(); // 02:34:00
        // display(time2), this = time2
        
        // Find out time1 + time2 and store in 
        // a variable sum
        Time sum = time1.add(time2); // add(time1, time2), this = time1
        
        System.out.println("Sum");
        sum.display();
        // Find out time1 - time2 and store in 
        // a variable diff
        Time diff = time1.subtract(time2); // subtract(time1, time2), this = time1
        System.out.println("Difference");
        diff.display();
        
    }
}