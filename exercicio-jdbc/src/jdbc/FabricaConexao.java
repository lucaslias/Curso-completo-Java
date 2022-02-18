package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
	
	public static Connection getConexao()   {
		
		try {
//			final String stringDeConexao = "jdbc:mysql://localhost/cursojdbc?verifyServerCertificate=false&useSSL=true";
//			final String usuario = "root";
//			final String senha = "Lucastopn0x";
			Properties prop = getProperies();
			final String stringDeConexao = prop.getProperty("banco.url");
			final String usuario = prop.getProperty("banco.usuario");
			final String senha = prop.getProperty("banco.senha");
			return DriverManager.getConnection(stringDeConexao, usuario, senha);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
		
		
	}
	
	private static Properties getProperies() throws IOException {
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		return prop;
	}

}
