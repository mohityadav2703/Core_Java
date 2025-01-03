package test;
import java.sql.*;
import java.util.*;
public class RetrieveBookDetails {
	public Vector<BookDetails> v=new Vector<BookDetails>();
	public Vector<BookDetails> retrieve()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
			PreparedStatement ps=con.prepareStatement("select * from BookDetails");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
						//anonymous object create for Bookdetails
				v.add(new BookDetails(rs.getString(1),rs.getString(2),rs.getString(3),rs.getFloat(4),rs.getInt(5)));
			}//end of loop
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return v;
	}
}
