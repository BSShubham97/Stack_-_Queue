public class StackAndQueueBuilder {
    Node top = null;
    Node front=null;
    Node back=null;

    /**
     * To add data into the stack
     * @param data The data to be entered into the stack
     */
    public void push(int data) {
        Node temp = new Node(data);
        if (top == null) {
            this.top = temp;

        } else {

            temp.next = top;
            top = temp;
        }
    }

    /**
     * To display all the data
     */
    public void display(){
       Node temp=top;
        if(top==null){
           System.out.println("Stack Empty");
       } else{
            System.out.println("All elements of Stack: " );
           while(temp!=null){
               System.out.println(temp.data);
               temp=temp.next;
           }
       }System.out.println();
    }

public void peek() {
    if (top == null) {
        System.out.println("EMPTY LINKEDLIST");
    } else {
        System.out.println("Top Most Element: "+top.data+"\n");

    }
}

    public void pop() {

        if (top == null) {
            System.out.println("EMPTY STACK");
        } else {
        top=top.next;


        }
    }

    public void enqueue(int data ){
            Node temp = new Node(data);
            if (this.back== null) {
                this.front = temp;
                this.back = temp;

            } else {
               this.back.next=temp;
               this.back=temp;
                }

            }
    public void dequeue() {
        if (this.front == null) {
            System.out.println("Empty Queue");
        } else {
            Node temp = this.front;
            this.front = this.front.next;
            if (this.front == null)
                this.back = null;
        }
    }

    public void displayQ(){
        Node temp=front;
        if(front==null){
            System.out.println("Stack Empty");
        } else{
            System.out.println("All elements of Queue " );
            while(temp!=null){
                System.out.print(temp.data+"\t");
                temp=temp.next;
            }
        }System.out.println();
    }


}



