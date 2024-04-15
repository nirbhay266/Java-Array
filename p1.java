import java.util.*;
public class p1 {
    public static void main(String[] args) {
        int marks[]=new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Five Number");
        for(int i = 0; i <5; i++) {
           System.out.print( "Number "+(i+1)+  ": " );
           marks[i] = sc.nextInt();
        }
        for(int i = 0; i < 5; i++) {
            System.out.println("Inputted Number: "+marks[i]);
        
        }
        sc.close();
    }
    
}
