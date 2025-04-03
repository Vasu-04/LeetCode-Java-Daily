import java.util.ArrayList;
import java.util.List;

class MinStack {
    private List<Integer> stack = new ArrayList<>();
    private int top;
    private int minimum;
    public MinStack() {
        top = -1;
    }
    public void push(int val) {
        stack.add(++top,val);
            
    }
    public void pop() {
        stack.remove(top--);
    }
    public int top() {
        return stack.get(top);
    }
    public int getMin() {
        minimum = stack.get(0);
        for(int i=1;i<=top;i++){
            if(minimum > stack.get(i))
                minimum = stack.get(i);
        }
        return minimum;
    }
}
