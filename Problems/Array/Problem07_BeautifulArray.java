class Solution{
    private int[] arr;
    private int g=0;
    private int[] finalTemp;
    public int recursiveFunction(int[] arr){
        int[] oddTemp,evenTemp;
        if(arr.length%2 == 0){
            oddTemp = new int[arr.length/2];
            evenTemp = new int[arr.length/2];
        }
        else{
            oddTemp = new int[(arr.length+1)/2];
            evenTemp = new int[(arr.length-1)/2];
        }
        int j=0,k=0;
        if(arr.length == 1){
            finalTemp[g] = arr[0];
            g++;
            return 0;
        }
        for(int i=0;i<arr.length;i+=2){
            oddTemp[j] = arr[i];
            j++;
        }
        recursiveFunction(oddTemp);
        for(int i=1;i<arr.length;i+=2){
            evenTemp[k] = arr[i];
            k++;
        }
        recursiveFunction(evenTemp);
        return 0;
    }
    public int[] beautifulArray(int n){
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }
        finalTemp = new int[n];
       recursiveFunction(arr);
       return finalTemp;
    }
}
