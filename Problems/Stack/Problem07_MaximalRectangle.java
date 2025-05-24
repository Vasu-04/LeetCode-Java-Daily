import java.util.Arrays;
import java.util.Collections;

class Solution {
    private int[] left;
    private int[] right;
    private int totalArea = 0;
    Stack<Integer> stack = new Stack<>();
    public int largestRectangleArea(int[] heights){
        stack.clear();
        totalArea = 0;
        left = new int[heights.length];
        right = new int[heights.length];
        for(int i=0;i< heights.length;i++){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                stack.pop();
            if(stack.isEmpty()) left[i] = 0;
            else left[i] = stack.peek()+1;
            stack.push(i);
        }
        stack.clear();
        for(int i= heights.length-1;i>=0;i--){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                stack.pop();
            if(stack.isEmpty()) right[i] = heights.length-1;
            else right[i] = stack.peek()-1;
            stack.push(i);
        }
        for(int i=0;i< heights.length;i++){
            if((right[i]-left[i]+1)*heights[i] > totalArea)
                totalArea = (right[i]-left[i]+1)*heights[i];
        }
        return totalArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] result = new int[rows];
        int[] tempArr = new int[cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                tempArr[j] = (matrix[i][j] == '1') ? tempArr[j] + 1 : 0;
            }
            result[i] = largestRectangleArea(tempArr);
        }
        return Arrays.stream(result).max().getAsInt();
    }
}
