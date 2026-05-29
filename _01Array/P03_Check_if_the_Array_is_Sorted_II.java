public class P03_Check_if_the_Array_is_Sorted_II {
     public static boolean check(int[] nums) {
        int n = nums.length;
        if (n < 2)
            return true;
        int count_of_rotation=0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                count_of_rotation++;
            }
        }
        if(count_of_rotation==1){
            if (nums[0] < nums[n - 1]) {
                    return false;
                } else {
                    return true;
                }
        }
        else if(count_of_rotation==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] my_arguments) {
        int []nums={2,7,4,1,2,6,2};
        boolean is_sorted=check(nums);
     System.out.println(is_sorted ? "Array Is Rotated Sorted!" : "Array Is Not Rotated Sorted!");       
        
    }
    
}
