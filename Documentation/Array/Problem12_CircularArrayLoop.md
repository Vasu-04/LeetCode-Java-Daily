# Circular Array Loop

## Problem Link
You are playing a game involving a circular array of non-zero integers nums. Each nums[i] denotes the number of indices forward/backward you must move if you are located at index i:

If nums[i] is positive, move nums[i] steps forward, and
If nums[i] is negative, move nums[i] steps backward.
Since the array is circular, you may assume that moving forward from the last element puts you on the first element, and moving backwards from the first element puts you on the last element.

A cycle in the array consists of a sequence of indices seq of length k where:
    1. Following the movement rules above results in the repeating index sequence seq[0] -> seq[1] -> ... -> seq[k - 1] -> seq[0] -> ...
    2. Every nums[seq[j]] is either all positive or all negative.
    3. k > 1
Return true if there is a cycle in nums, or false otherwise.

**Example 1:**
      ![image](https://github.com/user-attachments/assets/2184f06a-7514-470a-a20f-ac1a68ad8bbd)
      Input: nums = [2,-1,1,2,2]
      Output: true
      
      Explanation: 
      The graph shows how the indices are connected. White nodes are jumping forward, while red is jumping backward.
      We can see the cycle 0 --> 2 --> 3 --> 0 --> ..., and all of its nodes are white (jumping in the same direction).

**Example 2:**
      ![image](https://github.com/user-attachments/assets/ad884828-1d4d-475a-b2cf-4dadce6a61da)
      Input: nums = [-1,-2,-3,-4,-5,6]
      Output: false

      Explanation: 
      The graph shows how the indices are connected. White nodes are jumping forward, while red is jumping backward.
      The only cycle is of size 1, so we return false.

**Example 3:**
      ![image](https://github.com/user-attachments/assets/9e4563f2-33ea-4ae1-a0de-df710b199dbb)
      Input: nums = [1,-1,5,1,4]
      Output: true

      Explanation: 
      The graph shows how the indices are connected. White nodes are jumping forward, while red is jumping backward.
      We can see the cycle 0 --> 1 --> 0 --> ..., and while it is of size > 1, it has a node jumping forward and a node jumping backward, so it is not a cycle.
      We can see the cycle 3 --> 4 --> 3 --> ..., and all of its nodes are white (jumping in the same direction).
      
**Constraints**
<pre>
  1. 1 <= nums.length <= 5000
  2. -1000 <= nums[i] <= 1000
  3. nums[i] != 0
</pre>

[Cicular Array Loop](https://leetcode.com/problems/circular-array-loop/)

## Solution Explanation

### **Initialization**

- **`visited`**:  
  A boolean array to keep track of indices that have been visited during the search for a loop.

- **`present`**:  
  A flag (`boolean`) that becomes `true` if a valid circular loop is found.

---

### **Steps**

#### 1. **Outer Loop**  
   The outer loop iterates over all indices (`i`) in the `nums` array. Each index is treated as a starting point for finding a loop.

#### 2. **Tracking Current and Previous Indices**  
   - **`currIndex`**: The current index being processed.
   - **`prevIndex`**: The index just before `currIndex` in the sequence.

#### 3. **Direction Check**  
   Inside the loop, the program ensures that all numbers in the sequence point in the same direction.  
   If the sign of the current number (`nums[currIndex]`) and the previous number (`nums[prevIndex]`) do not match, the search from this starting point is aborted.

#### 4. **Cycle Detection**  
   - If an index (`currIndex`) is visited again, the program checks if the loop:
     1. Contains more than one element.
     2. Doesn't loop back to the same index immediately.  
   - If these conditions are satisfied, a valid circular loop is detected (`present = true`).

#### 5. **Updating Indices**  
   - If no cycle is detected, the `currIndex` is updated using modular arithmetic to simulate the circular nature of the array.
   - Negative indices are handled by adding the array length to keep them within bounds.

---

### **Edge Cases**

1. If the array contains only zeros or a single number, no loop is possible.
2. The program resets the `visited` array whenever an invalid loop or mismatch is encountered.

## Test Cases Passed
- **45/45**

## Complexity
- **Time Complexity**: O(n)
<img width="481" alt="image" src="https://github.com/user-attachments/assets/1831b2c0-34b3-458f-8f41-010a21745fc8" />

- **Space Complexity**: O(n)
<img width="482" alt="image" src="https://github.com/user-attachments/assets/4d61f5e5-3757-45bf-8016-faf4f391f420" />
