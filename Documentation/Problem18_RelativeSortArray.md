# Relative Sort Array

## Problem Link
Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

**Example 1:**
      Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
      Output: [2,2,2,1,4,3,3,9,6,7,19]

**Example 2:**
      Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
      Output: [22,28,8,6,17,44]
            
**Constraints**
<pre>
  1. 1 <= arr1.length, arr2.length <= 1000
  2. 0 <= arr1[i], arr2[i] <= 1000
  3. All the elements of arr2 are distinct.
  4. Each arr2[i] is in arr1.
</pre>

[Relative Sort Array](https://leetcode.com/problems/relative-sort-array/)

## Solution Explanation

### Initialization:

Several variables are used:
- `arr1List`: A list to store elements of `arr1` for easier manipulation.
- `result`: An array to store the final sorted elements.
- `tempResult`: A temporary array used in sorting the remaining elements.
- `freq`: An array to store frequency counts for sorting.
- `k`: An index pointer to track positions in `result`.

### Sorting Process:

1. Copy all elements of `arr1` into `arr1List`.
2. Iterate through `arr2`, counting occurrences of each number in `arr1List`.
3. Add counted occurrences to `result` and remove them from `arr1List`.
4. If `arr1List` is empty, return `arr2` as the result.

### Remaining Elements Sorting:

1. If `arr1List` still contains elements, initialize `freq` to store count frequencies.
2. Compute cumulative frequency counts to determine sorted positions.
3. Place elements in `tempResult` in sorted order.
4. Copy sorted elements from `tempResult` into `result`.

### Return Output:

- The function returns the sorted array based on `arr2`'s order, followed by sorted remaining elements.
## Test Cases Passed
- **17/17**

## Complexity
- **Time Complexity**: 
<img width="486" alt="image" src="https://github.com/user-attachments/assets/4be9fbe4-84e2-4740-9998-06579ff70f02" />

- **Space Complexity**:
<img width="483" alt="image" src="https://github.com/user-attachments/assets/a08228b2-98c0-4f86-b422-a9ca22bc25f2" />
