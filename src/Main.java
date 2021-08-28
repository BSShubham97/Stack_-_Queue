public class Main {
    public static void main(String[] args) {


        StackAndQueueBuilder queueBuilder = new StackAndQueueBuilder();
        queueBuilder.enqueue(56);
        queueBuilder.enqueue(30);
        queueBuilder.enqueue(70);
        queueBuilder.displayQ();
        queueBuilder.dequeue();
        queueBuilder.displayQ();
    }

}
