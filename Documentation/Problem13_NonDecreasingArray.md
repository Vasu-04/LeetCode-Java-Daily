# Non Decreasing Array

## Problem Link
Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most one element.

We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).

**Example 1:**
      Input: nums = [4,2,3]
      Output: true
      
      Explanation: 
      You could modify the first 4 to 1 to get a non-decreasing array.

**Example 2:**
      Input: nums = [4,2,1]
      Output: false

      Explanation: 
      You cannot get a non-decreasing array by modifying at most one element.
      
**Constraints**
<pre>
  1. n == nums.length
  2. 1 <= n <= 104
  3. -10<sup>5</sup> <= nums[i] <= 10<sup>5</sup>
</pre>

[Non Decreasing Array](https://leetcode.com/problems/non-decreasing-array/)

## Solution Explanation

### Initialization:

A variable `changesMade` is defined to keep track of the number of modifications needed to make the array non-decreasing.

### Iteration through the Array:

1. The program iterates through the array `nums` starting from index `1` (since we compare adjacent elements).
2. It checks if the previous element (`nums[i - 1]`) is greater than the current element (`nums[i]`). If this condition holds, it means the sequence is not non-decreasing.

### Condition Check and Modification:

1. If `changesMade` is already greater than `0`, it returns `false`, ensuring that at most one modification is allowed.
2. If no modifications have been made yet, `changesMade` is incremented.
3. Then, a further condition checks if modifying `nums[i - 1]` would maintain a non-decreasing order:
   - If `nums[i - 2] > nums[i]`, modify `nums[i]` to `nums[i - 1]` (ensuring a valid order).
   - Otherwise, modify `nums[i - 1]` to `nums[i]` to maintain the sequence.

### Return Output:

After the loop completes, the function returns `true`, meaning the array can be made non-decreasing by modifying at most one element.


## Test Cases Passed
- **335/335**

## Complexity
- **Time Complexity**: O(n)
<img width="487" alt="image" src="https://github.com/user-attachments/assets/32f2378b-e699-4530-b3a3-634813718a94" />

- **Space Complexity**: O(1)
<img width="488" alt="image" src="https://github.com/user-attachments/assets/16f6b9d8-17f7-4ed4-81bd-fc0a1ce09618" />
