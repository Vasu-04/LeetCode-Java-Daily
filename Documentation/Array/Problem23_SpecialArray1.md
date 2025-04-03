# Special Array 1

## Problem Link
An array is considered special if the parity of every pair of adjacent elements is different. In other words, one element in each pair must be even, and the other must be odd.

You are given an array of integers nums. Return true if nums is a special array, otherwise, return false.

**Example 1:**

      Input:  nums = [1]
      Output: true
      
      Explanation: 
      There is only one element. So the answer is true.
      
**Example 2:**

      Input: nums = [2,1,4]
      Output: true
      
      Explanation: 
      There is only two pairs: (2,1) and (1,4), and both of them contain numbers with different parity. So the answer is true.

**Example 3:**

      Input: nums = [4,3,1,6]
      Output: false
      
      Explanation: 
      nums[1] and nums[2] are both odd. So the answer is false.

**Constraints**
<pre>
  1. 1 <= nums.length <= 100
  2. 1 <= nums[i] <= 100
</pre>

[Special Array 1](https://leetcode.com/problems/special-array-i/description/)

## Solution Explanation

### Initialization:

A variable `prev` is used to keep track of the parity (even or odd) of the previous element.

### Iteration Process:

1. Iterate through the `nums` array.
2. If it's the first element, assign `prev` based on whether it's even (`'e'`) or odd (`'o'`).
3. For subsequent elements:
   - If the current element has the same parity as `prev`, break the loop.
   - Otherwise, update `prev` accordingly.

### Return Output:

- If the loop completes without breaking, return `true`, indicating that the array follows an alternating even-odd pattern.
- Otherwise, return `false`.
  
## Test Cases Passed
- **852/852**

## Complexity
- **Time Complexity**: 
![Uploading image.png…]()

- **Space Complexity**:
![Uploading image.png…]()
