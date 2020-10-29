package Activity5;

class MyBook extends Book{
	 public void setTitle(String s) {
	        title = "Maths";
	        System.out.println("given title  "+title);
	        
	    }
	 public static void main(String[] args) {
		 MyBook objMyBook = new MyBook();
		 objMyBook.setTitle("Book1");
		
	}
}