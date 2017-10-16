package hello_w;
import java.sql.*;
import java.util.*;
import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport{
	
	private String Name;
	private List titles =new ArrayList();
	
	public List getTitles() {
			return titles;
	}

	public void setTitles(List titles) {
		this.titles = titles;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public void validate()
	{
		if(Name==null||Name.equals(""))
		{
			addFieldError("Name", "作者不能为空");
		}
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
	      ResultSet rs = stmt.executeQuery("select AuthorID from author where Name=\""+this.Name+"\";");
	      
	      if(rs.next()==false) {
	    	  return "fail";
	      }
	      else
	      {
	    	  titles =new ArrayList();
	      }
	      int author_ID=rs.getInt("AuthorID");
	      stmt = connect.createStatement();
	      rs = stmt.executeQuery("select * from book where AuthorID="+author_ID +";");
	      while (rs.next()) {
	    	 Search_Author s_a=new Search_Author();
	    	 s_a.setAuthorID(rs.getInt("AuthorID"));
	    	 s_a.setTitle(rs.getString("Title"));
	    	 titles.add(s_a);
	      }
	    }
	    catch (Exception e) {
	      System.out.print("get data error!");
	      e.printStackTrace();
	    }
	    return "success";
	  }
}
