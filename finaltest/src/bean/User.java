package bean;

import java.sql.*;

public class User //获取账户信息 对账户进行操作
{
	String phone; //手机号
	String name;  //真实姓名
	String username; //用户名
	String password; //密码
	String identityid; //身份证号
	String email; //邮箱
	StringBuffer queryresult;
	
	public User()
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdentityid() {
		return identityid;
	}
	
	public void setIdentityid(String identityid) {
		this.identityid = identityid;
	}
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void adduser() //注册时调用 为账户表添加新账户
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
			String sql="insert into account('phonenum','name','username','password','identity','email') values('"+phone+"','"+name+"','"+username+"','"+password+"','"+identityid+"','"+email+"')";
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
	
	public void signin() //注册时调用 为账户表添加新账户
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
			String sql="insert into account(phonenum,username,password,email) values('"+phone+"','"+username+"','"+password+"','"+email+"')";
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
	
	
	public void updateUser()
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
			String sql="update account set username='"+username+"',name='"+name+"',password='"+password+"',identity='"+identityid+"',email='"+email+"' where phone="+phone+"";
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
	
	public void updatepwd(String newpwd,String phone) //用户修改密码时调用
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
			String sql="update account set password='"+newpwd+"' where phonenum='"+phone+"'";
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
	
	public void updatename(String newname,String phone) //用户修改真实姓名时调用
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
			String sql="update account set name='"+newname+"' where phonenum='"+phone+"'";
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
	
	public void updateidentity(String newidentity,String phone) //用户修改身份证号时调用
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
			String sql="update account set identity='"+newidentity+"' where phonenum='"+phone+"'";
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
	
	public void updateemail(String email,String phone) //用户修改邮箱时调用
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
			String sql="update account set email='"+email+"' where phonenum='"+phone+"'";
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
	
	public void updateusername(String username,String phone) //用户修改用户名时调用
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
			String sql="update account set username='"+username+"' where phonenum='"+phone+"'";
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
	
	public void deleteUser(String phone)
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
			String sql="delete from account where phonenum='"+phone+"'";
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
			ps=con.prepareStatement("select * from account");
			rs=ps.executeQuery();
			queryresult.append("<table border=1>");
			queryresult.append("<tr>");
			queryresult.append("<th>手机号</th>");
			queryresult.append("<th>真实姓名</th>");
			queryresult.append("<th>身份证号</th>");
			queryresult.append("<th>用户名</th>");
			queryresult.append("<th>密码</th>");
			queryresult.append("<th>邮箱</th>");
			queryresult.append("</tr>");
			while(rs.next())
			{
				queryresult.append("<tr>");
				queryresult.append("<td>"+rs.getString(1)+"</td>");
				queryresult.append("<td>"+rs.getString(2)+"</td>");
				queryresult.append("<td>"+rs.getString(3)+"</td>");
				queryresult.append("<td>"+rs.getString(4)+"</td>");
				queryresult.append("<td>"+rs.getString(5)+"</td>");
				queryresult.append("<td>"+rs.getString(6)+"</td>");
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
	
	public StringBuffer getusermes(String phone) {
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
			ps=con.prepareStatement("select * from account where phonenum='"+phone+"'");
			rs=ps.executeQuery();
			queryresult.append("<table border=1>");
			queryresult.append("<tr>");
			queryresult.append("<th>手机号</th>");
			queryresult.append("<th>真实姓名</th>");
			queryresult.append("<th>身份证号</th>");
			queryresult.append("<th>用户名</th>");
			queryresult.append("<th>密码</th>");
			queryresult.append("<th>邮箱</th>");
			queryresult.append("</tr>");
			while(rs.next())
			{
				queryresult.append("<tr>");
				queryresult.append("<td>"+rs.getString(1)+"</td>");
				queryresult.append("<td>"+rs.getString(2)+"</td>");
				queryresult.append("<td>"+rs.getString(3)+"</td>");
				queryresult.append("<td>"+rs.getString(4)+"</td>");
				queryresult.append("<td>"+rs.getString(5)+"</td>");
				queryresult.append("<td>"+rs.getString(6)+"</td>");
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
	
	public StringBuffer pwdcheck(String phone)
	{
		StringBuffer pwd=new StringBuffer();
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
			ps=con.prepareStatement("select password from account where phonenum='"+phone+"'");
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				pwd.append(rs.getString(1));
			}
			
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
		return pwd;
	}
	
	public StringBuffer usercheck(String phone)
	{
		StringBuffer pwd=new StringBuffer();
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
			ps=con.prepareStatement("select * from account where phonenum='"+phone+"'");
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				pwd.append(rs.getString(1));
			}
			
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
		return pwd;
	}

}