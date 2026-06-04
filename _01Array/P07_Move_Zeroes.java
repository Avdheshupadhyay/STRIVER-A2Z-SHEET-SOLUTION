import java.util.Arrays;

public class P07_Move_Zeroes {
    public static void main(String[] args) {
        int []nums={0,1,0,3,12};
        int n = nums.length;
        if (n < 2)
            return;
        int non_zero_starting_index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0 && non_zero_starting_index != i) {
                nums[non_zero_starting_index] = nums[i];
                nums[i] = 0;
                non_zero_starting_index++;
            }
            if (nums[i] != 0 && non_zero_starting_index == i) {
                non_zero_starting_index++;
            }
        }
         System.out.println(Arrays.toString(nums));
    }
    
}
