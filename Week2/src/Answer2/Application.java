package Answer2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
			int M,N,T;
			DecimalFormat df = new DecimalFormat("#,##");	
			Scanner scanner = new Scanner(System.in);
			System.out.println("�lk matrisi MxN boyutunda yaz�n�z:");
			M = scanner.nextInt();
			N = scanner.nextInt();
			System.out.println("�kinci matrisi NxT bouyutunda yaz�n�z:");
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
			

			System.out.println("�kinci rastgele matris:");
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
			System.out.println("Birinci matrisin s�tun say�s� ile ikinci matrisin sat�r say�s� ayn� olmal� !");
			}
			else {
			System.out.println("Matrislerin �arp�m�: ");
			MatrixMultiply<Integer> multiply = new MatrixMultiply<Integer>();
			multiply.matrixMultiply(randomMatrix1, randomMatrix2);
			}
			
		
	}
}
