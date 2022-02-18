package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner ler = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println("informe o codigo da pessoa: ");
		String codEntrada = ler.nextLine();
		
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, codEntrada);
		
		if(stmt.executeUpdate() > 0) {
			System.out.println("pessoa excluida com sucesso");
		} else {
			System.out.println("não foi possivel excluir");
		}
		
		
		
		ler.close();
		stmt.close();
		conexao.close();
		
	}
}
