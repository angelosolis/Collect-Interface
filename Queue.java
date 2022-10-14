public class Queue implements Collect
    {
     private int front, rear, capacity;
     private int queue[];
 
    public Queue(int c)
    {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

     public void enqueue(int x)
    {
        if (capacity == rear) {
            return;
        }
 
        else {
            queue[rear] = x;
            rear++;
        }

    }
 
    public void dequeue()
    {
    
        if (front == rear) 
        {
            return;
        }

        else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
 
            if (rear < capacity)
                queue[rear] = 0;
            rear--;
        }
    }
 

    public void print()
    {
        int i;
        if (front == rear) {
            System.out.printf(" N/A");
        }

       
        for (i = front; i < rear; i++) {
            System.out.printf(" %d", queue[i]);
        }
    }
 

    public int getFront()
    {
        return queue[front];
    }

        public int getRear()
    {
        return queue[rear-1];
    }
}