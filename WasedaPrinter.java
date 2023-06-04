public class WasedaPrinter {
    public static void main (String[] args){
        int i = 64, j = 1;
        while (i >= j){
            System.out.print(i + " " + j);
            System.out.println(" Waseda");
            i = i/2;
            j = j*2;
        }
    }
}
