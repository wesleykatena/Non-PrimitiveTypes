public class Matrix {
    public static void main(String[] args) {
        int n = 10, i, j, sum = 0;
        int matrix[][] = new int[n][n];

        for(i = 0; i < matrix.length; i++){
            for(j=0; j < matrix.length; j++){
                if(i == j) {
                    matrix[i][j] = i;
                    sum += matrix[i][j];
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The sum of highlighted elements in the array is equal to: " + sum);
    }
}
