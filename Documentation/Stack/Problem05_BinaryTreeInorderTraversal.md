# Binary Tree Inorder Traversal

## Problem Link
Given the root of a binary tree, return the inorder traversal of its nodes' values.

**Example 1:**

      Input:  root = [1,null,2,3]
      Output: [1,3,2]
      Explanation:
  ![image](https://github.com/user-attachments/assets/801d4d71-5bbb-4641-90d2-ad543cf6c44f)


**Example 2:**

      Input:  root = [1,2,3,4,5,null,8,null,null,6,7,9]
      Output: [4,2,6,5,7,1,3,9,8]
      Explanation:
  ![image](https://github.com/user-attachments/assets/0077ad01-f175-43ae-b042-7fa45a5c3cd5)

**Example 3:**

      Input:  root = []
      Output: []

**Example 4:**

      Input:  root = [1]
      Output: [1]
      
**Constraints**
<pre>
  1. The number of nodes in the tree is in the range [0, 100].
  2. -100 <= Node.val <= 100
</pre>

[Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/description/?page=1&search=stack)

## Solution Explanation

### Initialization:

- A list `res` is created to store the result of the inorder traversal.

### Method `inorderTraversal(TreeNode root)`:

1. Calls the helper method `traverse(root)` to start the traversal from the root node.
2. Returns the list `res` after traversal is complete.

### Helper Method `traverse(TreeNode root)`:

1. If `root` is null, the function simply returns (base case for recursion).
2. Recursively traverses the left subtree by calling `traverse(root.left)`.
3. Adds the current node's value `root.val` to the `res` list.
4. Recursively traverses the right subtree by calling `traverse(root.right)`.

### Output:

- Returns the `res` list containing the values of the nodes visited in inorder (Left, Root, Right) sequence.
  
## Test Cases Passed
- **71/71**

## Complexity
- **Time Complexity**:
<img width="485" alt="image" src="https://github.com/user-attachments/assets/8bdd1f87-029d-495e-b5be-dfc78af2fd8c" />

- **Space Complexity**:
<img width="488" alt="image" src="https://github.com/user-attachments/assets/87ddd76c-06ab-4572-b313-254e4eb744c0" />
