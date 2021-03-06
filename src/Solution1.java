import java.util.HashMap;
import java.util.Map;

/**
 * @author Arthas
 */
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp=target-nums[i];
            if (map.containsKey(temp)) {
                return new int[]{i,map.get(temp)};
            }
            map.put(temp,i);
        }
        return new int[2];
    }

    public static void main(String[] args) {
        int[] nums={1,7,11,15,24,6,3,7,8,9,34,67,4,2,678,9};
        Solution1 t=new Solution1();
        for(int i:t.twoSum(nums,679)){
            System.out.println(i);
        }
    }
}
