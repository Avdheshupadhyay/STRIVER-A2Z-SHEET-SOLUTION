 public class P01_Largest_Element{
    public static int find_Largest_Element(int [] nums){
        if(nums==null || nums.length==0)   return 0;
        if(nums.length==1)  return nums[0];
        int maximum_element=nums[0];
        for(int i=1;i<nums.length;i++){
            if(maximum_element<nums[i]) maximum_element=nums[i];
        }
        return maximum_element;
    }
    public static void main(String [] arguments){
        int [] nums={1,5,7,3,55,777,33,9,3,4};
        System.out.println(find_Largest_Element(nums));
    }
}