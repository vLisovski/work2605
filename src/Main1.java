public class Main1{
    public static void main(String[] args) {
        int n = 5, m = 5;

        int[][] mas = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //if (i <= j) {
                //if (i >= j) {
                //if (i+j==m-1) {
                //if ((i<=j && (i+j>m-2)) || (i<=j && (i+j<=m-1))) ???  {
                //if ((i<=j && (i+j>m-2)) || (i>=j && (i+j<=m-1)))  {
                //if (i==n/2 || j==m/2){
                //if (i==n/2){
                //if (i==m/2){
                if (i==n/2 || j==m/2){
                    mas[i][j] = 1;
                } else {
                    mas[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }
    }
}
