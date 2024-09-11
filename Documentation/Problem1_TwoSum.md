# Two Sum

## Problem Link
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
- **Time Complexity**: O(n)
- **Space Complexity**: O(n)

