# Reorder List

## Problem Link
You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

**Example 1:**

      Input:  head = [1,2,3,4]
      Output: [1,4,2,3]
      Explanation:
  ![image](https://github.com/user-attachments/assets/1d5c2a78-b929-4265-ab30-cc0d4d8ebe6f)


**Example 2:**

      Input:  head = [1,2,3,4,5]
      Output: [1,5,2,4,3]
      Explanation:
  ![image](https://github.com/user-attachments/assets/22299f5b-b1ab-4ba1-b4ec-318e523f6371)
      
**Constraints**
<pre>
  1. The number of nodes in the list is in the range [1, 5 * 10<sup>4</sup>].
  2. 1 <= Node.val <= 1000
</pre>

[Reorder List](https://leetcode.com/problems/reorder-list/?page=1&search=stack)

## Solution Explanation

### **Step 1: Handle Base Cases**
- If the list is empty or contains only one element, no reordering is needed.
- Exit the algorithm early in such cases.

---

### **Step 2: Find the Middle of the Linked List**
- Use two pointers:
  - `slow` moves one step at a time.
  - `fast` moves two steps at a time.
- Continue moving both pointers until `fast` reaches the end or just before the end.
- At this point, `slow` will point to the middle node of the list.

---

### **Step 3: Reverse the Second Half of the List**
- Start from the node immediately after the middle.
- Reverse the direction of links between nodes so that the last node becomes the new head of this half.
- The reversed second half will now be in reverse order compared to the original list.
- Disconnect the first half and second half to avoid cycles.

---

### **Step 4: Merge the Two Halves Alternately**
- Initialize two pointers: one at the start of the first half, and the other at the start of the reversed second half.
- Alternately link nodes from the first and second halves.
  - Take one node from the first half.
  - Followed by one node from the second half.
  - Repeat this process until all nodes from the second half are used up.
- This will form the reordered list in the required `L₀ → Lₙ → L₁ → Lₙ₋₁ ...` pattern.

## Test Cases Passed
- **12/12**

## Complexity
- **Time Complexity**:
<img width="492" alt="image" src="https://github.com/user-attachments/assets/2992ffb0-2cb5-4194-ad1b-d2566b96905b" />

- **Space Complexity**:
<img width="486" alt="image" src="https://github.com/user-attachments/assets/efe2d978-7839-446a-adba-868f4e42267b" />
