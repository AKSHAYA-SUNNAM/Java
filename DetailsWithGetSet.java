package project2;

public class DetailsWithGetSet 
{
	String name;
	public String getname()
	{
		return name;
	}
	public void setname(String newname)
	{
		this.name =newname;
	}
	int ID;
	public int getID()
	{
		return ID;
	}
	public void setID(int newID)
	{
		this.ID =newID;
	}
	String Designation;
	public String getDesignation()
	{
		return Designation;
	}
	public void setDesignation(String newDesignation)
	{
		this.Designation =newDesignation;
	}
	String Company;
	public String getCompany()
	{
		return Company;
	}
	public void setCompany(String newCompany)
	{
		this.Company =newCompany;
	}
	class details
	{
		public static void main(String args[])
		{
			DetailsWithGetSet Obj = new DetailsWithGetSet();
			Obj.setname("Akshaya");
			System.out.println("Employee name : " +Obj.getname());
			Obj.setID(254627);
			System.out.println("Employee ID : " +Obj.getID());
			Obj.setDesignation("Programmer");
			System.out.println("Employee Designation : " +Obj.getDesignation());
			Obj.setCompany("Google");
			System.out.println("company that employee works : " +Obj.getCompany());
		}
	}
}
