# Maximal Rectangle

## Problem Link
Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.

**Example 1:**

      Input:  matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
      Output: 6
      Explanation: The maximal rectangle is shown in the above picture.
  ![image](https://github.com/user-attachments/assets/366e423e-4c21-4ebd-a4f2-4eaa7e46c5e2)



**Example 2:**

      Input:  matrix = [["0"]]
      Output: 0
      
**Example 3:**

      Input:  matrix = [["1"]]
      Output: 1

**Constraints**
<pre>
  1. rows == matrix.length
  2. cols == matrix[i].length
  3. 1 <= row, cols <= 200
  4. matrix[i][j] is '0' or '1'.
</pre>

[Maximal Reactangle](https://leetcode.com/problems/maximal-rectangle/)

## Solution Explanation

### Initialization:

- Arrays `left` and `right` store the indices of the nearest smaller bars to the left and right of each bar.
- An integer `totalArea` is initialized to 0 to keep track of the maximum rectangle area.
- A stack is used to help determine these left and right boundaries efficiently.

### Left Bound Calculation:

1. Iterate through the `heights` array from left to right.
2. For each bar `i`:
   - While the stack is not empty and the current height is less than or equal to the height at the top index of the stack, pop from the stack.
   - If the stack is empty after popping, set `left[i] = 0`, otherwise `left[i] = stack.peek() + 1`.
   - Push the current index `i` to the stack.

### Right Bound Calculation:

1. Clear the stack.
2. Iterate through the `heights` array from right to left.
3. For each bar `i`:
   - While the stack is not empty and the current height is less than or equal to the height at the top index of the stack, pop from the stack.
   - If the stack is empty after popping, set `right[i] = heights.length - 1`, otherwise `right[i] = stack.peek() - 1`.
   - Push the current index `i` to the stack.

### Area Calculation:

1. For each bar `i` in the `heights` array:
   - Calculate the width of the rectangle as `right[i] - left[i] + 1`.
   - Multiply it with the height `heights[i]` to get the area.
   - If this area is greater than `totalArea`, update `totalArea`.

### Return Output:

- Return `totalArea` as the largest rectangle area in the histogram.

  
## Test Cases Passed
- **74/74**

## Complexity
- **Time Complexity**:
<img width="482" alt="image" src="https://github.com/user-attachments/assets/04ad881d-674d-4b0c-aaf5-1020d6447dd4" />


- **Space Complexity**:
<img width="488" alt="image" src="https://github.com/user-attachments/assets/4eb97745-d614-4f35-a4bd-a5e415889eaf" />
