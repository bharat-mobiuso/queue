import java.util.*;
public class queue
{   
    static int q[] = new int[100];
	static int q_size = 0;
	
    public static void enqueque(int newElement)
    {
        
    }
    public static void dequeue()
    {
        
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
		System.out.println("Choose Option\n1.Insert in queue\n2.Delete from queue\n3.size of queue\n4.print queue elements\n");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		    case 1: System.out.print("Enter Element to be insert : ");
		            int newEle = sc.nextInt();
		            enqueque(newEle);
		            break;
		    case 2: dequeue();
		            break;
		    case 3: System.out.println("Size of queue is " + size_of_queue());
		            break;
		    case 4: print_queue();
		            break;
		}
	}
}