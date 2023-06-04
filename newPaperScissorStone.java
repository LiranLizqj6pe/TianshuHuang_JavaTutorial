import java.util.*;

public class newPaperScissorStone {
    public static void main(String[] args){
        Random r = new Random();
        int i, variable;
        for (i = 0; i < 10; i ++){
            variable = r.nextInt(3);
            if (variable == 2){
                System.out.print("Stone " + variable);
            }
            else if (variable == 0){
                System.out.print("Scissor " + variable);
            }
            else{
                System.out.print("Paper " + variable);
            }
        }
    }
}
