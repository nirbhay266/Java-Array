
public class p7Largest {
    public static int largest(int number[])
    {
        int largest = Integer.MIN_VALUE;//lowest value
        int smallest=Integer.MAX_VALUE;//high value
        for(int i = 0; i < number.length; i++)
        {
            if(largest < number[i])
            {
                largest = number[i];
            }
            if(smallest>number[i])
            {
                smallest=number[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }
    public static void main(String[] args) {
        int n[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(largest(n));
    }
}
