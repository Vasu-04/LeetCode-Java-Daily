class Solution {
    public int[] sortArray(int[] arr) {
         int min = arr[0];
        int[] finalArr = new int[arr.length];
        finalArr[0] =0;
        for(int i=0;i<arr.length;i++){
            if(min > arr[i])
                min = arr[i];
        }
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max < arr[i] )
                max = arr[i];
        }
        if(min>0){
            int[] aux = new int[max+1];
            for(int i=0;i<arr.length;i++){
                aux[arr[i]]++;
            }
            for(int i=1;i<aux.length;i++){
                aux[i] += aux[i-1];
            }
            for(int j=arr.length-1;j>=0;j--){
                finalArr[aux[arr[j]]-1] = arr[j];
                aux[arr[j]]--;
            }
        }
        else{
            int range = max-min+1;
            int[] aux = new int[range];
            int[] newArray = new int[arr.length];
            for(int i=0;i<arr.length;i++){
                newArray[i] = arr[i]+(min*(-1));
            }
            for(int i=0;i<newArray.length;i++){
                aux[newArray[i]]++;
            }
            for(int i=1;i<aux.length;i++){
                aux[i] += aux[i-1];
            }
            for(int i=arr.length-1;i>=0;i--){
                finalArr[aux[arr[i]-min]-1] = arr[i];
                aux[arr[i]-min] --;
            }
        }
        return finalArr;
    }
}
