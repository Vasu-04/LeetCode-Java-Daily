# Sort An Array

## Problem Link
Given an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

**Example 1:**
      Input: nums = [5,2,3,1]
      Output: [1,2,3,5]
      
      Explanation: 
      After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).

**Example 2:**
      Input: nums = [5,1,1,2,0,0]
      Output: [0,0,1,1,2,5]

      Explanation: 
      Note that the values of nums are not necessairly unique.
      
**Constraints**
<pre>
  1. n <= nums.length <= 5 * 10<sup>4</sup>
  2. -5 * 10<sup>4</sup> <= nums[i] <= 5 * 10<sup>4</sup>
</pre>

[Non Decreasing Array](https://leetcode.com/problems/non-decreasing-array/)

## Solution Explanation

# Counting Sort Implementation in Java

## Overview

This Java program implements the **Counting Sort** algorithm to sort an array of integers. It efficiently sorts positive and negative numbers using an auxiliary array to count occurrences and determine positions.

## Algorithm Explanation

### Step 1: Initialize Variables

- `min` and `max` are initialized to track the smallest and largest numbers in the array.
- `finalArr` is initialized to store the sorted array.

### Step 2: Find the Minimum and Maximum Elements

- The first `for` loop finds the **minimum element** in the array.
- The second `for` loop finds the **maximum element** in the array.

### Step 3: Counting Sort for Positive Numbers

If all numbers are **positive** (`min > 0`):
1. Create an auxiliary array `aux` of size `max + 1`.
2. Count occurrences of each element in `aux`.
3. Convert `aux` into a cumulative sum array.
4. Place elements into `finalArr` using the `aux` array.

### Step 4: Counting Sort for Mixed (Negative and Positive) Numbers

If negative numbers exist:
1. Calculate the range as `max - min + 1`.
2. Create `aux` and a `newArray` where each element is shifted to be non-negative.
3. Count occurrences in `aux` and convert it into a cumulative sum array.
4. Place elements back into `finalArr` using the `aux` array.

### Step 5: Return Sorted Array

After processing, `finalArr` contains the sorted version of `arr`.


## Test Cases Passed
- **21/21**

## Complexity
- **Time Complexity**:
<img width="483" alt="image" src="https://github.com/user-attachments/assets/15b67d81-71de-4a56-a11f-bf22feb0b8eb" />

- **Space Complexity**:
<img width="481" alt="image" src="https://github.com/user-attachments/assets/4da8996e-0350-4fbf-ab38-d0289dde7508" />
