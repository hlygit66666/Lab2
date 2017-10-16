package hello_w;

import java.sql.*;
import java.util.*;
import com.opensymphony.xwork2.ActionSupport;

public class InformationAction extends ActionSupport {

	private String ISBN;
	private String Title;
	private int AuthorID;
	private String Publisher;
	private String PublishDate;
	private String price;
	private String Name;
	private String Age;
	private String Country;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public int getAuthorID() {
		return AuthorID;
	}

	public void setAuthorID(int authorID) {
		AuthorID = authorID;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public String getPublishDate() {
		return PublishDate;
	}

	public void setPublishDate(String publishDate) {
		PublishDate = publishDate;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String execute() throws Exception {

		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			// Connection connect = DriverManager.getConnection(
			// "jdbc:mysql://127.0.0.1/bookdb?&useSSL=false", "root", "houliya520");
			Connection connect = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3306/app_hlybook",
					"0jzkwkjk3x", "3yhyy3yk1mhll4hl01h4j2lwwj44h44ylm1zi40h");
			// 连接URL为 jdbc:mysql//服务器地址/数据库名
			// 后面的2个参数分别是登陆用户名和密码
			System.out.println("Success connect Mysql server!");
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from author where AuthorID=" + this.AuthorID + ";");
			while (rs.next()) {
				this.Age = rs.getString("Age");
				this.Name = rs.getString("Name");
				this.Country = rs.getString("Country");
			}

			stmt = connect.createStatement();
			rs = stmt.executeQuery("select * from book where ISBN=\"" + ISBN + "\";");
			while (rs.next()) {
				this.Title = rs.getString("Title");
				this.Publisher = rs.getString("Publisher");
				this.PublishDate = rs.getString("PublishDate");
				this.price = rs.getString("price");
			}
		}

		catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
		return "success";
	}

}
