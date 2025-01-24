class Solution{
    int[] result;
    int arrLen;
    public int indexSearch(int currIndex,int steps,char dir){
        if(dir == 'r')
            currIndex = (currIndex+steps)%arrLen;
        else
            currIndex = (currIndex-steps%arrLen+arrLen)%arrLen;
        return currIndex;
    }
    public int[] constructTransformedArray(int[] nums){
        result = new int[nums.length];
        arrLen = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0)
                result[i] = nums[indexSearch(i,nums[i],'r')];
            else if (nums[i] < 0)
                result[i] = nums[indexSearch(i,nums[i]*(-1),'l')];
            else
                result[i] = nums[i];
        }
        return result;
    }
}
