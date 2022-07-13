package hashtable;

import java.util.Hashtable;


class Node {

	private Hashtable <String, String> hashtable = new Hashtable <String, String>();

	 protected Node(String fn, String ln, String un, String pw){
		
		hashtable.put("first name", fn);
		hashtable.put("last name", ln);
		hashtable.put("user name", un);
		hashtable.put("password", pw);

	}
	 
	protected void print2D(){
			System.out.println("Hashtable values");
			System.out.println(hashtable);

        }
}




