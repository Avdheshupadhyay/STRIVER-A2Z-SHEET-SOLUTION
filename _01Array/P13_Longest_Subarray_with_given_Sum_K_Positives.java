public class P13_Longest_Subarray_with_given_Sum_K_Positives {
    public static void main(String[] args) {
        // int []nums={10, 5, 2, 7, 1, 9};
         int []nums={-3, 2, 1};
        int n=nums.length;
        // int k=15;
         int k=6;
        int current_length=0,max_length=-1,max_sum=k,current_sum=0;
        int slow=0,fast=1;
        while (slow<n) {
            max_sum=max_sum-nums[slow];
            current_length++;
            if(max_sum<=0){
                max_length=Math.max(max_length, current_length);
                current_length=0;
                max_sum=k;
                slow=fast;
                fast++;
            }
            slow++;
        }
        System.out.println("the ans is =" +max_length);
    }
    
}
