# Two Sum

## Problem Link
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

**Example 1:**

      Input: nums = [2,7,11,15], target = 9

      Output: [0,1]

      Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

**Example 2:**

      Input: nums = [3,2,4], target = 6

      Output: [1,2]

**Example 3:**

      Input: nums = [3,3], target = 6

      Output: [0,1]

[[Two Sum]](https://leetcode.com/problems/two-sum/description/)

## Solution Explanation
### Initialization:

Two variables, targetIndex1 and targetIndex2, are defined to store the indices of the two numbers that sum up to the target.

### Nested Loops:

1. The first for loop iterates through the array nums using the variable i. This represents the first number in the pair.
2. Inside this loop, there is a second for loop that iterates through the remaining part of the array using the variable j. It starts from i + 1, ensuring that each pair is evaluated only once.
   
### Condition Check:

1. For each pair of indices i and j, it checks if the sum of nums[i] + nums[j] equals the target. If it does, it stores the indices i and j in targetIndex1 and targetIndex2 respectively.
2. Once a matching pair is found, the loop breaks, so further unnecessary comparisons are avoided.

### Return Output:

After the loops complete (or the break is triggered), the result is stored in the output array, which contains the indices of the two numbers that sum up to the target.

## Test Cases Passed
- **34/34**

## Complexity
- **Time Complexity**: O(n<sup>2</sup>)
  
  <img width="503" alt="image" src="https://github.com/user-attachments/assets/a1deb5dc-d736-498f-9314-59ac957d24c8">

- **Space Complexity**: O(1)
  
  <img width="508" alt="image" src="https://github.com/user-attachments/assets/76c36f40-7f84-4808-89e0-c519483505ff">


