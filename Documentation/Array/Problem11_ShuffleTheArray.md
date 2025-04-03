# Shuffle The Array

## Problem Link
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

**Example 1:**

      Input: nums = [2,5,1,3,4,7], n = 3
      Output: [2,3,5,4,1,7] 

      Explanation: 
      TSince x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

**Example 2:**

      Input: nums = [1,2,3,4,4,3,2,1], n = 4
      Output: [1,4,2,3,3,2,4,1]

**Example 3:**

      Input: nums = [1,1,2,2], n = 2
      Output: [1,2,1,2]
   
**Constraints**
<pre>
  1. 1 <= n <= 500
  2. nums.length == 2n
  3. 1 <= nums1[i] <= 10<sup>3</sup>
</pre>


[Shuffle The Array](https://leetcode.com/problems/shuffle-the-array/)

## Solution Explanation

### Initialization
1. **Input Parameters**:
   - An array `nums` of size `2n`.
   - An integer `n` representing half the size of the array.

2. **Goal**:
   - Return a new array where the elements are shuffled in the order `[x1, y1, x2, y2, ..., xn, yn]`.

3. **Result Array**:
   - A new array `result` of size `2n` is initialized to store the shuffled elements.

---

### Iteration
- **Variables**:
  - `i`: Tracks the current index of the `x` values (`nums[0]` to `nums[n-1]`).
  - `k`: Tracks the current position in the `result` array.

- **Logic**:
  - Loop through the first `n` elements of `nums` using `i`.
  - For each `i`:
    1. Add `nums[i]` (the `x` value) to `result[k]`.
    2. Add `nums[i+n]` (the corresponding `y` value) to `result[k+1]`.
    3. Increment `k` twice to update the next available positions in `result`.

---

### Return Output
- After the loop completes, return the shuffled `result` array.

## Test Cases Passed
- **53/53**

## Complexity
- **Time Complexity**: O(n)
<img width="483" alt="image" src="https://github.com/user-attachments/assets/20a1cb6a-7a88-4784-8b5a-8958d3e772d2" />

- **Space Complexity**: O(n)
<img width="484" alt="image" src="https://github.com/user-attachments/assets/efdccfee-bc50-4a9e-9ea2-9b4a441e3bf6" />
