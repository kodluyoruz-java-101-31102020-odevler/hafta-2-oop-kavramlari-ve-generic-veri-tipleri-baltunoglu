package Answer2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
			int M,N,T;
			DecimalFormat df = new DecimalFormat("#,##");	
			Scanner scanner = new Scanner(System.in);
			System.out.println("Ýlk matrisi MxN boyutunda yazýnýz:");
			M = scanner.nextInt();
			N = scanner.nextInt();
			System.out.println("Ýkinci matrisi NxT bouyutunda yazýnýz:");
			N = scanner.nextInt();
			T = scanner.nextInt();
			
			System.out.println("Birinci rastgele matris:");
			double[][] randomMatrix1 = new double [M][N];
			for(int i=0; i < M ;i++) {
				for(int j=0; j < N; j++) {
					double randomNumber = (double)Math.random()*10;
					randomMatrix1[i][j] = Double.valueOf(df.format(randomNumber));
				}
			}
			
			for(int i=0; i < M; i++) {
				for(int j=0; j < N; j++) {
					System.out.print(randomMatrix1[i][j] + " ");
				}
				System.out.println();
			}
			

			System.out.println("Ýkinci rastgele matris:");
			double[][] randomMatrix2 = new double [N][T];
			for(int i=0; i < N ;i++) {
				for(int j=0; j < T; j++) {
					double randomNumber = Math.random()*10;
					randomMatrix2[i][j] = Double.valueOf(df.format(randomNumber));
				}
			}
			
			for(int i=0; i < N; i++) {
				for(int j=0; j < T; j++) {
					System.out.print(randomMatrix2[i][j] + " ");
				}
				System.out.println();
			}
			
			if(randomMatrix1.length!=randomMatrix2[0].length) 
			{
			System.out.println("Birinci matrisin sütun sayýsý ile ikinci matrisin satýr sayýsý ayný olmalý !");
			}
			else {
			System.out.println("Matrislerin çarpýmý: ");
			MatrixMultiply<Integer> multiply = new MatrixMultiply<Integer>();
			multiply.matrixMultiply(randomMatrix1, randomMatrix2);
			}
			
		
	}
}
