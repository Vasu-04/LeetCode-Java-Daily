# Trapping Rain Water

## Problem Link
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

**Example 1:**
      ![image](https://github.com/user-attachments/assets/1567f601-e601-4009-92ff-65d458ca26e5)
      
      Input:  height = [0,1,0,2,1,0,1,3,2,1,2,1]
      Output: 6
      Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

**Example 2:**

      Input:  height = [4,2,0,3,2,5]
      Output: 9
      
**Constraints**
<pre>
  1. n == height.length
  2. 1 <= n <= 2 * 10<sup>4</sup>
  3. 0 <= height[i] <= 10<sup>5</sup>
</pre>

[Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/?page=1&search=stack)

## Solution Explanation

### Initialization:

- An integer variable `totalWater` is initialized to 0 to store the total amount of trapped water.
- A `Stack<Integer>` named `stack` is used to keep track of the indices of the bars.

### Main Loop Traversal:

1. Iterate over the `height` array using a for loop with index `i` from 0 to `n - 1`.
2. For each bar at index `i`, while the stack is not empty and the current height is greater than the height at the top of the stack:
   - Pop the top element from the stack and store it as `top`. This represents the height of the bottom of the container.
   - If the stack becomes empty after popping, break out of the loop.
   - Calculate the distance between the current index `i` and the new top of the stack using `i - stack.peek() - 1`.
   - Compute the bounded height as the minimum of `height[i]` and `height[stack.peek()]` minus `height[top]`.
   - Add the product of distance and bounded height to `totalWater`.
3. Push the current index `i` onto the stack.

### Return Output:

- After the loop completes, return `totalWater` which contains the total amount of water trapped between the bars.
  
## Test Cases Passed
- **324/324**

## Complexity
- **Time Complexity**:
<img width="491" alt="image" src="https://github.com/user-attachments/assets/1207ec64-a68d-4f0d-8438-e8ab7c4e330e" />

- **Space Complexity**:
<img width="488" alt="image" src="https://github.com/user-attachments/assets/2eb0e262-1051-44bb-8913-f3eb06c79a7f" />
