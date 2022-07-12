import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3};
        int[] answer = (twoSum(nums, 5));
        for (int i = 0; i < answer.length; ++i) {
            System.out.println(answer[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        HashMap<Integer, Integer> sums = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; ++i) {
            sums.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; ++i) {
            if ((sums.containsKey(target - nums[i])) && (sums.get(target-nums[i]) != i)) {
                answer[0] = i;
                answer[1] = sums.get(target - nums[i]);
                break;
            }
        }
        return answer;
    }
}
