//Reverse a stack
import java.util.Stack;
public class stackReverse {
/*public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int temp=s.pop();
        pushAtBottom(s, data);
        s.push(temp);
    }
    public static void Reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        Reverse(s);
       // pushAtBottom(s, top);
    }*/
        
    public static void main(String[] args) {
        Stack <Integer> stack =new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
       
       // System.out.println(stack.pop());
        while(!stack.isEmpty()){
           System.out.println(stack.peek());
         // System.out.println(stack.pop());
           stack.pop();
        }
    }
}

