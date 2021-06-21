

class Table{
	int i = 3;
	int j=1;
	void p(){
    System.out.println(i*j);
    j++;
    if(j>10){

    }else{
    	p();
    }


	} 

	public static void main(String[] args) {
      
      table s = new table();
      s.p();

	}
}