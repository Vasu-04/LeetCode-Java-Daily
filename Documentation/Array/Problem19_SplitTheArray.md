# Split The Array

## Problem Link
You are given an integer array nums of even length. You have to split the array into two parts nums1 and nums2 such that:
1. nums1.length == nums2.length == nums.length / 2.
2. nums1 should contain distinct elements.
3. nums2 should also contain distinct elements.
Return true if it is possible to split the array, and false otherwise

**Example 1:**
      Input: nums = [1,1,2,2,3,4]
      Output: true
      Explanation: One of the possible ways to split nums is nums1 = [1,2,3] and nums2 = [1,2,4].
      
**Example 2:**
      Input: nums = [1,1,1,1]
      Output: false
      Explanation: The only possible way to split nums is nums1 = [1,1] and nums2 = [1,1]. Both nums1 and nums2 do not contain distinct elements. Therefore, we return false.
            
**Constraints**
<pre>
  1. 1 <= nums.length <= 100
  2. nums.length % 2 == 0 
  3. 1 <= nums[i] <= 100
</pre>

[Split The Array](https://leetcode.com/problems/split-the-array/description/)

## Solution Explanation

### Initialization:

A single integer array `numbers` of size 101 is used to keep track of occurrences of elements in `nums`.

### Frequency Check:

1. Iterate through the `nums` array.
2. For each element, increment its count in the `numbers` array.
3. If any number appears more than twice, return `false`.

### Return Output:

- If no number appears more than twice, return `true`, indicating that the array can be split into two equal parts.
  
## Test Cases Passed
- **715/715**

## Complexity
- **Time Complexity**: 
<img width="488" alt="image" src="https://github.com/user-attachments/assets/49e1ac30-e204-4875-8492-bfd6f6703efe" />

- **Space Complexity**:
<img width="482" alt="image" src="https://github.com/user-attachments/assets/6fe3afea-6a81-4e9b-947f-a650ba86fe8e" />
