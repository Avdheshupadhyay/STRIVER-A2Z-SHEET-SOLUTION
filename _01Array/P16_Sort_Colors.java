import java.util.Arrays;

public class P16_Sort_Colors {
    public static void sortColors(int[] nums) {
        int n=nums.length;
        if(n<2) return;
        int one=0,two=n-1,start=0;
        while(start<=two){
            if(nums[start]==0){
                int temp=nums[one];
                 nums[one]=nums[start];
                nums[start]=temp;
                one++;
                start++;
            }
           else if(nums[start]==2){
                int temp=nums[two];
                 nums[two]=nums[start];
                nums[start]=temp;
                two--;
            }else{
                start++;
            }
        } 
        
    }
    public static void main(String[] args) {
        int []nums={2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
        // dutch national flag algo --> two pointer lete h one and two and one pr one wale elements ko swap krte h and two pr two wale and 1 ko skip kr dete h 
        // bs ek point h isme jab hmko 2 milta h to hm to swap to krte h but start++ nhi krte kyuki whatif jo swap hua h element wo khud 2 ho 
    
    }
    
}
