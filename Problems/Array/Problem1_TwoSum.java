class Solution {
    int targetIndex1, targetIndex2;
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < (nums.length); i++) {
            for (int j = i + 1; j < (nums.length); j++) {
                if ((nums[i] + nums[j]) == target) {
                    targetIndex1 = i;
                    targetIndex2 = j;
                    break;
                }
            }
        }
        int[] output = new int[2];
        output[0] = targetIndex1;
        output[1] = targetIndex2;
        return output;
    }
}
