class Solution {
    public void rotate(int[] nums, int k) {
        for(int i=0;i<k;i++){
            int prev = nums[0];
            int j;
            for(j=1;j<nums.length;j++){
                int temp = nums[j];
                nums[j] = prev;
                prev = temp;
            }
            nums[0]=prev;
        }
        System.out.println(nums);
    }
}
