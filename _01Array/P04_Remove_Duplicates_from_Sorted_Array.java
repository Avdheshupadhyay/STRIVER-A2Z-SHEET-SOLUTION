import java.util.Arrays;

public class P04_Remove_Duplicates_from_Sorted_Array {
      public static int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<2){
            return n;
        }
        int unique_index_tracker=0;
        int k=0;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                nums[unique_index_tracker+1]=nums[i];
                unique_index_tracker++;
            }
        }
        return unique_index_tracker+1;
        
    }
    public static void main(String[] args) {
        int []nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

    }
    
}
