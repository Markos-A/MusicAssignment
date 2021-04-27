
package Assignments;

import java.util.Scanner;

/**
 *
 * @author markose aycheh
 */
public class music {
   
    public static void main(String[] args) {
       
       buildLyricLineArray();
        
    }
    
    public static void testLyricLine(){
     
    LyricLine lineTest1 = new LyricLine();
    lineTest1.lineText = "Love By Musiq Soulchild";
    displayLyricLineInfo(lineTest1);
    
    }
    // test code for Arrays
    public static void buildLyricLineArray(){
    LyricLine[] superLyrics = new LyricLine[61];
    superLyrics[0] = new LyricLine("Love",3280);
    superLyrics[1] = new LyricLine("So many things I've got to tell you",4810);
    superLyrics[2] = new LyricLine("But I'm afraid I don't know how",4920);
    superLyrics[3] = new LyricLine("'Cause there's a possibility",2920);
    superLyrics[4] = new LyricLine("You'll look at me differently",2830);
    superLyrics[5] = new LyricLine("Love",3230);
    superLyrics[6] = new LyricLine("Ever since the first moment I spoke your name",5290);
    superLyrics[7] = new LyricLine("From then on I knew that by you being in my life",6760);
    superLyrics[8] = new LyricLine("Things were destined to change cause",3430);
    superLyrics[9] = new LyricLine("Love",3860);
    superLyrics[10] = new LyricLine("So many people use your name in vain",5630);
    superLyrics[11] = new LyricLine("Love",3920);
    superLyrics[12] = new LyricLine("Those who have faith in you sometimes go astray",5750);
    superLyrics[13] = new LyricLine("Love",3860);
    superLyrics[14] = new LyricLine("Through all the ups and downs the joy and hurt",5720);
    superLyrics[15] = new LyricLine("Love",3660);
    superLyrics[16] = new LyricLine("For better or worse I still will choose you first",11500);
    superLyrics[17] = new LyricLine("Many days I've longed for you",2900);
    superLyrics[18] = new LyricLine("Wanting you",2390);
    superLyrics[19] = new LyricLine("Hoping for the chance to get to know you",4760);
    superLyrics[20] = new LyricLine("Longing for your kiss",2790);
    superLyrics[21] = new LyricLine("For your touch, for your essence (your beautiful essence)",5950);
    superLyrics[22] = new LyricLine("Many nights I've cried from the things you do",4750);
    superLyrics[23] = new LyricLine("Felt like I could die from the thought of losing you",5020);
    superLyrics[24] = new LyricLine("I know that you're real",3360);
    superLyrics[25] = new LyricLine("With no doubt or no fears",2620);
    superLyrics[26] = new LyricLine("Or no questions",3160);
    superLyrics[27] = new LyricLine("Love",3110);
    superLyrics[28] = new LyricLine("So many people use your name in vain",5570);
    superLyrics[29] = new LyricLine("Love",3800);
    superLyrics[30] = new LyricLine("Those who have faith in you sometimes go astray",5700);
    superLyrics[31] = new LyricLine("Love",3110);
    superLyrics[32] = new LyricLine("Through all the ups and downs the joy and hurt",5770);
    superLyrics[33] = new LyricLine("Love",3950);
    superLyrics[34] = new LyricLine("For better or worse I still will choose you first",7900);
    superLyrics[35] = new LyricLine("At first you didn't mean that much to me",5430);
    superLyrics[36] = new LyricLine("But now I know that you're all I need",4800);
    superLyrics[37] = new LyricLine("The world looks so brand new to me",5120);
    superLyrics[38] = new LyricLine("Now that I found love",4900);
    superLyrics[39] = new LyricLine("Everyday I live for you",4050);
    superLyrics[40] = new LyricLine("And everything that I do I do it for you",5200);
    superLyrics[41] = new LyricLine("What I say is how I feel so believe it's true",4300);
    superLyrics[42] = new LyricLine("You got to know I'm true",3460);
    superLyrics[43] = new LyricLine("Love",3750);
    superLyrics[44] = new LyricLine("So many people use your name in vain",5670);
    superLyrics[45] = new LyricLine("Love",3830);
    superLyrics[46] = new LyricLine("Those who have faith in you sometimes go astray",5900);
    superLyrics[47] = new LyricLine("Love",3890);
    superLyrics[48] = new LyricLine("Through all the ups and downs the joy and hurt",5930);
    superLyrics[49] = new LyricLine("Love",3800);
    superLyrics[50] = new LyricLine("For better or worse I still will choose you first",6600);
    superLyrics[51] = new LyricLine("Love",3800);
    superLyrics[52] = new LyricLine("So many people use your name in vain",5690);
    superLyrics[53] = new LyricLine("Love",3800);
    superLyrics[54] = new LyricLine("Those who have faith in you sometimes go astray",5890);
    superLyrics[55] = new LyricLine("Love",3800);
    superLyrics[56] = new LyricLine("Through all the ups and downs the joy and hurt",5750);
    superLyrics[57] = new LyricLine("Love",3800);
    superLyrics[58] = new LyricLine("For better or worse I still will choose you first",6260);
    superLyrics[59] = new LyricLine("Love",3800);
    superLyrics[60] = new LyricLine("So many people use your name in vain",4700);
    
    
    //passing array of lyricLine to karaoke simulatior
    karaokeSimulation(superLyrics);
    }
    // displayes lyrics with timing
    public static void karaokeSimulation(LyricLine[] tape){
        Scanner scan = new Scanner(System.in);
        String wait = scan.nextLine();
    for(int line = 0; line < tape.length; line++){
        
            LyricLine tempLine = tape[line];
            System.out.println(tempLine.lineText);
        try {
          Thread.sleep(tempLine.timeToDisplayMilli);
        }catch (InterruptedException ex) {
            
        }
        } //close for
   
    }//close karaoke
    
    private static void displayLyricLineInfo(LyricLine line){
    System.out.println("Text:" + line.lineText);
    System.out.println("time to display" + line.timeToDisplayMilli);
    
    }
}
