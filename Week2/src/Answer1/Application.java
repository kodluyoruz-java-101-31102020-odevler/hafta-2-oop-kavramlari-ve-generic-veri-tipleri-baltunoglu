package Answer1;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matrisin boyutunu NxN olacak þekilde giriniz:");
        int a = scanner.nextInt();		
		int[][] spiralMatrix =new int[a][a];
        
        fillMatrix(spiralMatrix);
        System.out.println("Oluþturulan spiral matris:");
        printArrayElements(spiralMatrix);
        System.out.println();
        System.out.println("Oluþturma sýrasýna göre yazýlýþý:");
        printSprintArray(spiralMatrix.length, spiralMatrix.length, spiralMatrix);
    }
	
    public static int[][] fillMatrix(int[][] array) {
        int[][] spiralMatrix = array;

        int value = 1;
        int minCol = 0;
        int maxCol = array.length - 1;
        int minRow = 0;
        int maxRow = array.length - 1;

        while (value <= array.length * array.length) {
            for (int i = minCol; i <= maxCol; i++) {
                spiralMatrix[minRow][i] = value;
                value++;
            }

            for (int i = minRow + 1; i <= maxRow; i++) {
                spiralMatrix[i][maxCol] = value;
                value++;
            }

            for (int i = maxCol - 1; i >= minCol; i--) {
                spiralMatrix[maxRow][i] = value;
                value++;
            }

            for (int i = maxRow - 1; i >= minRow + 1; i--) {
                spiralMatrix[i][minCol] = value;
                value++;
            }

            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }
        return spiralMatrix;
    }

    public static void printArrayElements(int[][] spiralMatrix) {
        for (int i = 0; i < spiralMatrix.length; i++) {
            for (int j = 0; j < spiralMatrix.length; j++) {
                System.out.print(spiralMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static void printSprintArray(int m, int n, int a[][]) {
        int i, k = 0, l = 0;

        while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;
            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    }
}
