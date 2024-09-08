package Queue_Codes;
//implementing circular
public class Queue1 {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor to initialize the queue
    public Queue1(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Add an element to the queue (enqueue)
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        queue[rear] = item;
        size++;
        System.out.println("Enqueued: " + item);
    }

    // Remove and return the front element from the queue (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return item;
    }

    // Return the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    // Return whether the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Return whether the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Return the size of the queue
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Queue1 q = new Queue1(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("Dequeued: " + q.dequeue());  // Outputs: Dequeued: 1
        System.out.println("Front of the queue: " + q.peek());  // Outputs: Front of the queue: 2
        System.out.println("Queue size: " + q.getSize());  // Outputs: 2
    }
}
