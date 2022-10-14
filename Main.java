import java.util.*;
public class Main
    {
        public static void main(String[] args)
    {
        int j = 0;
        int count = 0;
        int capacitiess = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of operations: ");
        int size = scan.nextInt();
        System.out.print("Operation #1: ");
        int sizeadd = scan.nextInt();
        System.out.print("Enter the capacity: ");
        capacitiess = scan.nextInt();
        System.out.println("Queue created of size " + capacitiess);
        System.out.println("");
        Queue q = new Queue(capacitiess);
        for(int i = 1; i < size; i++)
            {
                System.out.printf("Operation #%d: ", i+1);
                int choice = scan.nextInt();
                if(choice == 2)
                {
                     if(count != capacitiess)
                     count++;
                     System.out.print("Enter the item to be enqueued: ");
                     int item = scan.nextInt();
                      q.enqueue(item);
                     System.out.print("Items in queue:");
                    q.print();
                   System.out.printf(" (size = %d)\n",count);
                      System.out.println("");
                }
                    
                else if(choice == 3)
                {
                    if(count != 0)
                    count--;
                    q.dequeue();
                    System.out.print("Items in queue:");
                    q.print();
                    System.out.printf(" (size = %d)\n",count);
                    System.out.println("");
                }

                else if(choice == 4)
                { 
                   System.out.printf("Front: %d\n\n", q.getFront());

                }

                else if(choice == 5)
                {
                    System.out.printf("Rear: %d\n\n",q.getRear());
                }
                            
            }
    } 
        
    }