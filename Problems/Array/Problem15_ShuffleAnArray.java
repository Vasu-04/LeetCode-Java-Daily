import java.util.Collections;
import java.util.List;
class Solution {
    private List<Integer> arr = new ArrayList<>();
    private int[] backup;
    public Solution(int[] nums) {
        backup = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
            backup[i] = nums[i];
        }
    }
    public int[] reset() {
        return backup;
    }
    public int[] shuffle() {
        int[] result = new int[arr.size()];
        Collections.shuffle(arr);
        for(int i=0;i< arr.size();i++)
            result[i] = arr.get(i);
        return result;
    }
}
