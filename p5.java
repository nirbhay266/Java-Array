import java.io.IOException;
import java.util.*;
public class p5 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[5];
        int b[] = new int[5];
        int c[] = new int[10];
        int p=5;
        for(int i=0; i<5; i++)
        {
            System.out.print("Enter the first elements of the array"+(i+1)+":");
            a[i]=sc.nextInt();
            System.out.print("Enter the second elements of the array"+(i+1)+":");
            b[i]=sc.nextInt();
            c[i]=a[i];
            c[i+p]=b[i];    
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(c[i]);
        }
        sc.close();
    }
}
