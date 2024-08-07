package Array_Demo_;

// Write a java program to make addition, subtraction and multiplication of two matrix using 
// 2-D array. 

public class Array_Q_004
{
	public static void main(String[] args) 
	{
		int [][]matrix1 = {{1,2},{3,4}};
		int [][]matrix2 = {{5,6},{7,8}};
		
		int [][]sum=new int[matrix1.length][matrix1[0].length];
		for(int i=0; i<matrix1.length; i++)
		{
			for(int j=0; j<matrix1[0].length; j++)
			{
				sum[i][j] = matrix1[i][j]+ matrix2[i][j];
			}
			int [][]differce = new int[matrix1.length][matrix1[0].length];
			for(int i1=0; i<matrix1.length; i++)
			{
				for(int j=0; j<matrix1.length; j++)
				{
					differce[i][j]=matrix1[i][j]-matrix2[i][j];
				}
			}
			int[][]product = new int[matrix1.length][matrix2[0].length];
			for(int i2=0; i<matrix1.length;i++)
			{
				for(int j=0; j<matrix2.length;j++)
				{
					for(int k=0; k<matrix1[0].length; k++)
					{
						product[i][j]+=matrix1[i][k]*matrix2[k][j];
					}
				}
			}
			System.out.println("matrix addition....");
			displaymatrix(sum);
			System.out.println("matrix subtraction....");
			displaymatrix(differce);
			System.out.println("matrix multiplication....");
			displaymatrix(product);
		    }
	}
			public static void displaymatrix(int [][]matrix)
			{
				for(int[] row:matrix)
				{
					for(int num : row)
					{
						System.out.print(num+" ");
					}
					System.out.println();
				}
				System.out.println();	
			}


}