import java.util.*;
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Arrays");
        int m = sc.nextInt();
        int n[] = new int[10];
        for(int i=0; i<m; i++)
        {
            System.out.println("Enter the number"+(i+1)+":");
           n[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            if(n[i]%2==0)
            {
                System.out.println("Even Number"+n[i]);
            }
            else
            {
                System.out.println("Odd Number"+n[i]);
            }
        }
        sc.close();
    }
}
