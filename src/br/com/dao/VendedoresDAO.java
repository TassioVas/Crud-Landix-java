package br.com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import br.com.factory.ConnectionFactory;
import br.com.model.Vendedores;

public class VendedoresDAO {
	
	public void save(Vendedores vendedores) {


		
		String sql = "INSERT INTO vendedores "
				+ "(CODVEND, DSNOME, CDTAB, DTNASC)"
				+ "VALUES "
				+ "(?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			//criar um conexao com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//para executar a query
			st = (PreparedStatement) conn.prepareStatement(sql);
			st.setLong(1, vendedores.getCodvend());
			st.setString(2, vendedores.getDsnome());
			st.setInt(3, vendedores.getCdtab());
			st.setDate(4, (Date) vendedores.getDtnasc());
			
			st.execute();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (st != null) {
					st.close();
				}
				if  (conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<Vendedores> getVendedores() {
		String sql = "Select * from vendedores";
		
		List<Vendedores> vendedores = new ArrayList<Vendedores>();
		Connection conn = null;
		PreparedStatement st = null;
		
		//Recuperar Dados do banco --Select--
		ResultSet rs = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			st = (PreparedStatement) conn.prepareStatement(sql);
			
			rs = st.executeQuery();
			
			while (rs.next()) {
				Vendedores vendedor = new Vendedores();
				
				vendedor.setCodvend(rs.getInt("CODVEND"));
				vendedor.setDsnome(rs.getString("DSNOME"));
				vendedor.setCdtab(rs.getInt("CDTAB"));
				vendedor.setDtnasc(rs.getDate("DTNASC"));
				
				vendedores.add(vendedor);
			}
		}
		catch (Exception e) {
		 e.printStackTrace();
		}
		finally {
			try {
			if (rs != null) {
				rs.close();
			}
			if (st != null) {
				st.close();
			}
			if (conn != null) {
				conn.close();
			}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return vendedores;
	}
	
}

