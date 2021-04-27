
package Assignments;

/**
 *
 * @author markose aycheh
 */
public class LyricLine { 
// member variables
public String lineText;
    public long timeToDisplayMilli;
    // constructor
    public LyricLine(){
        System.out.println("Inside no-arg constructor");
       lineText = "[no lyric]";
       // display time
       timeToDisplayMilli = 1000;
       
    }
    public LyricLine(String lt, long ms){
        System.out.println("Inside two-arg constractor:");
         System.out.println("Recieved lt: " + lt);
          System.out.println("Recieved ms: " + ms);
        lineText = lt;
        timeToDisplayMilli = ms;
    }
    
}
