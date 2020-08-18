package JavaBasics;


public class Userdata {
	private String FirstName;
	private String LastName;
	
	public void output()
	{
		System.out.println("My Name is:"+FirstName+"  "+LastName);
	}
public String getFirstName()
{
	return FirstName;
}

public void setFirstName(String fn)
{
	 FirstName=fn;
}

public String getLastName()
{
	return LastName;
}
public void setLastName(String ln)
{
	LastName=ln;
}
}

