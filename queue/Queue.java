
package queue;

import java.util.*;
public class Queue
{   
    static int maxStorage=100;
	static int queueSize = 0;
    static int queue[] = new int[100];
	static int front=-1;
    static int rear=-1;
    public static void enqueue(int newElement)
    {
        if(rear>maxStorage) 
        	System.out.println("The queue is full");
        else {
            rear=rear+1;
            queueSize++;
            queue[rear]=newElement;
        }
    }
    public static int dequeue()
    {
        if(rear==front) 
        	System.out.println("The queue is empty");
        else{
            front=front+1;
             queueSize--;
	     return queue[front];
            }
        return -1;
    }

    public static int sizeOfQueue()
    {
        return queueSize;
    }

    public static void printQueue()
    {
    	if(queueSize == 0)
    		System.out.println("Queue is Empty !!");
    	
    	for(int i=front+1;i<=rear;i++) 
    	    System.out.print(queue[i] + " ");
    	System.out.println();
    }
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		boolean exitLoop = false;
                
        while(!exitLoop)
        {
        	System.out.println("Choose Option\n1.Insert in queue\n2.Delete from queue\n3.size of queue\n4.print queue elements\n5.Exit the session\n");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 :System.out.print("How many Element Do you want to insert : ");
                        int noOfElement = sc.nextInt();
                        while(noOfElement > 0) {
                            System.out.print("Enter Element to be insert : ");
                            int newEle = sc.nextInt();
                            enqueue(newEle);
                            noOfElement--;
                        }
                        break;
                case 2 :System.out.println("Popped Element : " + dequeue());
                        break;
                case 3 :System.out.println("Size of queue is : " + sizeOfQueue());
                        break;
                case 4 :printQueue();
                        break;
                case 5 :exitLoop = true;
                        break;
            }
		}
    }
}

