public class DiglonalSum {
    public static void digonal(int matrix[][])
    {
         int sum=0;
        // for(int i=0;i<matrix.length;i++)
        // {
        //     for(int j=0;j<matrix[0].length;j++)
        //     {
        //         if(i==j)
        //         {
        //         sum+=matrix[i][j];
        //         }
        //         else if(i+j==matrix[i][j]-1)
        //         {
        //             sum=sum+matrix[i][j];
        //         }
        //     }
        // }
        // System.out.println("Sum is :"+sum);
        for(int i=0;i<matrix.length;i++)
        {
             sum+=matrix[i][i];
             if(i!=matrix.length-1-i)
             {
             sum+=matrix[i][matrix.length-i-1];
             }
        }
        System.out.println("Sum is :"+sum);
    }
    public static void main(String[] args)
    {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {12,13,14,15}};
                        digonal(matrix);
    }
}
