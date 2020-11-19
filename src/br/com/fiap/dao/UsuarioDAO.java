package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.fiap.bean.Usuario;
import br.com.fiap.connection.ConnectionFactory;

public class UsuarioDAO {

	private Connection con;

	public UsuarioDAO() {
		ConnectionFactory cf = new ConnectionFactory();
		try {
			this.con = cf.DBConnectionManager();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Usuario select(Usuario up) {
		
		String sql = null;
		Usuario u = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			
			// CRIANDO A INSTRU��O SQL
			sql = "SELECT * FROM TB_PERSONAGEM P INNER JOIN TB_ATOR A ON P.ID_ATOR = ";
			
			// Criando a conex�o
			ps = con.prepareStatement(sql);
			

			//Criando o ResultSet que vai armazenar o conte�do da consulta.
			rs = ps.executeQuery();

			// Criando uma estrutura para ler o ResultSet
			while (rs.next()) {
				// A cada itera��o, ser� criado um novo Objeto e este ser� populado
				// com os dados oriundos da base de dados.
				u = new Usuario();
				
				u.setNome(rs.getNString("nome"));
				u.setPapelFilme(rs.getNString("papel_filme"));
				u.setSobre(rs.getNString("sobre"));
				u.setUrlAvatar(rs.getNString("url_avatar"));
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				ps.close();
				rs.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return u;
	}

}
