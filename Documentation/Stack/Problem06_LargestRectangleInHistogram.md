# Largest Rectangle in Histogram

## Problem Link
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

**Example 1:**

      Input:  heights = [2,1,5,6,2,3]
      Output: 10
      Explanation:
      The above is a histogram where width of each bar is 1.
      The largest rectangle is shown in the red area, which has an area = 10 units.
  ![image](https://github.com/user-attachments/assets/c584d9ce-eb0e-4c36-b52f-c25c8b13f1d1)



**Example 2:**

      Input:  heights = [2,4]
      Output: 4
      Explanation:
  ![image](https://github.com/user-attachments/assets/ccd37ec3-5037-48d3-b31e-7364506afcf5)
      
**Constraints**
<pre>
  1. 1 <= heights.length <= 10<sup>5</sup>
  2. 0 <= heights[i] <= 10<sup>4</sup>

[Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/description/)

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
- **99/99**

## Complexity
- **Time Complexity**:
<img width="482" alt="image" src="https://github.com/user-attachments/assets/fe9db703-9f24-442f-8642-8977057ecfe4" />

- **Space Complexity**:
<img width="485" alt="image" src="https://github.com/user-attachments/assets/08a2b85c-1861-44c3-ab1b-4e1816411411" />
