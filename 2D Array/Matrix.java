import java.util.*;
public class Matrix {
    public static boolean search (int matrix[][], int key)
    {
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.println("Found at cell ("+i+","+j+")");
                    return true;
                }
               
            }
           
        }
        System.out.println("Key not fount");
        return false;
    }
    public static void maximum(int matrix[][])
    {
        int max=matrix[0][0];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]>max)
                {
                    max=matrix[i][j];
                }
              
            }
        }
        System.out.println("Maximum Number is :"+max);

    }
    public static void minimum(int matrix[][])
    {
        int min=matrix[0][0];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                if(matrix[i][i]<min)
                {
                    min=matrix[i][i];
                }
            }
        }
        System.out.println("Minimum Number is :"+min);
    }
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int n=matrix.length,m=matrix[0].length;
        
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("Enter Element of Array :");
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
               
            }
            System.out.println();
        }
       
        System.out.println("Enter the key to be searched");
      int key=sc.nextInt();
        search(matrix,key);
        maximum(matrix);
        minimum(matrix);
        sc.close();
    }
   
}
