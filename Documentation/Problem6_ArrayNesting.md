# Array Nesting

## Problem Link
You are given an integer array nums of length n where nums is a permutation of the numbers in the range [0, n - 1].
You should build a set s[k] = {nums[k], nums[nums[k]], nums[nums[nums[k]]], ... } subjected to the following rule:
  1. The first element in s[k] starts with the selection of the element nums[k] of index = k.
  2. The next element in s[k] should be nums[nums[k]], and then nums[nums[nums[k]]], and so on.
  3. We stop adding right before a duplicate element occurs in s[k].
Return the longest length of a set s[k].

**Example 1:**

      Input: nums = [5,4,0,3,1,6,2]
      
      Output: 4

      Explanation:
      nums[0] = 5, nums[1] = 4, nums[2] = 0, nums[3] = 3, nums[4] = 1, nums[5] = 6, nums[6] = 2.
      One of the longest sets s[k]:
      s[0] = {nums[0], nums[5], nums[6], nums[2]} = {5, 6, 2, 0}

**Example 2:**

      Input: nums = [0,1,2]
      
      Output: 1
   
**Constraints**
<pre>
  1. 1 <= nums.length <= 10<sup>5</sup>
  2. 0 <= nums[i] <= nums.length
  3. All the values of nums are unique
</pre>


[Array Nesting](https://leetcode.com/problems/array-nesting/)

## Solution Explanation

### Initialization
1. **Input Parameters**:
   - An array `nums` of integers.
   
2. **Goal**:
   - Find the size of the largest set of indices that can be formed using the rules specified.

3. **Data Structures**:
   - A `boolean` array `visited` of size `nums.length` is initialized to `false` for all indices.  
   **Purpose**: To ensure each index is processed only once.

---

### Outer Loop
- A `for` loop iterates through the array `nums` using the variable `i`.

---

### Inner Loop (Traversing a Set)
1. **Purpose**:
   - Form a set starting from index `i` and count its size.

2. **Logic**:
   - Initialize a variable `count` to `0`.
   - Initialize `current` to the value of `i`.
   - While `current` has not been visited:
     - Mark `current` as visited in the `visited` array.
     - Update `current` to `nums[current]` (the next index in the set).
     - Increment `count`.

3. **Updating Result**:
   - After the inner loop completes, compare `count` with `maxCount` and update `maxCount` if the current set size is larger.

---

### Return Statement
- After all indices have been processed, return `maxCount`, which stores the size of the largest set.
   
## Test Cases Passed
- **885/885**

## Complexity
- **Time Complexity**: O(n)
<img width="491" alt="image" src="https://github.com/user-attachments/assets/96480382-6c64-4f77-92fd-1d937fd4b702" />


- **Space Complexity**: O(n)
<img width="492" alt="image" src="https://github.com/user-attachments/assets/ae93f1c1-4f4f-4f88-ae6a-49b97cb1eed7" />
