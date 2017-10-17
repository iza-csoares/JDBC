package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionPool().getConnection();
		
		Statement statement = connection.createStatement();
		statement.execute("delete from Produto where id 12");
		int count = statement.getUpdateCount();   
		System.out.println(count + " linha(s) atualizada(s)");
		
		connection.close();
		

	}

}
