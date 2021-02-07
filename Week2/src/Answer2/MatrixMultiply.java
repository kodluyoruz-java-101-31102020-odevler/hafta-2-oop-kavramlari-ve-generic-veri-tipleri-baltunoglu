package Answer2;

public class MatrixMultiply<N extends Number> {
	
	public int[][] matrixMultiply (double[][] randomMatrix1,double[][] randomMatrix2){
	
		  
        int[][] matrixMultiplication =new int[randomMatrix1.length][randomMatrix2[0].length];
        
        for(int i=0;i<randomMatrix1.length;i++){
        
        	for(int j=0;j<randomMatrix2[0].length;j++){ 
        		matrixMultiplication[i][j] = 0;
        
        		for(int k=0;k<randomMatrix1[0].length;k++){
        			matrixMultiplication [i][j] += randomMatrix1[i][k] * randomMatrix2[k][j];
        		}
        		System.out.print(matrixMultiplication[i][j] + " ");
            }	
        	System.out.println();
			
	}
		
    
        return matrixMultiplication;
	
	}	
	

}
