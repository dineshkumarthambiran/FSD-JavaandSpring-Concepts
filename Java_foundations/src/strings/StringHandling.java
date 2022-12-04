package strings;

public class StringHandling {
	
	public void stringImmutable() {
	String msg = "Initial";
	System.out.println(msg.hashCode());
	 msg = "New";
	 System.out.println(msg.hashCode());
	 
	}

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		StringHandling S = new StringHandling();
		S.stringImmutable();
	}

}
