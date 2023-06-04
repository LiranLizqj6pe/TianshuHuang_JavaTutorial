public class Football_Calendar {
    public static void main (String[] args){
        int i,j, rugby[] = new int[100];
        int count = 0;
        for (i = 1987; i <= 2100; i ++){
            if (i % 4 == 3){
                rugby[count++] = i;
            }
        }
        for (j = 0; j < count; j ++){
            System.out.print(rugby[j] + " ");
        }
        System.out.println();
        System.out.println(count + "times");
    }
}
