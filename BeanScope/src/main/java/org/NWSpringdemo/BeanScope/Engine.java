package org.NWSpringdemo.BeanScope;

public class Engine {
	
	int engineno;
	String enginename;
	
	
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getEngineno() {
		return engineno;
	}
	public void setEngineno(int engineno) {
		this.engineno = engineno;
	}
	public String getEnginename() {
		return enginename;
	}
	public void setEnginename(String enginename) {
		this.enginename = enginename;
	}
	public Engine(int engineno, String enginename) {
		super();
		this.engineno = engineno;
		this.enginename = enginename;
	}
	@Override
	public String toString() {
		return "engineno= "+ engineno + ", enginename=" + enginename ;
	}
	
	

}
