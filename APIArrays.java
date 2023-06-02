import java.util.Arrays;

public class APIArrays {
    public static void main (String[] args){
        int height[] = {170,140,150,190,130,200,180};
        int i, tmp;
        for (i = 0; i < height.length; i ++){
            System.out.print(height[i] + " ");
        }
        System.out.print("¥n");
        Arrays.sort(height);
        for (i = 0; i < height.length/2; i ++){
            tmp = height[i];
            height[i] = height[height.length-1-i];
            height[height.length-1-i] = tmp;
        }
        for (i = 0; i < height.length; i ++){
            System.out.print(height[i] + " ");
        }
        System.out.print("¥n");
    }
}
