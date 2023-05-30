import java.util.Scanner;

public class calc {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int i, j;
        int size = s.nextInt();
        for (i = 0; i < size; i ++) {
            for (j = 0; j < size; j++) {
                calc(i + 1, j + 1);
            }
            System.out.println();
        }
    }
    public static void calc(int a, int b){
        int temp = a + b;
        System.out.print(temp + " ");
    }
}
