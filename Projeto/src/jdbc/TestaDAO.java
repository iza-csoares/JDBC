package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.ProdutoDao;
import model.Produto;

public class TestaDAO {

	public static void main(String[] args) throws SQLException {
		Produto produto = new Produto("XBOX", "360");
		try (Connection con = new ConnectionPool().getConnection()) {
			ProdutoDao produtoDao = new ProdutoDao(con);
			produtoDao.salva(produto);
			
			List <Produto> produtos = produtoDao.lista();
			for (Produto p : produtos){
				System.out.println(p);
			}

		}
		
	}

}
