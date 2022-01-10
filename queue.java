
package mobiuso_project;

import java.util.*;
public class Mobiuso_project
{   
    static int maxStorage=100;
	static int q_size = 0;
    static int q[] = new int[100];
	static int front=-1;
    static int rear=-1;
    public static void enqueue(int newElement)
    {
        if(rear>maxStorage) 
        	System.out.println("The queue is full");
        else {
            rear=rear+1;
            q_size++;
            q[rear]=newElement;
        }
    }
    public static int dequeue()
    {
        if(rear==front) 
        	System.out.println("The queue is empty");
        else{
            front=front+1;
            return q[front];
            q_size--;
            }
        return -1;
    }
    public static int size_of_queue()
    {
        return q_size;
    }
    public static void print_queue()
    {
    	if(!q_size)
    		System.out.println("Queue is Empty !!");
    	else
        	for(int i=0;i<q_size;i++)
        		System.out.println(q[i] + " ");
    }
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		String exitCommand="";
                
        while(exitCommand!="exit")
        {
        	System.out.println("Choose Option\n1.Insert in queue\n2.Delete from queue\n3.size of queue\n4.print queue elements\n5.Exit the session\n");
            int choice = sc.nextInt();
		
			switch(choice)
			{
			    case 1: System.out.print("Enter Element to be insert : ");
			            int newEle = sc.nextInt();
			            enqueue(newEle);
			            break;
			    case 2: dequeue();
			            break;
			    case 3: System.out.println("Size of queue is " + size_of_queue());
			            break;
			    case 4: print_queue();
			            break;
	            case 5: exitCommand="exit";
	                    break;
			}
		}
    }
}

