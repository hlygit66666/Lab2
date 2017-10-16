package hello_w;
import java.sql.*;
import java.util.*;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport{
	

	private List books =new ArrayList();
	 
	 public List getBooks() {
		return books;
	}

	public void setBooks(List books) {
		this.books = books;
	}
	
	private String Tit;

	public String getTit() {
		return Tit;
	}

	public void setTit(String tit) {
		Tit = tit;
	}
	

	public String execute() throws Exception{
		
	    try {
	      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
	      System.out.println("Success loading Mysql Driver!");
	    }
	    catch (Exception e) {
	      System.out.print("Error loading Mysql Driver!");
	      e.printStackTrace();
	    }
	    try {
	    	//Connection connect = DriverManager.getConnection(
	        //  "jdbc:mysql://127.0.0.1/bookdb?&useSSL=false", "root", "houliya520");
	      Connection connect = DriverManager.getConnection(
		          "jdbc:mysql://w.rdc.sae.sina.com.cn:3306/app_hlybook", "0jzkwkjk3x", "3yhyy3yk1mhll4hl01h4j2lwwj44h44ylm1zi40h");
	//连接URL为   jdbc:mysql//服务器地址/数据库名
	//后面的2个参数分别是登陆用户名和密码
	      System.out.println("Success connect Mysql server!");
	      Statement stmt = connect.createStatement();
	      ResultSet rs = stmt.executeQuery("select * from book;");
	      while (rs.next()) {
	    	  Book book1= new Book();
	    	  book1.setISBN(rs.getString("ISBN"));
	    	  book1.setTitle(rs.getString("Title"));
	    	  book1.setAuthorID(rs.getInt("AuthorID"));
	    	  book1.setPublisher(rs.getString("Publisher"));
	    	  book1.setPublishDate(rs.getString("PublishDate"));
	    	  book1.setPrice(rs.getString("price"));
	    	  books.add(book1);
	    	  stmt = connect.createStatement();
	    	  if(Tit != null) {
	    		  stmt.execute("delete from book where Title=\""+this.Tit+"\";");
	    		  return "delsuccess";
	    	  }
	    }	
	}
	    catch (Exception e) {
	      System.out.print("get data error!");
	      e.printStackTrace();
	    }
	    return "success";
	  }
	
}
