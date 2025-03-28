class Solution {
    private char prev;
    public boolean isArraySpecial(int[] nums) {
        int i;
        for(i=0;i<nums.length;i++){
            int val = nums[i];
            if(i==0)
                prev = val%2==0?'e':'o';
            else{
                if(val%2==0 && prev == 'e')
                    break;
                else if (val%2==0 && prev == 'o') 
                    prev = 'e';
                else if (val%2!=0 && prev == 'o') 
                    break;
                else
                    prev = 'o';
            }
        }
        if(i== nums.length)
            return true;
        else
            return false;
    }
}
