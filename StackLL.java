public class StackLL { 
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    static class InnerStackLL {
        public static Node head=null;
        public static void push(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static boolean isEmpty(){
            return head==null;
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack underflow! (empty)");
                return -1;
            }
            Node top=head;
            head=head.next;
            return top.data;

        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            Node top=head;
            return top.data;
        }
        public static void display(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return;
            }
            Node temp=head;
            System.out.println("stack:");
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;      
            }
            System.out.println();
        } 
    }
    public static void main(String[] args) {
       
        InnerStackLL.push(1);
        InnerStackLL.push(2);
        InnerStackLL.push(3);
        InnerStackLL.push(4);
        
        InnerStackLL.display();

        System.out.println("peak:"+InnerStackLL.peek());
        System.out.println("popped:"+InnerStackLL.pop());

        InnerStackLL.display();
    }
}

