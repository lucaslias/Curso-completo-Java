package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner ler = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println("informe o nome: ");
		String nome = ler.nextLine();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.execute();
		
		conexao.close();
		ler.close();
		
		
	}

}
