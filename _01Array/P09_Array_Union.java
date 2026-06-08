import java.util.Arrays;
import java.util.HashSet;

public class P09_Array_Union {

    public static int[] solve(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int index = 0;

        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 3};
        int[] nums2 = {2, 3, 4, 5};

        int[] union = solve(nums1, nums2);

        System.out.println(Arrays.toString(union));
    }
}