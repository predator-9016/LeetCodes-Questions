import java.util.Arrays;

public class Second {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int nums3[]=new int[m + n];
        System.arraycopy(nums1, 0, nums3, 0, nums1.length);
        System.arraycopy(nums2, 0, nums3, nums1.length, nums2.length);
        // Sort the merged array
        Arrays.sort(nums3);
        int length = nums3.length;
        if (length % 2 == 0) {
            return (nums3[length / 2 - 1] + nums3[length / 2]);
        }
        else
            return nums3[length/2];
    }
}
