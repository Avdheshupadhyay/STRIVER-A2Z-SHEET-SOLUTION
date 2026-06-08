public class P11_Max_Consecutive_Ones {
        public static int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        if(n<1) return 0;
        int ones=0;
        int max_ones=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                ones++;
            }else{
               max_ones=Math.max(max_ones,ones); 
               ones=0;
            }
        }
        max_ones=Math.max(max_ones,ones);
        return max_ones;
    }
    public static void main(String[] args) {
        int []nums={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
        
    }
    
}
