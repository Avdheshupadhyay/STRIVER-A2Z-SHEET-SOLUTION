import java.util.*;

public class P20_Rearrange_Array_Elements_by_Sign {
        public static int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        if(n<2) return nums;
        int []ans=new int[n];
        int even=0,odd=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[even]=nums[i];
                even+=2;
            }else{
                 ans[odd]=nums[i];
                 odd+=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []nums={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
    
}
