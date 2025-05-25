# Implement Queue using Stack

## Problem Link
Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:

1. void push(int x) Pushes element x to the back of the queue.
2. int pop() Removes the element from the front of the queue and returns it.
3. int peek() Returns the element at the front of the queue.
4. boolean empty() Returns true if the queue is empty, false otherwise.
   
Notes:

You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.


**Example 1:**

      Input:  ["MyQueue", "push", "push", "peek", "pop", "empty"]
              [[], [1], [2], [], [], []]
      Output: [null, null, null, 1, 1, false]
      Explanation:
              MyQueue myQueue = new MyQueue();
              myQueue.push(1); // queue is: [1]
              myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
              myQueue.peek(); // return 1
              myQueue.pop(); // return 1, queue is [2]
              myQueue.empty(); // return false

**Constraints**
<pre>
  1. 1 <= x <= 9
  2. At most 100 calls will be made to push, pop, peek, and empty.
  3. All the calls to pop and peek are valid.
</pre>

[Implement Queue using Stack](https://leetcode.com/problems/implement-queue-using-stacks/description/)

## Solution Explanation

### Initialization:

- `stack1` is used to store new elements pushed into the queue.
- `stack2` is used temporarily during pop and peek operations to reverse the order.

### Push Operation:

1. Directly push the element `x` onto `stack1`.
2. This maintains the order for future queue operations.

**Logic:** Add element directly to `stack1`.

### Pop Operation:

1. Transfer all elements from `stack1` to `stack2` **except** the last one.
2. Pop the remaining element from `stack1`, which is the front of the queue.
3. Move all elements back from `stack2` to `stack1`.

**Logic:** Access front of the queue by reversing order, pop it, then restore the order.

### Peek Operation:

1. Transfer all elements from `stack1` to `stack2` **except** the last one.
2. Peek the last remaining element in `stack1`, which is the front.
3. Move all elements back from `stack2` to `stack1`.

**Logic:** Same as `pop`, but do not remove the front element.

### Empty Operation:

1. Simply check if `stack1` is empty.

**Logic:** Queue is empty if `stack1` has no elements.
  
## Test Cases Passed
- **22/22**

## Complexity
- **Time Complexity**:
<img width="487" alt="image" src="https://github.com/user-attachments/assets/36e97325-3aeb-4dbc-8278-6e6dfa0ceac2" />

- **Space Complexity**:
<img width="482" alt="image" src="https://github.com/user-attachments/assets/824ce911-d2c4-4515-8fb1-3422a04c7a6d" />
