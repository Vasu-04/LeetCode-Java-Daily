# Shuffle An Array

## Problem Link
Given an integer array nums, design an algorithm to randomly shuffle the array. All permutations of the array should be equally likely as a result of the shuffling.

Implement the Solution class:

1. Solution(int[] nums) Initializes the object with the integer array nums.
2. int[] reset() Resets the array to its original configuration and returns it.
3. int[] shuffle() Returns a random shuffling of the array.

**Example 1:**
      Input: 
      ["Solution", "shuffle", "reset", "shuffle"]
      [[[1, 2, 3]], [], [], []]
      Output: [null, [3, 1, 2], [1, 2, 3], [1, 3, 2]]
      
      Explanation: 
      Solution solution = new Solution([1, 2, 3]);
      solution.shuffle();    // Shuffle the array [1,2,3] and return its result.
                       // Any permutation of [1,2,3] must be equally likely to be returned.
                       // Example: return [3, 1, 2]
      solution.reset();      // Resets the array back to its original configuration [1,2,3]. Return [1, 2, 3]
      solution.shuffle();    // Returns the random shuffling of array [1,2,3]. Example: return [1, 3, 2]

      
**Constraints**
<pre>
  1. 1 <= nums.length <= 50
  2. -10<sup>6</sup> <= nums[i] <= 10<sup>6</sup>
  3. All the elements of nums are unique.
  4. At most 10<sup>4</sup> calls in total will be made to reset and shuffle.
</pre>

[Shuffle An Array](https://leetcode.com/problems/shuffle-an-array/description/)

## Solution Explanation

### Initialization:

Two variables, `arr` and `backup`, are used to store the list representation of the input array and its immutable backup copy, respectively.

### Constructor:

1. The constructor initializes the `Solution` object with an integer array.
2. A backup copy of the array is stored to allow reset operations.
3. The input array is also stored as a list for easy manipulation.

### Reset Method:

1. Returns the original configuration of the array.
2. Since `backup` remains unchanged, returning it restores the original state.

### Shuffle Method:

1. Returns a random shuffling of the array.
2. Uses `Collections.shuffle()` to rearrange the elements in the list.
3. The shuffled list is converted back into an array before returning.

## Test Cases Passed
- **8/8**

## Complexity
- **Time Complexity**: O(1)
<img width="487" alt="image" src="https://github.com/user-attachments/assets/ff78f64a-a3f5-4f62-aa9b-409b05fe5491" />

- **Space Complexity**: O(N)
<img width="491" alt="image" src="https://github.com/user-attachments/assets/031e6183-da26-40fd-8d86-3e89f6ac7b8e" />
