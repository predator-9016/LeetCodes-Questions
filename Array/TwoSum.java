// https://leetcode.com/problems/two-sum/solutions/6143827/two-sum-of-the-array-list-by-chaurasiyak-g258/
// link for the solution
import java.util.Arrays;

public class TwoSum {
    // Method to find the two sum
    public int[] twoSum(int[] nums, int target) {
        // Create an array of pairs (number, index)
        int[][] pairs = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            pairs[i][0] = nums[i]; // number
            pairs[i][1] = i;       // original index
        }

        // Sort the pairs array based on the number
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        // Use two-pointer technique
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int sum = pairs[low][0] + pairs[high][0];

            if (sum == target) {
                return new int[]{pairs[low][1], pairs[high][1]}; // Return original indices
            } else if (sum < target) {
                low++; // Increase the lower pointer
            } else {
                high--; // Decrease the upper pointer
            }
        }

        // No solution (should not occur as per problem statement)
        throw new IllegalArgumentException("No two sum solution");
    }

    // Main method to call the function
    public static void main(String[] args) {
        // Example inputs
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        int[] nums2 = {3, 2, 4};
        int target2 = 6;

        int[] nums3 = {3, 3};
        int target3 = 6;

        // Create an instance of the class
        TwoSum solution = new TwoSum();

        // Test cases
        System.out.println("Example 1: " + Arrays.toString(solution.twoSum(nums1, target1))); // Output: [0, 1]
        System.out.println("Example 2: " + Arrays.toString(solution.twoSum(nums2, target2))); // Output: [1, 2]
        System.out.println("Example 3: " + Arrays.toString(solution.twoSum(nums3, target3))); // Output: [0, 1]
    }
}
