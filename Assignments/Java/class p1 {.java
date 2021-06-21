class p1 {

	public static void main(String[] args) {
		System.out.println("enter number of element");
		int size = Integer.parseInt(System.console().readLine());
		
		int [] elements = new int[size];
		
		for(int i=0;i<size;i++) {
			elements[i]= i;
		}
	
		for(int val :elements) System.out.println(val);
	}

}
