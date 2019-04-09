package it.polito.tdp.lab05.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;





public class ParolaDAO {

	public boolean isCorrect(String s) {
		 String parola=null;
		final String sql = "SELECT nome " + 
				"FROM parola " + 
				"WHERE nome=? ";

	

		try {
			Connection conn = ConnectDB.getConnection(); // devi fare la classe connection
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, s);

			ResultSet rs = st.executeQuery(); // qui ho i risultati della query che ho fatto

			while (rs.next()) {
				  parola = rs.getString("nome");
				 //soluzioni.add(parola);
				
			}
			conn.close();
			//return soluzioni;
			if(parola!=null) {
				return true;
			}else return false;
			

		} catch (SQLException e) {
			System.out.println("Errore connessione al DB");
			throw new RuntimeException("Errore Db");
		}

	}

	

}
