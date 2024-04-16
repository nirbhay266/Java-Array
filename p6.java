import java.util.*;
public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[10];
        System.out.println("Enter the number of elements in the array: ");
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the number"+(i+1)+":");
            n[i] = sc.nextInt();
        }
        System.out.println("Enter Find numbere");
        int l = sc.nextInt();
        for(int i=0;i<5;i++)
        {
            if(n[i]>l)
            {
                
                System.out.print(l);
            }
            
        }
        sc.close();
}
}
