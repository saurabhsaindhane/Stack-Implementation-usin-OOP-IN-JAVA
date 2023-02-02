import java.util.*;
class MinStack {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public MinStack() {

    }

    public void push(int val) {
   s.push(val);
    }

    public void pop() {
s.pop();
    }

    public int top() {
return s.peek();
    }

    public int getMin() {
   for(Integer i:s){
       s2.add(i);
   }
   Collections.sort(s2);
   return s2.get(0);
    }
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(9);
        obj.push(10);
        obj.push(11);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();
    }

}

