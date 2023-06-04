import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double height, weight, bmi;
        height = scan.nextDouble();
        weight = scan.nextDouble();
        System.out.println("Height: " + height * 100 + "(cm).");
        System.out.println("Weight: " + weight + "(kg).");
        bmi = weight / height / height;
        System.out.println("BMI: " + bmi);
        if (bmi < 18.5){
            System.out.println("Low Weight.");
        }
        else if (18.5 <= bmi && bmi < 25){
            System.out.println("Normal Weight.");
        }
        else if (25 <= bmi && bmi < 30){
            System.out.println("Fat Level 1.");
        }
        else{
            System.out.println("Fat Level 2.");
        }
    }
}
