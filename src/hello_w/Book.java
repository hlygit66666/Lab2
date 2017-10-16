package hello_w;
import java.util.*;

public class Book {
	
	private String ISBN;
	private String Title;
	private int AuthorID;
	private String Publisher;
	private String PublishDate;
	private String price;
	public String getTitle()
	{
		return Title;
	}
	public void setTitle(String Title)
	{
		this.Title=Title;
	}
	public String getISBN()
	{
		return ISBN;
	}
	public void setISBN(String ISBN)
	{
		this.ISBN=ISBN;
	}
	public int getAuthorID()
	{
		return AuthorID;
	}
	public void setAuthorID(int AuthorID)
	{
		this.AuthorID=AuthorID;
	}
	public String getPublisher()
	{
		return Publisher;
	}
	public void setPublisher(String Publisher)
	{
		this.Publisher=Publisher;
	}
	public String getPublishDate()
	{
		return PublishDate;
	}
	public void setPublishDate(String PublishDate)
	{
		this.PublishDate=PublishDate;
	}
	public String getPrice()
	{
		return price;
	}
	public void setPrice(String price)
	{
		this.price=price;
	}
	
}
