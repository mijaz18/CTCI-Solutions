import java.util.*;

public class RotateMatrix{
	public static boolean rotateMatrix(int[][] matrix){
		int n = matrix.length;
		for(int layer = 0; layer < n/2; layer++){
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; i++){
				int offset = i - first;
				//save top
				int top = matrix[first][i];
				//left->top
				matrix[first][i] = matrix[last-offset][first];
				//bottom->left
				matrix[last-offset][first] = matrix[last][last - offset];
				//right->bottom
				matrix[last][last-offset] = matrix[i][last];
				//top->right
				matrix[i][last] = top;
			}
		}
		return true;
	}

	public static void main(String args[]){
		int n = 4;
		int[][] arr = new int[n][n];
		int inc=1;
		for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
		{
			arr[i][j]=inc;
			inc++;
		}
		rotateMatrix(arr);
		System.out.println(Arrays.deepToString(arr));
	}
}