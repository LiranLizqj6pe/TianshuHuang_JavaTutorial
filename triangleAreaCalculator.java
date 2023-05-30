import java.util.Scanner;

public class triangleAreaCalculator {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();
        double area = triangle(base,height);
        System.out.println(area);
    }

    public static double triangle (int a, int b){
        return (float) a * b / 2;
    }
}
