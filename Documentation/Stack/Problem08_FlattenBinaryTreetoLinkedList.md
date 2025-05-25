# Flatten Binary Tree into Linked List

## Problem Link
Given the root of a binary tree, flatten the tree into a "linked list":

The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
The "linked list" should be in the same order as a pre-order traversal of the binary tree.

**Example 1:**

      Input:  root = [1,2,5,3,4,null,6]
      Output: [1,null,2,null,3,null,4,null,5,null,6]
      Explanation:
  ![image](https://github.com/user-attachments/assets/b75727a1-5d77-4448-ad6f-fb62e7d78408)


**Example 2:**

      Input:  root = []
      Output: []

**Example 3:**

      Input:  root = [0]
      Output: [0]
      
**Constraints**
<pre>
  1. The number of nodes in the tree is in the range [0, 2000].
  2. -100 <= Node.val <= 100
</pre>

[Flatten Binary Tree into Linked List](https://leetcode.com/problems/flatten-binary-tree-to-linked-list/)

## Solution Explanation

### Initialization:

- `arr`: An array list to store the nodes of the tree during preorder traversal.

### Preorder Traversal:

1. If the current `root` is `null`, return immediately.
2. Add the current `root` node to the list `arr`.
3. Recursively traverse the left subtree.
4. Recursively traverse the right subtree.

**Logic:** Collect all nodes in preorder (node → left → right).

### Flatten Operation:

1. Call `preorder(root)` to fill the list `arr` with the nodes in preorder sequence.
2. Iterate over `arr` from index `0` to `size-2`:
   - Set the `left` pointer of the current node to `null`.
   - Set the `right` pointer to the next node in the list.

**Logic:** Restructure the tree to a linked list in-place using the collected preorder nodes.

### Result:

The binary tree is modified such that all nodes follow a single rightward path, mimicking a preorder traversal sequence.

## Test Cases Passed
- **225/225**

## Complexity
- **Time Complexity**:
<img width="490" alt="image" src="https://github.com/user-attachments/assets/99c30d58-0e73-4f2e-8868-67f959803356" />

- **Space Complexity**:
<img width="487" alt="image" src="https://github.com/user-attachments/assets/f55089ce-38e7-4c53-a7e0-f4ab20156b6d" />
