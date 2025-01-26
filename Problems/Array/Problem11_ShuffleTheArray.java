class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int k=0;
        int[] result = new int[2*n];
        while(i<n){
            result[k] = nums[i];
            k++;
            result[k] = nums[i+n];
            k++;
            i++;
        }
        return result;
    }
}
