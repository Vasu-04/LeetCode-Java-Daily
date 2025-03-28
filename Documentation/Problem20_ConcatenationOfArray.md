# Concatenation Of Array

## Problem Link
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.

**Example 1:**
      Input: nums = [1,2,1]
      Output: [1,2,1,1,2,1]
      Explanation: The array ans is formed as follows:
      - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
      - ans = [1,2,1,1,2,1]
      
**Example 2:**
      Input: nums = [1,3,2,1]
      Output: [1,3,2,1,1,3,2,1]
      Explanation: The array ans is formed as follows:
      - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
      - ans = [1,3,2,1,1,3,2,1]
            
**Constraints**
<pre>
  1. n == nums.length
  2. 1 <= n <= 1000
  3. 1 <= nums[i] <= 1000
</pre>

[Concatenation Of Array](https://leetcode.com/problems/concatenation-of-array/description/)

## Solution Explanation

### Initialization:

An integer array `ans` of size `2 * nums.length` is created to store the concatenated result.

### Concatenation Process:

1. Iterate through the `nums` array.
2. Copy each element to `ans` at two positions:
   - The original index `i`.
   - The index `i + nums.length` to create a duplicate sequence.

### Return Output:

- The function returns `ans`, which contains `nums` repeated twice in order.
  
## Test Cases Passed
- **92/92**

## Complexity
- **Time Complexity**: 
<img width="482" alt="image" src="https://github.com/user-attachments/assets/9ffe5674-7ff6-46a5-a32e-a8f1e9daea38" />

- **Space Complexity**:
<img width="486" alt="image" src="https://github.com/user-attachments/assets/17d25264-42e2-4a8c-9817-38e892f6d8a0" />
