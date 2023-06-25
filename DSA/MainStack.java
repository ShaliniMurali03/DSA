public class Stack {
    private int maxSize;  // Maximum size of the stack
    private int top;      // Index of the top element
    private int[] stackArray; // Array to store the stack elements

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // Initialize top to -1 indicating an empty stack
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Method to add an element to the top of the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        stackArray[++top] = value;
        System.out.println(value + " pushed to the stack.");
    }

    // Method to remove and return the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        }
        int poppedValue = stackArray[top--];
        System.out.println(poppedValue + " popped from the stack.");
        return poppedValue;
    }

    // Method to get the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No top element.");
            return -1;
        }
        return stackArray[top];
    }

    // Method to display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}
public class MainStack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);  // Create a stack of size 5

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();  // Stack (top to bottom): 30 20 10

        stack.pop();  // 30 popped from the stack
        stack.display();  // Stack (top to bottom): 20 10

        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);  // Top element: 20

        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);  // Is stack empty? false
    }
}
