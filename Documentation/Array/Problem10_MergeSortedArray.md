# Merge Sorted Array

## Problem Link
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

**Example 1:**

      Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
      Output: [1,2,2,3,5,6]

      Explanation: 
      The arrays we are merging are [1,2,3] and [2,5,6].
      The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

**Example 2:**

      Input: nums1 = [1], m = 1, nums2 = [], n = 0
      Output: [1]
      
      Explanation: 
      The arrays we are merging are [1] and [].
      The result of the merge is [1].

**Example 3:**

      Input: nums1 = [0], m = 0, nums2 = [1], n = 1
      Output: [1]
      
      Explanation: 
      The arrays we are merging are [] and [1].
      The result of the merge is [1].
      Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

   
**Constraints**
<pre>
  1. nums1.length == m + n
  2. nums2.length == n
  3. 0 <= m, n <= 200
  4. 1 <= m + n <= 200
  5. -10<sup>9</sup> <= nums1[i], nums2[j] <= 10<sup>9</sup>
</pre>


[Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)

## Solution Explanation

### Initialization
1. **Temporary Array**:
   - A new array `temp` is created to store the merged elements. Its size is `m + n`, the total number of elements from both arrays.

2. **Index Variables**:
   - `i`: Tracks the position in `nums1`.
   - `j`: Tracks the position in `nums2`.
   - `k`: Tracks the position in the `temp` array.

---

### Merging the Arrays
1. **Comparing Elements**:
   - Iterate through `nums1` and `nums2` while both have unprocessed elements.
   - Compare `nums1[i]` and `nums2[j]`:
     - Add the smaller element to `temp` and increment the respective index (`i` or `j`).
     - If elements are equal, add both to `temp` and increment all indices (`i`, `j`, and `k`).

2. **Appending Remaining Elements**:
   - After the main loop, append any remaining elements from `nums1` or `nums2` to `temp`.

---

### Copy Back to `nums1`
- Use `System.arraycopy` to copy the merged array `temp` back into `nums1`.

---

## Complexity
- **Time Complexity**: O(m + n)  
  The algorithm processes each element of `nums1` and `nums2` once.

- **Space Complexity**: O(m + n)  
  A temporary array of size `m + n` is used to store the merged result.


## Test Cases Passed
- **59/59**

## Complexity
- **Time Complexity**: O(m+n)
<img width="488" alt="image" src="https://github.com/user-attachments/assets/8ea0dddf-e346-4484-a081-ffe23333c3a6" />

- **Space Complexity**: O(m+n)
<img width="486" alt="image" src="https://github.com/user-attachments/assets/5b0e3d88-910d-4925-8dab-9e866c82900f" />
