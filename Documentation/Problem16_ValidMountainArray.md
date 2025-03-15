# Valid Mountain Array

## Problem Link
Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

1. arr.length >= 3
2. There exists some i with 0 < i < arr.length - 1 such that:
    a. arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
    b. arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

![image](https://github.com/user-attachments/assets/aa66a892-b928-4ae3-aba8-a51d8c834079)

**Example 1:**
      Input: arr = [2,1]
      Output: false

**Example 2:**
      Input: arr = [3,5,5]
      Output: false

**Example 3:**
      Input: arr = [0,3,2,1]
      Output: true
      
**Constraints**
<pre>
  1. 1 <= arr.length <= 10<sup>4</sup>
  2. 0 <= arr[i] <= 10<sup>4</sup>
</pre>

[Valid Mountain Array](https://leetcode.com/problems/valid-mountain-array/description/)

## Solution Explanation

### Initialization:

Three variables, `n`, `i`, and `j`, are used:
- `n` stores the length of the array.
- `i` starts at index `0` and moves forward to find the peak.
- `j` starts at the last index and moves backward to find the peak.

### Ascending Phase:

1. A `while` loop increments `i` as long as the next element is greater than the current one.
2. This loop stops when the peak of the mountain is reached.

### Descending Phase:

1. Another `while` loop decrements `j` as long as the current element is greater than the next one.
2. This loop also stops at the peak.

### Valid Mountain Check:

1. The peak should not be the first or last element.
2. The indices `i` and `j` must meet at the same position, confirming a single peak.
3. If these conditions hold, the function returns `true`; otherwise, it returns `false`.

## Test Cases Passed
- **53/53**

## Complexity
- **Time Complexity**:
<img width="488" alt="image" src="https://github.com/user-attachments/assets/aeaa2df5-c7bc-4e0c-b8b5-14842b178aff" />

- **Space Complexity**:
<img width="485" alt="image" src="https://github.com/user-attachments/assets/928573a8-775c-4a03-b783-7081a8d39b2d" />
