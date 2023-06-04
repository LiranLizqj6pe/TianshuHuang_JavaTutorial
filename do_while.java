public class do_while {
    public static void main(String[] args){
        int i = 0;
        int counter = 0;
        do{
            ++i;
            System.out.println("Hoge.");
            counter ++;
        }while(i <= 50);
        System.out.println(counter);
    }
}
