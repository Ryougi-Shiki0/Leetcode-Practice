import java.util.ArrayList;
import java.util.List;

/**
 * @author Arthas
 */
public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            nums[Math.abs(nums[i])-1]=-Math.abs(nums[Math.abs(nums[i])-1]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution448 t=new Solution448();
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(t.findDisappearedNumbers(nums));
    }
}
