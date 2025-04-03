# Make Array Empty

## Problem Link
You are given an integer array nums containing distinct numbers, and you can perform the following operations until the array is empty:

1. If the first element has the smallest value, remove it
2. Otherwise, put the first element at the end of the array.
Return an integer denoting the number of operations it takes to make nums empty.

**Example 1:**

      Input: nums = [3,4,-1]
      Output: 5
      
      Explanation: 
| Operation| Array       | 
|----------|-------------|
| 1        | [4, -1, 3]  | 
| 2        | [-1, 3, 4]  | 
| 3        | [3, 4]      | 
| 4        | [4]         | 
| 5        | []          | 
      
**Example 2:**

      Input: nums = [1,2,4,3]
      Output: 5
      
      Explanation: 
| Operation| Array       | 
|----------|-------------|
| 1        | [2, 4, 3]   | 
| 2        | [4, 3]      | 
| 3        | [3, 4]      | 
| 4        | [4]         | 
| 5        | []          | 

**Example 3:**

      Input: nums = [1,2,3]
      Output: 3
      
      Explanation: 
| Operation| Array       | 
|----------|-------------|
| 1        | [2, 3]      | 
| 2        | [3]         | 
| 3        | []          | 
            
**Constraints**
<pre>
  1. 1 <= nums.length <= 10<sup>5</sup>
  2. -10<sup>9</sup> <= nums[i] <= 10<sup>9</sup>
  3. All values in nums are distinct
</pre>

[Make Array Empty](https://leetcode.com/problems/make-array-empty/description/)

## Solution Explanation

### Initialization:

Several variables are used:
- `n` stores the length of the input array `A`.
- `pos` is an array that stores the original indices of elements in `A`.

### Sorting Process:

1. Populate `pos` with indices of `A`.
2. Sort `pos` based on the values in `A`, preserving their original positions.

### Count Operations:

1. Initialize `res` with `n`, representing the number of operations required.
2. Iterate through the sorted indices:
   - If `pos[i]` is smaller than `pos[i - 1]`, it means a wraparound operation is needed.
   - Increment `res` by `n - i` to account for these extra operations.

### Return Output:

- The function returns `res`, which represents the total operations needed to empty the array.
  
## Test Cases Passed
- **514/514**

## Complexity
- **Time Complexity**: 
<img width="485" alt="image" src="https://github.com/user-attachments/assets/225faebd-b06e-45d4-94d7-e76c45115675" />

- **Space Complexity**:
<img width="486" alt="image" src="https://github.com/user-attachments/assets/75fcc6bd-e977-4b33-a5b8-e85f897b0d9b" />
