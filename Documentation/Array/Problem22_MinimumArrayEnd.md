# Minimum Array End

## Problem Link
You are given two integers n and x. You have to construct an array of positive integers nums of size n where for every 0 <= i < n - 1, nums[i + 1] is greater than nums[i], and the result of the bitwise AND operation between all elements of nums is x.

Return the minimum possible value of nums[n - 1].

**Example 1:**

      Input:  n = 3, x = 4
      Output: 6
      
      Explanation: 
      nums can be [4,5,6] and its last element is 6.
      
**Example 2:**

      Input: n = 2, x = 7
      Output: 15
      
      Explanation: 
      nums can be [7,15] and its last element is 15.

**Constraints**
<pre>
  1. 1 <= n, x <= 10<sup>8</sup>
</pre>

[Minimum Array End](https://leetcode.com/problems/minimum-array-end/description/)

## Solution Explanation

### Initialization:

Two variables are used:
- `n` represents the number of elements.
- `x` is the starting number that influences the final result.
- `result` is initialized with `x` to track the computation.

### Computation Process:

1. Loop while `n` is greater than 1.
2. Increment `result` by 1 and perform a bitwise OR with `x`.
3. Repeat until `n` reaches 1.

### Return Output:

- The function returns `result`, which is the smallest possible value for the last element after constructing the sequence.
  
## Test Cases Passed
- **765/765**

## Complexity
- **Time Complexity**: 
<img width="487" alt="image" src="https://github.com/user-attachments/assets/09b863df-6f3e-48a0-9df3-d0a525174f3c" />

- **Space Complexity**:
<img width="485" alt="image" src="https://github.com/user-attachments/assets/4240d1d5-af76-4d8d-b42e-2ad3fba8f891" />
