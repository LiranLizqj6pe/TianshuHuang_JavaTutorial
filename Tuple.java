public class Tuple {
    public static void main(String[] args){
        int i,j;
        for (i = 0; i <= 4; i ++){
            for (j = 0; j <= Math.min(i,4-i); j++){
                System.out.print("(" + i + ", " + j + ")");
            }
            System.out.println();
        }
    }
}
