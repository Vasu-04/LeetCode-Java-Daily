# Flatten Nested List Iterator

## Problem Link
ou are given a nested list of integers nestedList. Each element is either an integer or a list whose elements may also be integers or other lists. Implement an iterator to flatten it.

Implement the NestedIterator class:
1. NestedIterator(List<NestedInteger> nestedList) Initializes the iterator with the nested list nestedList.
2. int next() Returns the next integer in the nested list.
3. boolean hasNext() Returns true if there are still some integers in the nested list and false otherwise.
   
Your code will be tested with the following pseudocode:
    
    initialize iterator with nestedList
    res = []
    while iterator.hasNext()
        append iterator.next() to the end of res
    return res
If res matches the expected flattened list, then your code will be judged as correct.

**Example 1:**

      Input:  nestedList = [[1,1],2,[1,1]]
      Output: [1,1,2,1,1]
      Explanation: By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].

**Example 2:**

      Input:  nestedList = [1,[4,[6]]]
      Output: [1,4,6]
      Explanation: By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,4,6].

**Constraints**
<pre>
  1. 1 <= nestedList.length <= 500
  2. The values of the integers in the nested list is in the range [-10<sup>6</sup>, 10<sup>6</sup>].
</pre>

[Flatten Nested List Iterator](https://leetcode.com/problems/flatten-nested-list-iterator/?page=1&search=stack)

## Solution Explanation

### Initialization:

- A **stack** is used to manage the current traversal state of the nested list.
- The input list is pushed **in reverse order** so that iteration occurs in the correct sequence.

---

### Constructor Logic:

1. The input list may contain either integers or other nested lists.
2. All elements are pushed onto the stack from **end to start**.

**Goal:** Set up the stack to simulate a flattened view using **lazy evaluation**.

---

### hasNext() Operation:

1. Inspect the top of the stack:  
   - If it’s an **integer**, return `true`.  
   - If it’s a **list**, pop it and push its contents (in reverse) onto the stack.  
2. Continue until an integer is found or the stack is empty.

**Purpose:** Make sure the next element returned by `next()` is an integer.

---

### next() Operation:

1. Assumes `hasNext()` has confirmed an integer at the top.  
2. Pops and returns that integer.

**Goal:** Return the next flattened integer from the nested structure.

## Test Cases Passed
- **43/43**

## Complexity
- **Time Complexity**:
<img width="485" alt="image" src="https://github.com/user-attachments/assets/97433de6-1832-4a03-aacc-1db3812a9fbe" />

- **Space Complexity**:
<img width="490" alt="image" src="https://github.com/user-attachments/assets/4f2159ac-b3c6-4ed7-bf54-8da5bcdbf01e" />
