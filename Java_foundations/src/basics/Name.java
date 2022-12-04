package basics;

public class Name
{	int id;
	String name;
	int age;

	Name(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}

	public void dispDetails()
	{
		System.out.println(id+" "+name+" "+age);
	}

	public static void main(String[] args)

	{	Name user1 = new Name(101,"Dinesh",24);
		Name user2 = new Name(102,"Sumit",25);
		Name user3 = new Name(103,"Amit",26);
		Name user4 = new Name(104,"Mohit",27);
		
		
		user1.dispDetails();
		user2.dispDetails();
		user3.dispDetails();
		user4.dispDetails();
	
	}	


}