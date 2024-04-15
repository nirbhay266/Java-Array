/*write a  program enter five number in an array Print Sum of all index values. in java */
import java.util.*;
public class p3 {
    public static void main(String[] args) {
        int n[]=new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int m=sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        // int sum[]=new int[m];
        // sum[0]=0;
        int sum=0;
        for(int i=0; i<m; i++)
        {
         n[i]= sc.nextInt();
      sum=sum+n[i];

        }
        // int sum=0;
        // for (int i=0; i<m; i++)
        // {
        //     sum=sum+n[i];
        // }
        System.out.println("The sum of the elements of the array is: "+sum);
        sc.close();
        }

}
