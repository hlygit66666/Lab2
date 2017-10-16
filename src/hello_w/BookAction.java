package hello_w;

import java.sql.*;
import java.util.*;
import com.opensymphony.xwork2.ActionSupport;


public class BookAction extends ActionSupport {

	private List books = new ArrayList();

	public List getBooks() {
		return books;
	}

	public void setBooks(List books) {
		this.books = books;
	}

	public String execute() throws Exception {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
			System.out.println("Success loading Mysql Driver!");
			conn = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3306/app_hlybook",
					"0jzkwkjk3x", "3yhyy3yk1mhll4hl01h4j2lwwj44h44ylm1zi40h");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		/*
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}*/
		
		books.clear();
		try {
			// Connection connect = DriverManager.getConnection(
			// "jdbc:mysql://127.0.0.1/bookdb?&useSSL=false", "root", "houliya520");
			//Connection connect = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3306/app_hlybook",
					//"0jzkwkjk3x", "3yhyy3yk1mhll4hl01h4j2lwwj44h44ylm1zi40h");
			// 连接URL为 jdbc:mysql//服务器地址/数据库名
			// 后面的2个参数分别是登陆用户名和密码
			System.out.println("Success connect Mysql server!");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book;");
			while (rs.next()) {
				Book book1 = new Book();
				book1.setISBN(rs.getString("ISBN"));
				book1.setTitle(rs.getString("Title"));
				book1.setAuthorID(rs.getInt("AuthorID"));
				book1.setPublisher(rs.getString("Publisher"));
				book1.setPublishDate(rs.getString("PublishDate"));
				//book1.setPrice(rs.getFloat("price"));
				books.add(book1);
			}
			if (books.size() == 0) {
				return "fail";
			}
		}
		catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
		return "success";
	}
}
