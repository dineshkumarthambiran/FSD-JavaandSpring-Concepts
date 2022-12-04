package myproject1.Junitbasics;

public class StringUtility {
	
	public int strLen(String a){
		if(a==null||a.equals(""))
		{
			throw new NullPointerException();
		}
		
		return a.length();		
	}
	public String concat(String a,String b) {
		return a + b ;
	}
	
	public boolean isStartswith(String a,String b) {
		return a.startsWith(b);
		
	}
	
	public boolean StrContains(String a,String b) {
		return a.contains(b);
		
	}
}
