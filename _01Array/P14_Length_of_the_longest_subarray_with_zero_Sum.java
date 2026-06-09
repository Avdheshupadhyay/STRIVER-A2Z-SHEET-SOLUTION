public class P14_Length_of_the_longest_subarray_with_zero_Sum {
     public static void main(String[] args) {
        //  int []nums={9, -3, 3, -1, 6, -5};
        //  int []nums={6, -2, 2, -8, 1, 7, 4, -10};
          int []nums={1, -1, 2, 3, -5, 1};


        int n=nums.length;
        int current_length=0,max_length=-1,target_sum=0,current_sum=0;
        int slow=0,fast=1;
        boolean isZero=false;
        while (slow<n) {
            target_sum=target_sum+nums[slow];
            current_length++;
            if(target_sum==0){
                max_length=Math.max(max_length, current_length);
                isZero=true;
            }else{
                isZero=false;
            }
             slow++;
            if(slow==n && !isZero){
                slow=fast;
                fast++;
                current_length=0;
                target_sum=0;
            }
        }
        System.out.println("the ans is =" +Math.max(max_length, current_length));
    }
    
}
