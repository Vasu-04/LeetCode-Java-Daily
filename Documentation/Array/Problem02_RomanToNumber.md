# Roman to Integer

## Problem Link
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 
**Example 1:**

      Input: s = "III"
      Output: 3
      Explanation: III = 3.
**Example 2:**

      Input: s = "LVIII"
      Output: 58
      Explanation: L = 50, V= 5, III = 3.

**Example 3:**

      Input: s = "MCMXCIV"
      Output: 1994
      Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

[Roman to Integer](https://leetcode.com/problems/roman-to-integer/)

## Solution Explanation
### Arrays for Roman Numeral Values:

1. The value array contains the integer values for each Roman numeral in the corresponding symbol array (e.g., 'I' is 1, 'V' is 5, 'X' is 10, and so on).
2. These arrays are used to convert Roman numeral characters into their respective integer values.

### Helper Function (getIndex):

1. The getIndex method takes a Roman numeral character and returns its index in the symbol array. This index is used to access the corresponding value in the value array.
   
### Main Function (romanToInt):

1. **Looping Through the String:**
   - The loop iterates through the string s from left to right, comparing each character and the next character (i and i+1).
     
2. **Handling Special Subtraction Cases:**
   - Special subtraction cases (e.g., 'IV', 'IX', 'XL', 'XC', 'CD', 'CM') are handled by checking if the current character is 'I', 'X', or 'C', and then checking if the next character corresponds to a larger Roman numeral. If so, the difference is added to sum, and i is incremented to skip the next character.
   - For example, if the input is "IX" (which represents 9), the program calculates X - I = 10 - 1 = 9 and increments i by 2, skipping over the 'X'.
     
3. **Adding the Regular Values:**
   - If no subtraction is required (i.e., the next character is not larger than the current one), the corresponding value of the current Roman numeral is added to sum (e.g., 'V' adds 5, 'L' adds 50).
     
4. **Final Character:**
   - After the loop, if i reaches the second-to-last character, the final character's value is added to sum in the if statement after the loop.

## Test Cases Passed
- **34/34**

## Complexity
- **Time Complexity**: O(n)
  
  <img width="506" alt="image" src="https://github.com/user-attachments/assets/9143c898-0947-47aa-aac0-b8f2fdc68146">


- **Space Complexity**: O(1)
  
  <img width="506" alt="image" src="https://github.com/user-attachments/assets/f059e256-5d6a-46ec-9764-7c66c6e0d3e6">




