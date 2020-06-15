import java.util.*;

public class ZeroMatrix{
	public static boolean zeroMatrix(int[][] matrix){
		boolean[] rowFlag = new boolean[matrix.length];
		boolean[] columnFlag = new boolean[matrix[0].length];
		for(int i=0; i < matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				if(matrix[i][j] == 0){
					rowFlag[i] = true;
					columnFlag[j] = true;
				}
			}
		}
		for(int i=0; i<rowFlag.length; i++){
			if(rowFlag[i] == true){
				nullifyRow(matrix, i);
			}
		}

		for(int i=0; i<columnFlag.length; i++){
			if(columnFlag[i] == true){
				nullifyColumn(matrix,i);
			}
		}
		return true;
	}

	public static void nullifyRow(int[][] matrix, int row){
		for(int i = 0; i < matrix[0].length; i++){
			matrix[row][i] = 0;
		}
	}
	public static void nullifyColumn(int[][] matrix, int column){
		for(int i = 0; i < matrix.length; i++){
			matrix[i][column] = 0;
		}
	}

	public static void main(String args[]){
		int [] [] input = new int[] [] {
	      { 0, 8, 0, 4, 3, 2, 4, 6, 5 },
	      { 3, 3, 4, 10, 0, 0, 9, 1, 6 },
	      { 9, 6, 0, 9, 0, 0, 0, 8, 4 },
	      { 9, 0, 0, 2, 1, 6, 0, 8, 6 },
	      { 2, 0, 7, 1, 3, 9, 6, 7, 7 },
	      { 7, 1, 7, 3, 5, 7, 2, 15, 8 },
	      { 8, 4, 4, 11, 12, 13, 14, 7, 5 },
	      { 6, 2, 6, 0, 0, 0, 1, 3, 18 },
	      { 5, 9, 5, 7, 5, 1, 9, 4, 9 }
	    };
	    zeroMatrix(input);
	    System.out.println(Arrays.deepToString(input));
	}
}