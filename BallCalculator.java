import java.util.Scanner;

public class BallCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println("Radius: " + radius);
        System.out.println("Volume: " + volume(radius));
        System.out.println("Area " + area(radius));
    }

    public static double volume (Double r){
        return 4.0 * 3.14 * r * r * r / 3.0;
    }

    public static double area (Double r){
        return 4.0 * 3.14 * r * r;
    }
}
