import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[10];
        System.out.println("Enter Five Number");
        for(int i = 0; i <5; i++)
        {
            System.out.print("Number "+(i+1)+":");
            n[i] = sc.nextInt();
        }
        for(int i=4;i>=0;i--)
        {
            System.out.println("Reverse Number "+n[i]);
        }
        sc.close();
    }
    
}
