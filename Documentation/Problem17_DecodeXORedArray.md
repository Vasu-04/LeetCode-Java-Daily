# Decode XORed Array

## Problem Link
There is a hidden integer array arr that consists of n non-negative integers.

It was encoded into another integer array encoded of length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].

You are given the encoded array. You are also given an integer first, that is the first element of arr, i.e. arr[0].

Return the original array arr. It can be proved that the answer exists and is unique.

**Example 1:**
      Input: encoded = [1,2,3], first = 1
      Output: [1,0,2,1]
      Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]

**Example 2:**
      Input: encoded = [6,2,7,3], first = 4
      Output: [4,2,0,7,4]
            
**Constraints**
<pre>
  1. 2 <= n <= 10<sup>4</sup>
  2. encoded.length == n - 1
  3. 0 <= encoded[i] <= 10<sup>5</sup>
  4. 0 <= first <= 10<sup>5</sup>
</pre>

[Decode XORed Array](https://leetcode.com/problems/decode-xored-array/)

## Solution Explanation

### Initialization:

Two variables are used:
- `A` represents the encoded array.
- `first` is the first element of the original array.

An array `res` of size `n + 1` is created to store the decoded values.

### Decoding Process:

1. The first element of `res` is set to `first` since it remains unchanged.
2. A `for` loop iterates over the encoded array `A`.
3. Each element of `res` is computed using the XOR operation: `res[i + 1] = res[i] ^ A[i]`.
4. This step reconstructs the original array using the properties of XOR.

### Return Output:

- The function returns the fully decoded array `res`.

## Test Cases Passed
- **76/76**

## Complexity
- **Time Complexity**: O(N)
<img width="485" alt="image" src="https://github.com/user-attachments/assets/bbd08f2e-3ae7-4528-b1d9-41b9e3992074" />

- **Space Complexity**: O(N)
<img width="485" alt="image" src="https://github.com/user-attachments/assets/8f70c723-445e-4abb-ac47-b48f221f1ace" />
