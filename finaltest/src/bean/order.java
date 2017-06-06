package bean;

import java.sql.*;
import java.sql.Date;

public class order //订单类 对订单进行操作
{
	int roomid; //房间号
	String phone; //用户手机号
	String checkin; //入住时间
	String checkout; //离开时间
	int people;//入住人数
	StringBuffer queryresult;
	
	public order()
	{
		
	}
	
	
	

	
	




	public int getRoomid() {
		return roomid;
	}










	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}










	public String getPhone() {
		return phone;
	}





	public void setPhone(String phone) {
		this.phone = phone;
	}




	




	public String getCheckin() {
		return checkin;
	}





	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}





	public String getCheckout() {
		return checkout;
	}





	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}





	public int getPeople() {
		return people;
	}





	public void setPeople(int people) {
		this.people = people;
	}





	public void addorder() 
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
			//String sql="insert into orderlist('id','ordertime','phonenum','checkin','checkout','people') values("+roomid+",now(),'"+phone+"',str_to_date('"+checkin+"','%Y-%m-%d'),str_to_date('"+checkout+"','%Y-%m-%d'),"+people+")";
			
			String sql="INSERT INTO orderlist(`id`,`ordertime`,`phonenum`,`checkin`,`checkout`,`people`) VALUES("+roomid+",now(),'"+phone+"',str_to_date('"+checkin+"','%Y-%m-%d'),str_to_date('"+checkout+"','%Y-%m-%d'),"+people+")";
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
	
	
	public void updateorder(int id)
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
			String sql="update orderlist set id="+roomid+",phonenum='"+phone+"',checkin=str_to_date('"+checkin+"','%Y-%m-%d'),checkout=str_to_date('"+checkout+"','%Y-%m-%d'),people="+people+" where orderid="+id+"";
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

	public void deleteorder(int id)
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
			String sql="delete from orderlist where orderid="+id+"";
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
			ps=con.prepareStatement("select * from orderlist");
			rs=ps.executeQuery();
			queryresult.append("<table border=1>");
			queryresult.append("<tr>");
			queryresult.append("<th>订单编号</th>");
			queryresult.append("<th>房间id</th>");
			queryresult.append("<th>下单时间</th>");
			queryresult.append("<th>电话号码</th>");
			queryresult.append("<th>入住时间</th>");
			queryresult.append("<th>离开时间</th>");
			queryresult.append("<th>入住人数</th>");
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
				queryresult.append("<td>"+rs.getString(7)+"</td>");
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
	
	
	public StringBuffer getuserorders(String phone) {
		StringBuffer sb=new StringBuffer();
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
			ps=con.prepareStatement("select * from orderlist where phonenum='"+phone+"' order by ordertime desc");
			rs=ps.executeQuery();
			sb.append("<table border=1>");
			sb.append("<tr>");
			sb.append("<th>订单编号</th>");
			sb.append("<th>房间id</th>");
			sb.append("<th>下单时间</th>");
			sb.append("<th>电话号码</th>");
			sb.append("<th>入住时间</th>");
			sb.append("<th>离开时间</th>");
			sb.append("<th>入住人数</th>");
			sb.append("</tr>");
			while(rs.next())
			{
				sb.append("<tr>");
				sb.append("<td>"+rs.getString(1)+"</td>");
				sb.append("<td>"+rs.getString(2)+"</td>");
				sb.append("<td>"+rs.getString(3)+"</td>");
				sb.append("<td>"+rs.getString(4)+"</td>");
				sb.append("<td>"+rs.getString(5)+"</td>");
				sb.append("<td>"+rs.getString(6)+"</td>");
				sb.append("<td>"+rs.getString(7)+"</td>");
				sb.append("</tr>");
			}
			sb.append("<table>");
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
		return sb;
	}
	
	

}