public class subsetXORset {

    public subsetXORset(int[] nums) {
    }

    public int subsetXORSum(int[] nums) {
    
            int sum = 0;
            for (int i= 1 ;i<1<<nums.length;++i){
                int temp = 0 ; 
                for(int k=0;k<nums.length;++k){
                    if((i&(1<<k))!=0)temp^=nums[k]; 
                }
                sum+=temp;
            }
            return sum;
            
        }
        public static void main(String[] args)
        {
            int[] nums={3,4,6,3,5};
            System.out.println(new subsetXORset(nums));
        }
    }
