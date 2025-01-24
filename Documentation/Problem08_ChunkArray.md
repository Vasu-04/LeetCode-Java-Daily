# Chunk Array

## Problem Link
Given an array arr and a chunk size size, return a chunked array.
A chunked array contains the original elements in arr, but consists of subarrays each of length size. The length of the last subarray may be less than size if arr.length is not evenly divisible by size.
You may assume the array is the output of JSON.parse. In other words, it is valid JSON.
Please solve it without using lodash's _.chunk function.

**Example 1:**

      Input: arr = [1,2,3,4,5], size = 1
      Output: [[1],[2],[3],[4],[5]]

      Explanation: The arr has been split into subarrays each with 1 element.

**Example 2:**

      Input: arr = [1,9,6,3,2], size = 3
      Output: [[1,9,6],[3,2]]
      
      Explanation: The arr has been split into subarrays with 3 elements. However, only two elements are left for the 2nd subarray.

**Example 3:**

      Input: arr = [8,5,3,2,6], size = 6
      Output: [[8,5,3,2,6]]
      
      Explanation: Size is greater than arr.length thus all elements are in the first subarray.

**Example 4:**

      Input: arr = [], size = 1
      Output: []
      
      Explanation: There are no elements to be chunked so an empty array is returned.
   
**Constraints**
<pre>
  1. 2 <= JSON.stringify(arr).length <= 10<sup>5</sup>
  2. arr is a valid JSON array
  3. 1 <= size <= arr.length + 1
</pre>


[Chunk Array](https://leetcode.com/problems/chunk-array/)

## Solution Explanation

### Initialization
1. **Input Parameters**:
   - An array `arr` of integers.
   - An integer `size` representing the maximum number of elements in each chunk.

2. **Output**:
   - A 2D array where each sub-array contains up to `size` elements.

---

### Logic and Iteration
1. **Result Array**:
   - An empty array `result` is initialized to store the resulting chunks.

2. **For Loop**:
   - A `for` loop iterates through the input array, incrementing by `size` on each iteration.
   - In each iteration, the `slice` method is used to extract a chunk of size `size` from the array.

3. **Push to Result**:
   - The extracted chunk is added to the `result` array.

---

### Return Output
- After the loop completes, the `result` array is returned, containing all the chunks.

## Test Cases Passed
- **76/76**

## Complexity
- **Time Complexity**: O(n)
<img width="488" alt="image" src="https://github.com/user-attachments/assets/b3473159-1fa2-4bed-9a3d-bfcc31daf325" />

- **Space Complexity**: O(n)
<img width="487" alt="image" src="https://github.com/user-attachments/assets/749dab3b-f5a5-43df-873e-3e1d5f666fa8" />
