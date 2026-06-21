public class P17_Majority_Element {
       public static int majorityElement(int[] nums) {
        int n=nums.length;
        if(n<2) return nums[n-1];
        int candidate=nums[0],count=1;;
        for(int i=1;i<n;i++){
            if(nums[i]==candidate){
                count++;
            }else{
                count--;
            }
            if(count==0){
                candidate=nums[i];
                count=1;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int []nums={2,2,1,1,1,2,2};
        int ans=majorityElement(nums);
        System.out.println(ans);
    }
    
}
