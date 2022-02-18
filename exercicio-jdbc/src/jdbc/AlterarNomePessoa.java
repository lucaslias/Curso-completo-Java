package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner ler = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println("informe o codigo da pessoa: ");
		String codEntrada = ler.nextLine();
		
		String sql = "SELECT * FROM pessoas WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, codEntrada);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			System.out.println("o nome atual é " + p.getNome());
			ler.nextLine();
			
			System.out.println("informe o novo nome da pessoa: ");
			String nomeEntrada = ler.nextLine();
			
			String sqlUpd = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
			PreparedStatement stmtUpd = conexao.prepareStatement(sqlUpd);
			stmtUpd.setString(1, nomeEntrada);
			stmtUpd.setString(2, codEntrada);
			stmtUpd.execute();
			
			System.out.println("alterado com sucesso");
			
			ler.close();
			stmtUpd.close();
			stmt.close();
			conexao.close();
		} else {
			System.out.println("codigo não encontrado");
		}
		

		
	}

}
