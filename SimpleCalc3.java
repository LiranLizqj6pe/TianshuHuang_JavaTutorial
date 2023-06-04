public class SimpleCalc3 {
    public static void main(String[] args){
        int i = 0;
        while(i < 10){
            if (i % 2 != 0){
                i ++;
            }
            else{
                i = i+3;
            }
            System.out.println(i);
        }
    }
}
