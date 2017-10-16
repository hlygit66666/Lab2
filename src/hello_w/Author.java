package hello_w;

import java.util.ArrayList;
import java.util.List;

public class Author {
	private int AuthorID;
	private String Name;
	private String Age;
	private String Country;
	public Author(int AuthorID,String Name,String Age,String Country)
	{
		this.AuthorID=AuthorID;
		this.Name=Name;
		this.Age=Age;
		this.Country=Country;
	}
	private List authors;
	public String execute()
	{
		authors=new ArrayList();
		return "success";
	}
	public int getAuthorID()
	{
		return AuthorID;
	}
	public void setAuthorID(int AuthorID)
	{
		this.AuthorID=AuthorID;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public String getAge()
	{
		return Age;
	}
	public void setAge(String Age)
	{
		this.Age=Age;
	}
	public String getCountry()
	{
		return Country;
	}
	public void setCountry(String Country)
	{
		this.Country=Country;
	}
	
}
