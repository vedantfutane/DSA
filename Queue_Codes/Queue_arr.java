package Queue_Codes;

public class Queue_arr{
    static int arr[];
    static int size;
    static int rear;

    Queue_arr(int n){
        arr=new int[n];
        size=n;
        rear=-1;
    }

    public static boolean isEmpty(){
        return rear == -1;
    }

    public static void add(int data){    //O(1)
        if(rear==size-1){  //full
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear]=data;
    }

    public static int remove(){          //O(n)  -- thats why we dont implement queue with array
        if(isEmpty()){                   // hence we use circular queue
            System.out.println("Empty Queue");
            return -1;
        }
        int front= arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    }

    public static int peek(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        return arr[0];
    }

    @SuppressWarnings("static-access")

    public static void main(String[] args) {
        
        Queue_arr q= new Queue_arr(3);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
