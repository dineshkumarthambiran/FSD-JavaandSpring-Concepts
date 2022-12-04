package FileHandlind.Serialization;

import java.io.Serializable;

public class StudentSerialisation implements Serializable {

	int sid;
	String sName;
	
	public StudentSerialisation() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "StudentSerialisation [sid=" + sid + ", sName=" + sName + "]";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}
	
	

}
