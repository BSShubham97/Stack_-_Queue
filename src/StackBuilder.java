public class StackBuilder {
    Node top = null;

    /**
     * To add data into the stack
     * @param data The data to be entered into the stack
     */
    public void push(int data) {
        Node temp = new Node(data);
        if (top == null) {
            this.top = temp;

        } else {

            temp.next =top;
            top=temp;
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
           while(temp!=null){
               System.out.println(temp.data);
               temp=temp.next;
           }
       }
    }




}