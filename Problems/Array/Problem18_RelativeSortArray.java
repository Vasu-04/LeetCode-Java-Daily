import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    public int k = 0;
    public List<Integer> arr1List = new ArrayList<Integer>();
    public int[] freq;
    public int[] result;
    public int[] tempResult;
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        result = new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
            arr1List.add(arr1[i]);
        for(int i=0;i<arr2.length;i++){
            int n = arr2[i];
            int count = Collections.frequency(arr1List,n);
            for(int j=0;j<count;j++){
                result[k] =  n;
                k++;
            }
            arr1List.removeIf(num -> num==n);
        }
        if(arr1List.size()==0)
            return arr2;
        tempResult = new int[arr1List.size()+1];
        freq = new int[Collections.max(arr1List)+1];
        for(int i=0;i<arr1List.size();i++)
            freq[arr1List.get(i)]++;
        for(int i=1;i<freq.length;i++)
            freq[i] += freq[i-1];
        for(int i=arr1List.size()-1;i>=0;i--){
            tempResult[freq[arr1List.get(i)]] = arr1List.get(i);
            freq[arr1List.get(i)]--;
        }
        for(int i=1;i< tempResult.length;i++){
            result[k] = tempResult[i];
            k++;
        }
        return result;
    }
}
