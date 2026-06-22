public class P18_Maximum_Subarray_Kadane {
       public static int maxSubArray(int[] nums) {
        int n=nums.length;
        if(n<2) return nums[0]; 
        int curSum=0,maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           curSum+=nums[i];
          maxSum=Math.max(curSum,maxSum);
           if(curSum<0){
            System.out.println(curSum);
            curSum=0;
           }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int []nums={-2,1,-3,4,-1,2,1,-5,4};
        int n=nums.length;
        System.out.println(maxSubArray(nums));

    }

}