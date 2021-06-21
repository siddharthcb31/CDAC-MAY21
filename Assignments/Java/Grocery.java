import java.util.*;

class Grocery{
	private String date;
	private String itemname;
	private double quantity;
	private double price;
	private double total;

    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){
        return this.date;
    }
    public void setitemname(String itemname){
        this.itemname = itemname;
    }
    public String getitemname(){
        return this.itemname;
    }
    public void setQuantity(double quantity){
        this.quantity = quantity;
    }
    public double getQuantity(){
        return this.quantity;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double  getPrice(){
        return this.price;
    }
    public void setTotal(double total){
        this.total = total;
    }
    public double  getTotal(){
        return this.total;
    }
}

///////////////////////////////////////////////////////////
public class Grocery1 {
	private static int count = 0;
    public static Grocery[] g = new Grocery[100];
    private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	    boolean check = true;
	    while(check) {
	    	
	    	System.out.println("Enter 1 : to add the item");
	    	System.out.println("Enter 2 : to watch item ");
	    	System.out.println("Enter 3 : Remove Item in cart: ");
	    	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    	System.out.println("Enter your choice");
	    	int choice = sc.nextInt();
	    	
	    	switch (choice) {
                    case 1 : 
                        add();
                        break;
                    case 2 :
                        view();
                        break;
                
                    case 3 :
                        delete();   
                        break;
                    default:
                        System.out.println("Enter Valid Input");   
          }
      }
   }

    private static void delete() {
        System.out.println("Enter the date");
        String dateToRemove = sc.next();
        for(int j=0;j<100;j++) {
            if(g[j] != null && dateToRemove.equals(g[j].getDate())){
                rotateArray(j);
                count -= 1;
            }
        }
    }

    private static void view() {
        System.out.println("Enter the date");
        String dateofadd = sc.next();
        
        for(int j=0;j<count;j++) {
            if(g[j] != null && dateofadd.equals(g[j].getDate())){
                printDetails(g[j]);
            }
        }
    }

    private static void printDetails(Grocery grocery) {
        System.out.println("item  name :"+grocery.getitemname());
		System.out.println("quantity :" +grocery.getQuantity());
		System.out.println("price :" + grocery.getPrice());
		System.out.println("date :"+grocery.getDate());
		System.out.println("total :"+  grocery.getTotal());
		System.out.println();
    }

    private static void add() {
        g[count] = new Grocery();
        System.out.println("Enter your date :");
        String	date = sc.next();
        System.out.println("Enter the item name here :");
        String	itemname = sc.next();
        System.out.println("Enter the quantity name :");
        double	quantity = sc.nextDouble();
        System.out.println("price of item  :");
        double	price = sc.nextInt();
        double  total = quantity*price;
        g[count].setDate(date);
        g[count].setPrice(price);
        g[count].setQuantity(quantity);
        g[count].setitemname(itemname);
        g[count].setTotal(total);
        System.out.println("your review added successfully");
        System.out.println("Thank you!");
        System.out.println();
        count += 1;
    }

    private static void rotateArray(int k) {
        for(int i=k;i<count-1;i++){
            g[i] = g[i+1];
        }
        return;
    }
}

