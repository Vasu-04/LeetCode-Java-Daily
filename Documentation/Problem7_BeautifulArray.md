# Beautiful Array

## Problem Link
An array nums of length n is beautiful if:
  1. nums is a permutation of the integers in the range [1, n].
  2. For every 0 <= i < j < n, there is no index k with i < k < j where 2 * nums[k] == nums[i] + nums[j].
Given the integer n, return any beautiful array nums of length n. There will be at least one valid answer for the given n.

**Example 1:**

      Input: n = 4
      
      Output: [2,1,4,3]

**Example 2:**

      Input: n = 5
      
      Output: [3,1,2,5,4]
   
**Constraints**
<pre>
1 <= n <= 1000
</pre>


[Beautiful Array](https://leetcode.com/problems/beautiful-array/)

## Solution Explanation

### **Initialization**
1. **Input Parameters**:
   - `n`: The size of the array to generate.

2. **Goal**:
   - Generate an array `nums` of size `n` such that the "beautiful array" property is satisfied.

3. **Data Structures**:
   - `arr`: Stores the initial array of integers from `1` to `n`.
   - `finalTemp`: Stores the resulting beautiful array.
   - `g`: A pointer to track the index for storing elements in `finalTemp`.

---

### **Recursive Function**
The core of the solution is a divide-and-conquer approach implemented in the `recursiveFunction`.

1. **Base Case**:
   - If the length of the current array is `1`, add the single element to the `finalTemp` array.

2. **Divide Step**:
   - Split the current array into two smaller arrays:
     - `oddTemp`: Contains elements at odd indices.
     - `evenTemp`: Contains elements at even indices.

3. **Recursive Calls**:
   - Recursively process `oddTemp` and then `evenTemp` to ensure the "beautiful array" property is preserved.

4. **Combine Step**:
   - The function processes `oddTemp` first, followed by `evenTemp`, maintaining the desired order.

---

### **Construction of the Array**
1. Generate the initial array `arr` with values from `1` to `n`.
2. Call `recursiveFunction` on `arr`.
3. Return `finalTemp` as the result.


## Test Cases Passed
- **38/38**

## Complexity
- **Time Complexity**: O(n)
<img width="485" alt="image" src="https://github.com/user-attachments/assets/78f229b5-eb1d-455e-bc89-8e5eed70ad31" />


- **Space Complexity**: O(n)
<img width="488" alt="image" src="https://github.com/user-attachments/assets/44047106-2dc6-4313-93dc-fcfd47fb99fd" />
