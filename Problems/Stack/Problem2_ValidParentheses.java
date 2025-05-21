import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    private Character[] openBrackets = {'{','(','['};
    private Character[] closedBrackets = {'}',')',']'};
    private int top;
    private ArrayList<Character> stack = new ArrayList<>();
    public Solution(){
        top = -1;
    }
    private void push(char inp){
        stack.add(++top,inp);
    }
    private void pop(){
        stack.remove(top--);
    }
    private char peek(){
        return stack.get(top);
    }
    public boolean isValid(String s) {
        for(int i=0;i<s.length();i++){
            char input = s.charAt(i);
            if(Arrays.asList(openBrackets).contains(input))
                push(input);
            else{
                int inpIndex = Arrays.asList(closedBrackets).indexOf(input);
                if(top!=-1 && stack.get(top) == openBrackets[inpIndex])
                    pop();
                else
                    return false;
            }
        }
        if(top==-1)
            return true;
        else
            return false;
    }
}
