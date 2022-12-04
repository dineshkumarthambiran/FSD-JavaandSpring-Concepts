package oops;


public class BankDetails {
	
	
	private int accNum;
	private String accName;
	private String branch;
	
	BankDetails(){
		accNum = 1234;
		accName="Dinesh";
		branch = "Chennai";	
		
	}
	
	BankDetails(String branch){
		this.branch = branch ;
		
	}
	
	public void setaccNum(int accNum)
	{
		this.accNum=accNum;
	}
	public void setaccName(String accName)
	{
		this.accName=accName;
	}
	public void setBranch(String branch)
	{
		this.branch=branch;
	}
	
	public int getAccNum()
	{
		return accNum;
	}
	public String getAccName()
	{
		return accName;
	}
	public String getBranch()
	{
		return branch;
	}
	
	public void accDetails() {
		System.out.println("Hi "+accName+"! Welcome your acccount number is "+accNum);
		System.out.println(" your account is held at "+branch);
		System.out.println("you can change your acc now");
	
	}
}


