public class Queue {
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node front;  // Reference to the front of the queue
    private Node rear;   // Reference to the rear of the queue

    // Constructor to initialize the queue
    public Queue() {
        front = null;
        rear = null;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return (front == null);
    }

    // Method to enqueue (add) an element to the rear of the queue
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(value + " enqueued to the queue.");
    }

    // Method to dequeue (remove) the element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        }
        int dequeuedValue = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println(dequeuedValue + " dequeued from the queue.");
        return dequeuedValue;
    }

    // Method to get the front element of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No front element.");
            return -1;
        }
        return front.data;
    }

    // Method to display the elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue (front to rear): ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();  // Queue (front to rear): 10 20 30

        queue.dequeue();  // 10 dequeued from the queue
        queue.display();  // Queue (front to rear): 20 30

        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);  // Front element: 20

        boolean isEmpty = queue.isEmpty();
        System.out.println("Is queue empty? " + isEmpty);  // Is queue empty? false
    }
}
