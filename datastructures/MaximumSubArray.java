public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 10};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxEndHere = nums[0];
        int maxSoFar = nums[0];
        for(int i=1;i<nums.length;i++) {
            maxEndHere = Math.max(nums[i], maxEndHere+nums[i]);
            maxSoFar = Math.max(maxSoFar,maxEndHere);
        }
        return maxSoFar;
    }
}
