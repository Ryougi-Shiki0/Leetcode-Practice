public class Solution53 {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0) {
                nums[i] += nums[i - 1];
            }
            sum = Math.max(sum, nums[i]);
        }
        return sum;
    }
}
