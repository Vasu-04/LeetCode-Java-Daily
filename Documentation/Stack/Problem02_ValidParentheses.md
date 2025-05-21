# Valid Parentheses

## Problem Link
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

**Example 1:**

      Input:  s = "()"
      Output: true

**Example 2:**

      Input:  s = "()[]{}"
      Output: true

**Example 3:**

      Input:  s = "(]"
      Output: false

**Example 4:**

      Input:  s = "([])"
      Output: true
      
**Constraints**
<pre>
  1. 1 <= s.length <= 10<sup>4</sup>
  2. s consists of parentheses only '()[]{}'.
</pre>

[Valid Parentheses](https://leetcode.com/problems/valid-parentheses/description/?page=1&search=stack)

## Solution Explanation

### Initialization:

- An array of open brackets (`openBrackets`) and closed brackets (`closedBrackets`) is defined.
- A dynamic `ArrayList` named `stack` is used to simulate stack behavior.
- The variable `top` is initialized to -1 to indicate the stack's top position.

### Stack Operations:

- The `push` method adds a character to the top of the stack.
- The `pop` method removes the top character from the stack.
- The `peek` method returns the character at the top without removing it.

### Validity Check:

1. Iterate over each character in the string `s`.
2. If the character is an open bracket, push it onto the stack.
3. If the character is a closed bracket:
   - Find its corresponding open bracket index.
   - If the stack is not empty and the top of the stack matches the corresponding open bracket, pop it.
   - Otherwise, return `false` immediately as the brackets are not balanced.

### Return Output:

- After the loop, if the stack is empty (`top == -1`), return `true`, indicating all brackets matched.
- If the stack still has elements, return `false`, indicating invalid bracket structure.
  
## Test Cases Passed
- **100/100**

## Complexity
- **Time Complexity**:
<img width="485" alt="image" src="https://github.com/user-attachments/assets/3b5dbda8-9c21-4684-b8d7-ca0d38c79dd4" />

- **Space Complexity**:
<img width="488" alt="image" src="https://github.com/user-attachments/assets/24c54ac3-50fd-4989-b2c6-565cff434cfd" />
