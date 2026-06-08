public class P12_singleNumber {
        public static int singleNumber(int[] nums) {
        int n=nums.length;
        if(n<2) return nums[n-1];
        int ans=nums[0];
        for(int i=1;i<n;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int []nums={4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    
}
