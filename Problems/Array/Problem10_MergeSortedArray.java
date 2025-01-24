class Solution {
    private int[] temp;
    private int i=0,j=0,k=0;
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        temp = new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                temp[k] = nums1[i];
                i++;
                k++;
            }
            else if(nums1[i]>nums2[j]){
                temp[k] = nums2[j];
                k++;
                j++;
            }
            else{
                temp[k] = nums1[i];
                temp[k+1] = nums2[j];
                i++;j++;k+=2;
            }
        }
        while(i<m){
                temp[k] = nums1[i];
                k++;i++;
        }
        while(j<n){
                temp[k] = nums2[j];
                k++;j++;
        }
        System.arraycopy(temp, 0, nums1, 0, m + n);
    }
}
