public class nineByNineProd {
    public static void main (String[] args){
        int[][] array = new int [9][9];
        int i, j;
        for (i = 0; i < array.length; i ++){
            for (j = 0; j < array[i].length; j ++){
                array[i][j] = prod(i, j);
                System.out.print(array[i][j] + " ");
            }
            System.out.print("¥n");
        }
    }

    public static int prod(int a, int b){
        return (a+1) * (b+1);
    }
}
