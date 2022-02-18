package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsularPessoas2 {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner ler = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println("informe o nome: ");
		String nomeEntrada = ler.nextLine();
		nomeEntrada = "%"+nomeEntrada+"%";
		
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nomeEntrada);
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()){
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
			
		}
		
		for(Pessoa p:pessoas) {
			System.out.println(p.getNome());
		}
		
		ler.close();
		stmt.close();
		conexao.close();
		
	}

}
