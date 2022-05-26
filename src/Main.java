import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int columns = 3;
        int lines  = 5;

        int[][] mas = new int[lines][columns];

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                mas[i][j] = random.nextInt(50);
            }
        }
        //show
        System.out.println("basic mas:");
        for (int i = 0; i < lines; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(mas[i][j]+" ");
            }
        }
        //reverse
        int[][] newMas = new int[columns][lines];

        for (int j = 0; j < columns; j++) {
            System.out.println();
            for (int i = 0; i < lines; i++) {

                newMas[j][i] = mas[i][j];
            }
        }
        //showNew
        System.out.println("lines is columns mas:");
        for (int i = 0; i < columns; i++) {
            System.out.println();
            for (int j = 0; j < lines; j++) {
                System.out.print(newMas[i][j]+" ");
            }
        }

        //reverse2
        int[][] newMas2 = new int[lines][columns];

        for (int i = lines-1, m = 0; i >= 0 && m<lines ; i--, m++) {
            System.out.println();
            for (int j = columns-1, n=0; j>=0 && n<columns; j--, n++) {

                newMas2[m][n] = mas[i][j];
            }
        }
        //showNew2
        System.out.println("reverse mas:");
        for (int i = 0; i < lines; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(newMas2[i][j]+" ");
            }
        }

        //reverse3
        int[][] newMas3 = new int[columns][lines];

        for (int i = columns-1, m = 0; i >= 0 && m<columns ; i--, m++) {
            System.out.println();
            for (int j = lines-1, n=0; j>=0 && n<lines; j--, n++) {

                newMas3[m][n] = mas[j][i];
            }
        }

        //showNew3
        System.out.println("reverse lines is column mas:");
        for (int i = 0; i < columns; i++) {
            System.out.println();
            for (int j = 0; j < lines; j++) {
                System.out.print(newMas3[i][j]+" ");
            }
        }

    }
}
