class Solution{
    private int[] left;
    private int[] right;
    private int totalArea = 0;
    Stack<Integer> stack = new Stack<>();
    public int largestRectangleArea(int[] heights){
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
}
