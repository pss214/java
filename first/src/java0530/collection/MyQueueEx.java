package java0530.collection;

public class MyQueueEx {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue("A");
        myQueue.enqueue("B");
        myQueue.enqueue("C");

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());

    }
}
