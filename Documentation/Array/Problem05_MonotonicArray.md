# Monotonic Array

## Problem Link
An array is monotonic if it is either monotone increasing or monotone decreasing.
An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
Given an integer array nums, return true if the given array is monotonic, or false otherwise.

**Example 1:**

      Input: nums = [1,2,2,3]
      
      Output: true

**Example 2:**

      Input: nums = [6,5,4,4]
      
      Output: true

**Example 3:**

      Input: nums = [1,3,2]
      
      Output: false

**Constraints**
<pre>
  1 <= nums.length <= 10<sup>5</sup>
  -10<sup>5</sup> <= nums[i] <= 10<sup>5</sup>
</pre>



[Monotonic Array](https://leetcode.com/problems/monotonic-array/description/)

## Solution Explanation

### Initialization

1. The function starts by determining the length of the array `nums` and storing it in the variable `n`.
2. If the array contains only one element (`n == 1`), it is trivially monotonic, so the function immediately returns `true`.
3. Two boolean variables, `isInc` and `isDec`, are initialized to `true`. These variables will be used to track whether the array is increasing or decreasing, respectively.

---

### Iteration

1. A `for` loop starts from the second element (index `1`) and iterates through the array until the last element.
2. Inside the loop:
   - If neither `isInc` nor `isDec` holds true, the function immediately returns `false`, as this means the array is neither increasing nor decreasing.
   - If the current element (`nums[i]`) is less than the previous element (`nums[i - 1]`), the array cannot be increasing, so `isInc` is set to `false`.
   - If the current element (`nums[i]`) is greater than the previous element (`nums[i - 1]`), the array cannot be decreasing, so `isDec` is set to `false`.

---

### Return Output

1. After the loop completes, the function returns the result of `isInc || isDec`.
2. This means the function will return `true` if the array is either entirely increasing or entirely decreasing. Otherwise, it will return `false`.

   
## Test Cases Passed
- **371/371**

## Complexity
- **Time Complexity**: O(n)
<img width="491" alt="image" src="https://github.com/user-attachments/assets/ec46e51f-46b5-4a63-8cb3-cfd06f49b92e" />


- **Space Complexity**: O(1)
<img width="485" alt="image" src="https://github.com/user-attachments/assets/167de6b6-e368-4893-b516-a23543573977" />
