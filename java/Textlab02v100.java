/**
 * Kim Luong
 * Computer Science 1 Pre-ap (Period 3)
 * Assignment: 100-point version
 * Breakdown 10000123 milliseconds into hours, minutes, seconds, and milliseconds.
 */
public class Textlab02v100{
    public static void main(String args[])    {
        int ans;
        int startingSeconds= 10000123;
        int hr= 3600000;
        int min= 60000;
        int sec= 1000;
        int minAns;
        int minSec;
        //State the Starting Seconds
        System.out.println("Starting Milli-seconds: " + startingSeconds);
        //Use integer division to determine hours
        ans=startingSeconds/hr;
        System.out.println("Hours: " + ans);
        //Use remainder division to help determine minAns
        ans=startingSeconds%hr;
        minAns=ans/min;
        System.out.println("Minutes: " + minAns);
        //Use remainder division to help determine minSec
        minAns=ans%min;
        minSec=minAns/sec;
        System.out.println("Seconds: " + minSec);
        //use use integer division for the milli-seconds
        minSec=ans%sec;
        System.out.println("Milli-Seconds: " + minSec);
    }
}