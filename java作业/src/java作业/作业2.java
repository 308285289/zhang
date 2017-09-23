package java作业;

import java.util.*;

public class 作业2 {
	public static void main(String[] args) {

		        int n=0;
		        System.out.println("请输入一个4-10之间的整数：");
		        try {
		            Scanner sc = new Scanner(System.in);
		            n = sc.nextInt();
		        } catch (Exception e) {
		          
		        }

		       
		        int arr[][] = new int[n][n];
		        for(int i=0; i<n; i++)
		        {
		            for(int j=0; j<n; j++)
		            {
		                arr[i][j] = 0; 
		            }
		        }
		        arr[0][0]  = 1;

		        int r=0 , c=-1, count=2;

		ToShow:
		        for( ; count <= n*n; ){
		                
		                for(r++, c++; r<n; r++)
		                {
		                    if(arr[r][c] != 0){
		                        break;
		                    }

		                    arr[r][c] = count;
		                    count++;
		                    if(count >= n*n){
		                        break ToShow;
		                    }
		                }
		               
		                for(r--, c++; c<n; c++)
		                {
		                    if(arr[r][c] != 0){
		                        break;
		                    }

		                    arr[r][c] = count;
		                    count++;
		                }
		                
		                for(c--, r--; r>=0; r--)
		                {
		                    if(arr[r][c] != 0){
		                        break;
		                    }

		                    arr[r][c] = count;
		                    count++;
		                }
		               
		                for(c--, r++; c>=0; c--)
		                {

		                    if(arr[r][c] != 0){
		                        break;
		                    }
		                    arr[r][c] = count;
		                    count++;
		                }
		        }



		       
		        for(int i=0; i<n; i++)
		        {
		            for(int j=0; j<n; j++)
		            {
		                System.out.print(arr[i][j]+"\t");
		            }
		            System.out.println(" ");
		   }
	}
}
