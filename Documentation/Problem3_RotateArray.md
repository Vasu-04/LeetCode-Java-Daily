# Rotate Array

## Problem Link
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 

**Example 1:**

      Input: nums = [1,2,3,4,5,6,7], k = 3
      
      Output: [5,6,7,1,2,3,4]

      Explanation: 
      rotate 1 steps to the right: [7,1,2,3,4,5,6]
      rotate 2 steps to the right: [6,7,1,2,3,4,5]
      rotate 3 steps to the right: [5,6,7,1,2,3,4]

**Example 2:**

      Input: nums = [-1,-100,3,99], k = 2
      
      Output: [3,99,-1,-100]
      
      Explanation: 
      rotate 1 steps to the right: [99,-1,-100,3]
      rotate 2 steps to the right: [3,99,-1,-100]

**Constraints**
<pre>
  1 <= nums.length <= 10<sup>5</sup>
  -2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1
  0 <= k <= 10<sup>5</sup>
</pre>



[Rotate Array](https://leetcode.com/problems/rotate-array/description/)

## Solution Explanation
### Initialization
1. **Input Parameters**:
   - An array `nums` of integers.
   - An integer `k` representing the number of steps to rotate.

2. **Goal**:
   - Perform `k` right rotations on the array.

---

### Outer Loop
- The outer `for` loop runs `k` times, indicating the number of rotations to be performed.

---

### Inner Loop (Shifting Elements)
1. **Purpose**:
   - Perform a single right rotation by shifting all elements to the right.

2. **Logic**:
   - Use a temporary variable `prev` to store the value of the first element before shifting.
   - Iterate through the array starting from the second element (`nums[1]`), updating each element with the value of its previous element.
   - The first element `nums[0]` is updated with the value of `prev` at the end of the rotation.

---

### Completing the Rotation
- After each iteration of the outer loop, the array is shifted by one position to the right.

---
## Test Cases Passed
- **37/38**

## Complexity
- **Time Complexity**: O(n.k)

- **Space Complexity**: O(1)
