import java.util.*;

static class Stack1{

	public int S[];
	public int size;
	public int top;

    public Stack1(int s){  
    	size = s;
    	S = new int[size];
    	top =-1;
    }
    public void push(int j)
   {
   	  S[++top] = j; //top is -1 default
   }

   public int pop(){

   	return S[top--];
   }

    public int peak(){

     return S[top];
    }

    public boolean isEmpty(){
         return (top == -1); // condition for underflow
    }

    public boolean isFull(){
          return (top == size-1); // cheack the overflow
    }

    public void display(){

        for(int i = 0; i<size;i++)
        	System.out.println(S[i]);

    }

}

 class stackA{
	public static void main(String []args){
           
          Stack1 s1 = new Stack1(5);
          s1.push(10);
           s1.push(23);
          s1.push(132);
          s1.display();  
         s1.pop();
         s1.pop();

          s1.display();  
	}

}


