public class XY {
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        if (x >= 10 && y >= 10){
            x = x / 2;
            y = y + x;
        }
        else
            x = x * 2;
            y = y + x;
        System.out.println(x + ", " + y);
    }
}
