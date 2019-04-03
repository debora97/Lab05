package it.polito.tdp.lab05.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.lab05.DAO.ParolaDAO;


public class Model {
List<String> soluzioni;
	
	public void genera(String iniziale) {
		String parziale="" ;
		this.soluzioni= new ArrayList<String>() ;
		this.ricorsione(iniziale,parziale, 0);
		
	}

	private void ricorsione(String iniziale,String parziale, int L) {
		// le L caselle da 0 a L-1 sono piene
		// devo trovare un valore per la casella
		// in posizione L

		if (L == iniziale.length()) {
			if(!soluzioni.contains(parziale)) {
			soluzioni.add(parziale);
			return;
			}
		}

		for (int i = 0; i < iniziale.length(); i++) {
			// provo a mettere il valore 'i' nella casella 'L'
			char c=iniziale.charAt(i);

			if (this.contaLettera(c, iniziale)>this.contaLettera(c,parziale)) {
				parziale+=c;

				ricorsione(iniziale,parziale, L + 1);

				parziale=parziale.substring(0, parziale.length()-1);
			}
		}
	}

	private int contaLettera(char c, String iniziale) {
		int contatore=0;
		for(int i=0; i<iniziale.length(); i++) {
			if(String.valueOf(iniziale.charAt(i)).compareTo(Character.toString(c))==0) {
				contatore++;
			}
		}
		return contatore;
	}
	
	


	

}
