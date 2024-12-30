# Array Partition

## Problem Link
Given an integer array nums of 2n integers, group these integers into n pairs (a<sub>1</sub>, b<sub>1</sub>), (a<sub>2</sub>, b<sub>2</sub>), ..., (a<sub>n</sub>, b<sub>n</sub>) such that the sum of min(a<sub>i</sub>, b<sub>i</sub>) for all i is maximized. Return the maximized sum.

**Example 1:**

      Input: nums = [1,4,3,2]
      
      Output: 4
      
      Explanation: All possible pairings (ignoring the ordering of elements) are:
      1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
      2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
      3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
      So the maximum possible sum is 4.

**Example 2:**

      Input: nums = [6,2,6,5,1,2]
      
      Output: 9
      
      Explanation: The optimal pairing is (2, 1), (2, 5), (6, 6). min(2, 1) + min(2, 5) + min(6, 6) = 1 + 2 + 6 = 9.

**Constraints**
<pre>
  1 <= n <= 10<sup>4</sup>
  nums.length == 2*n
  -10<sup>4</sup> <= nums[i] <= 10<sup>4</sup>
</pre>



[Array Partition](https://leetcode.com/problems/array-partition/)

## Solution Explanation

### 1. `countingSort` Function
This function sorts the input array using the **Counting Sort** algorithm. It handles both positive and negative numbers.

#### Steps:

##### a. Initialization
- **Input:** An array `arr` of integers.  
- **Output:** A sorted array `finalArr`.  

##### b. Find Minimum and Maximum Values
- The algorithm determines the range of values in the array by calculating the minimum (`min`) and maximum (`max`) values.  

##### c. Handle Non-Negative Values
- If all elements in the array are non-negative (`min > 0`):
  1. Create an auxiliary array `aux` of size `max + 1` to store the frequency of elements.
  2. Populate the `aux` array with the count of each element in `arr`.
  3. Compute the cumulative frequency in `aux` to determine the sorted positions of elements.
  4. Build the sorted array by iterating through `arr` in reverse and placing elements in their correct positions in `finalArr`.

##### d. Handle Mixed Positive and Negative Values
- If the array contains negative values (`min <= 0`):
  1. Create an auxiliary array `aux` of size `max - min + 1` to account for the range of values.
  2. Shift the values in `arr` to all-positive values using the offset `-min`.
  3. Populate the `aux` array and compute cumulative frequencies.
  4. Use the cumulative frequencies to build the sorted array `finalArr` in reverse order.

##### e. Return the Sorted Array
- The function returns the fully sorted array `finalArr`.

---

### 2. `arrayPairSum` Function
This function calculates the sum of the minimum elements of each pair in the sorted array.

#### Steps:

##### a. Sort the Array
- The input array `nums` is sorted using the `countingSort` function.

##### b. Calculate the Pair Sum
- Iterate through the sorted array, adding every alternate element (at even indices) to the sum.

##### c. Return the Sum
- The function returns the calculated sum.

---
## Test Cases Passed
- **85/85**

## Complexity
- **Time Complexity**: O(n)
<img width="491" alt="image" src="https://github.com/user-attachments/assets/cf25a950-6e19-4c66-9211-ce559a266ff0" />


- **Space Complexity**: O(n)
<img width="491" alt="image" src="https://github.com/user-attachments/assets/e8e38a2d-f381-4fbe-a3aa-4cb2a009eb4b" />
