# Transformed Array

## Problem Link
You are given an integer array nums that represents a circular array. Your task is to create a new array result of the same size, following these rules:
For each index i (where 0 <= i < nums.length), perform the following independent actions:
If nums[i] > 0: Start at index i and move nums[i] steps to the right in the circular array. Set result[i] to the value of the index where you land.
If nums[i] < 0: Start at index i and move abs(nums[i]) steps to the left in the circular array. Set result[i] to the value of the index where you land.
If nums[i] == 0: Set result[i] to nums[i].
Return the new array result.

Note: Since nums is circular, moving past the last element wraps around to the beginning, and moving before the first element wraps back to the end.

**Example 1:**

      Input: nums = [3,-2,1,1]
      Output: [1,1,1,3]

      Explanation: 
      1. For nums[0] that is equal to 3, If we move 3 steps to right, we reach nums[3]. So result[0] should be 1.
      2. For nums[1] that is equal to -2, If we move 2 steps to left, we reach nums[3]. So result[1] should be 1.
      3. For nums[2] that is equal to 1, If we move 1 step to right, we reach nums[3]. So result[2] should be 1.
      4. For nums[3] that is equal to 1, If we move 1 step to right, we reach nums[0]. So result[3] should be 3.

**Example 2:**

      Input: nums = [-1,4,-1]
      Output: [-1,-1,4]
      
      Explanation: 
      1. For nums[0] that is equal to -1, If we move 1 step to left, we reach nums[2]. So result[0] should be -1.
      2. For nums[1] that is equal to 4, If we move 4 steps to right, we reach nums[2]. So result[1] should be -1.
      3. For nums[2] that is equal to -1, If we move 1 step to left, we reach nums[1]. So result[2] should be 4.

   
**Constraints**
<pre>
  1. 1 <= nums.length <= 100
  2. -100 <= nums[i] <= 100
</pre>


[Transformed Array](https://leetcode.com/problems/transformed-array/)

## Solution Explanation

### Key Concepts:

1. **Index Wrapping**:
   - To shift an element to the right or left while staying within the bounds of the array, modular arithmetic is used:
     - **Right Shift**: `(currentIndex + steps) % arrayLength`
     - **Left Shift**: `(currentIndex - steps + arrayLength) % arrayLength`
   - This ensures the indices wrap around circularly.

2. **Helper Function**:
   - `indexSearch`: Determines the new index for an element after shifting. Takes in:
     - `currIndex`: The current index of the element.
     - `steps`: The number of positions to shift.
     - `dir`: The direction of the shift ('r' for right, 'l' for left).

3. **Result Array**:
   - A new array `result` is created to store the transformed values based on the shifting rules.

---

### Steps:

1. **Initialization**:
   - Create an empty `result` array of the same length as `nums`.
   - Store the array length (`arrLen`) for repeated use in modular calculations.

2. **Iterating Through the Array**:
   - For each element in `nums`:
     - If the value is positive, shift it to the right using `indexSearch`.
     - If the value is negative, shift it to the left using `indexSearch`.
     - If the value is zero, retain it at the current index.

3. **Return the Result**:
   - After iterating through the array, return the `result` array.

## Test Cases Passed
- **695/695**

## Complexity
- **Time Complexity**: O(n)
<img width="479" alt="image" src="https://github.com/user-attachments/assets/1ed60661-12ce-4c83-8dce-cc6eefeb96ec" />

- **Space Complexity**: O(n)
<img width="488" alt="image" src="https://github.com/user-attachments/assets/f4de3a41-5e1f-4af0-9343-76ca5b05fa0a" />
