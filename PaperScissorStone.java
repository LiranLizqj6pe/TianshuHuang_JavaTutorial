import java.awt.desktop.SystemEventListener;
import java.util.*;

public class PaperScissorStone {
    public static void main(String[] args){
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        int me, you;
        int i;
        int win = 0, lose = 0, draw = 0;
        int trial = scan.nextInt();
        for (i = 0; i < trial; i ++){
            me = scan.nextInt();
            you = r.nextInt(3);
            if ((me + 1) % 3 == you){
                System.out.print("I win! (" + me + "," + you + ")");
                win ++;
            }
            else if ((me + 2) % 3 == you){
                System.out.print("I lost! (" + me + "," + you + ")");
                lose ++;
            }
            else{
                System.out.print("Tie game! (" + me + "," + you + ")");
            }
        }
        System.out.println();
        System.out.println("Won: " + win + " Lost: " + lose + " Tied: " + (trial - win - lose));
    }
}
