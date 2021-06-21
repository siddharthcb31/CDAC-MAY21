class ListPractice
{
	Node head;

static class Node 
	{
		int data;
		Node next;
	
	Node(int d)
	 {
		data=d;
		next= null;
	 } 
    }
    public void display()
     {
     	Node n = head;
     	while(n!=null)
     	{
     		System.out.println(n.data);
     		n=n.next;
     	}
     }
 public void insert(int new_data)
 {
 	Node new_node = new Node(new_data);
 	new_node.next=head;
 	head=new_node;
 }

public void insertAfter(Node prev_node,int new_data)
{
	if(prev_node==null)
	{
		System.out.println("cant be null");
	}

	Node new_node = new Node(new_data);

	new_node.next = prev_node.next;
    prev_node.next = new_node; 
}

public void append(int new_data)
{
	Node new_node= new Node(new_data);
	if (head==null)
	{
		head=new Node(new_data);
		return;
	}

     new_node.next=null;
     Node temp = head;
     while(temp.next!=null)
        temp=temp.next;
     	temp.next=new_node;
     	return;
     }

public void delete(int key)
{
	if (head.data==key) 
	{
	head=head.next;
	}
	else
	{
		Node temp=head;
		while(temp.next!= null)
		{
			if(temp.next.data==key)
		{
			temp.next=temp.next.next;
		}
		
		temp=temp.next;
	    }
    }
}



public static void main(String []args)
{
	ListPractice l1 = new ListPractice();
	l1.head = new Node(10);
	Node second = new Node(20);
	Node third = new Node(30);
 l1.head.next=second;
 second.next=third;
//l1.display();

l1.insert(50);
l1.insert(60);
//l1.display();

l1.insertAfter(l1.head,70);
//l1.insertAfter(l1.head.next,80);
//l1.display();
//l1.append(90);
l1.append(100);
l1.display();

l1.delete(50);
l1.display();
}
}

















