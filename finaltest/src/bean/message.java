package bean;

import java.sql.*;

public class message
{

	String phone;
	String name;
	String message;
	StringBuffer queryresult;
	
	public message()
	{
		
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void addmessage() 
	{
		Connection con=null;
		Statement ps=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/finaltest?useUnicode=true&characterEncoding=utf-8", "root",
					"");
			ps=con.createStatement();
			String sql="INSERT INTO message(`time`,`phonenum`,`name`,`message`) VALUES(now(),'"+phone+"','"+name+"','"+message+"')";
			ps.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
				try {
					if(ps!=null)
					{
					    ps.close();
					}
					if(con!=null)
					{
						con.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public void deletemessage(int id)
	{
		Connection con=null;
		Statement ps=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/finaltest?useUnicode=true&characterEncoding=utf-8", "root",
					"");
			ps=con.createStatement();
			String sql="delete from message where orderid="+id+"";
			ps.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
				try {
					if(ps!=null)
					{
					    ps.close();
					}
					if(con!=null)
					{
						con.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	
	
	
	public StringBuffer getQueryresult() {
		queryresult=new StringBuffer();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/finaltest", "root",
					"");
			ps=con.prepareStatement("select * from message");
			rs=ps.executeQuery();
			queryresult.append("<table border=1>");
			queryresult.append("<tr>");
			queryresult.append("<th>留言id</th>");
			queryresult.append("<th>留言时间</th>");
			queryresult.append("<th>手机号</th>");
			queryresult.append("<th>姓名</th>");
			queryresult.append("<th>留言内容</th>");
			queryresult.append("</tr>");
			while(rs.next())
			{
				queryresult.append("<tr>");
				queryresult.append("<td>"+rs.getString(1)+"</td>");
				queryresult.append("<td>"+rs.getString(2)+"</td>");
				queryresult.append("<td>"+rs.getString(3)+"</td>");
				queryresult.append("<td>"+rs.getString(4)+"</td>");
				queryresult.append("<td>"+rs.getString(5)+"</td>");
				queryresult.append("</tr>");
			}
			queryresult.append("<table>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
				try {
					if(rs!=null)
					{
						rs.close();
					}
					if(ps!=null)
					{
					ps.close();
					}
					if(con!=null)
					{
						con.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return queryresult;
	}
	
	
	
}