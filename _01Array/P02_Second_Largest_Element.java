public class P02_Second_Largest_Element {
     public static int find_Second_Largest_Element(int [] nums){
        if(nums==null || nums.length==0)   return 0;
        if(nums.length==1)  return nums[0];
        int first_maximum_element=nums[0];
         int second_maximum_element=nums[0];
         for(int i=1;i<nums.length;i++){
            if(first_maximum_element<nums[i]){
                second_maximum_element=first_maximum_element;
                first_maximum_element=nums[i];
            }
             if(second_maximum_element<nums[i] && nums[i]<first_maximum_element){
                second_maximum_element=nums[i];
            }
         }
         return  second_maximum_element;
    }
    public static void main(String [] all_arguments){
        int nums[]={1,7,4,5,6,8,33,55,6};
        System.out.println(find_Second_Largest_Element(nums));
    }
    
}
