import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P15_Two_Sum {
     public static int[] twoSum(int[] nums, int target) {
        int []ans=new int[2];
        int n=nums.length;
        if(n<2) return ans;
        Map<Integer,Integer> value_index=new HashMap<>();
        for(int i=0;i<n;i++){
             value_index.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int second_val=target-nums[i];
            if(value_index.keySet().contains(second_val)){
                int secons_index=value_index.get(second_val);
                if(secons_index!=i){
                ans[0]=i;
                ans[1]=secons_index;
             }
            }
        }  
        return ans;
    }
    public static void main(String[] args) {
        int []nums={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    
}
