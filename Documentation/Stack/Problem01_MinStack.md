# Min Stack

## Problem Link
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

1. MinStack() initializes the stack object.
2. void push(int val) pushes the element val onto the stack.
3. void pop() removes the element on the top of the stack.
4. int top() gets the top element of the stack.
5. int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.

**Example 1:**

      Input:  ["MinStack","push","push","push","getMin","pop","top","getMin"]
              [[],[-2],[0],[-3],[],[],[],[]]
      Output: [null,null,null,null,-3,null,0,-2]
      
      Explanation: 
      MinStack minStack = new MinStack();
      minStack.push(-2);
      minStack.push(0);
      minStack.push(-3);
      minStack.getMin(); // return -3
      minStack.pop();
      minStack.top();    // return 0
      minStack.getMin(); // return -2

**Constraints**
<pre>
  1. -2<sup>31</sup> <= val <= 2<sup>31</sup> - 1
  2. Methods pop, top and getMin operations will always be called on non-empty stacks.
  3. At most 3 * 10<sup>4</sup> calls will be made to push, pop, top, and getMin.
</pre>

[Min Stack](https://leetcode.com/problems/min-stack/description/)

## Solution Explanation

### Initialization:

A custom stack is implemented using an `ArrayList`.
- `stack`: Stores the elements.
- `top`: Tracks the top index of the stack.
- `minimum`: Holds the minimum value in the stack.

### Stack Operations:

1. **Push (`push`)**:
   - Adds `val` to the top of the stack.
   - Increments `top`.

2. **Pop (`pop`)**:
   - Removes the top element from the stack.
   - Decrements `top`.

3. **Retrieve Top (`top`)**:
   - Returns the element at the top of the stack.

4. **Get Minimum (`getMin`)**:
   - Iterates through the stack to find the minimum value.
   - Returns the minimum element.

### Return Output:

- Implements a stack with standard operations and a `getMin` method.
  
## Test Cases Passed
- **31/31**

## Complexity
- **Time Complexity**: 
<img width="482" alt="image" src="https://github.com/user-attachments/assets/9c415340-b869-471b-bbc0-54d3c8f7e399" />

- **Space Complexity**:
<img width="485" alt="image" src="https://github.com/user-attachments/assets/6455d2fd-9774-4f01-95e9-90db13431c7a" />
