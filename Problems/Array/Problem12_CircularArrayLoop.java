import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Solution {
    private boolean[] visited;
    private boolean present = false;
    public boolean circularArrayLoop(int[] nums) {
        visited = new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            int currIndex = i;
            int prevIndex = i;
            while(true){
                if(!((nums[prevIndex]>0 && nums[currIndex] >0) || (nums[prevIndex]<0 && nums[currIndex]<0))){
                    Arrays.fill(visited,false);
                    break;
                }
                else{
                    if(visited[currIndex]){
                        Boolean[] boxedArr = new Boolean[visited.length];
                        for(int k=0;k<visited.length;k++)
                            boxedArr[k] = visited[k];
                        if(Arrays.stream(boxedArr).filter(value->value).count() > 1 && prevIndex != currIndex){
                            present = true;
                            break;
                        }
                        else{
                            Arrays.fill(visited,false);
                            break;
                        }
                    }
                    else{
                        visited[currIndex] = true;
                        prevIndex = currIndex;
                        if(nums[currIndex]>0)
                            currIndex = (currIndex+nums[currIndex])%nums.length;
                        else
                            currIndex = (currIndex + nums[currIndex] % nums.length + nums.length) % nums.length;
                    }
                }
            }
            if(present == true)
                break;
        }
        return present;
    }
}
