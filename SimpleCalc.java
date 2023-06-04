public class SimpleCalc {
    public static void main(String[] args){
        int i,j;
        for (i = 0; i < 2; i ++){
            for (j = 0; j <= 3; j ++){
                if ((i+j)%2 == 0){
                    System.out.println("Hello.");
                }
                else{
                    System.out.println(i+j);
                }
            }
        }
    }
}
