# Longest Valid Parentheses

## Problem Link
Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.
**Example 1:**

      Input:  s = "(()"
      Output: 2
      Explanation: The longest valid parentheses substring is "()".

**Example 2:**

      Input:  s = ")()())"
      Output: 4

**Example 3:**

      Input:  s = ""
      Output: 0
      
**Constraints**
<pre>
  1. 1 <= s.length <= 3 * 10<sup>4</sup>
  2. s[i] is '(', or ')'.
</pre>

[Longest Valid Parentheses](https://leetcode.com/problems/longest-valid-parentheses/description/?page=1&search=stack)

## Solution Explanation

### Initialization:

- A `Stack<Integer>` named `stack` is initialized and seeded with `-1` to handle edge cases cleanly.
- A variable `maxLength` is initialized to 0 to store the length of the longest valid parentheses substring.

### Stack Traversal:

1. Iterate over each character of the string `s` using a for loop.
2. If the current character is `'('`, push its index onto the stack.
3. If the current character is `')'`, perform the following:
   - Pop the top index from the stack.
   - If the stack becomes empty after popping, push the current index onto the stack as a new base for future valid substring calculations.
   - Otherwise, calculate the length of the current valid substring using `i - stack.peek()` and update `maxLength` if it is larger than the current value.

### Return Output:

- After iterating through the entire string, return `maxLength` which contains the length of the longest valid parentheses substring.
  
## Test Cases Passed
- **231/231**

## Complexity
- **Time Complexity**:
<img width="485" alt="image" src="https://github.com/user-attachments/assets/687fa6c2-e56c-46d7-b5c0-93ccea9cb3fe" />

- **Space Complexity**:
<img width="482" alt="image" src="https://github.com/user-attachments/assets/836a64f9-1872-4a50-9164-a55969c275d3" />
