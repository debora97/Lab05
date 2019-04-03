package it.polito.tdp.lab05.model;
import java.util.*;
public class Parola {
	private String parola;
	private String[] lettere;
	private int nLettere;
	private List<String> anagramma;
	public Parola(String parola, int nLettere) {
		
		this.parola = parola;
		this.lettere = lettere;
		this.nLettere = parola.length();
		
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	public int getnLettere() {
		return nLettere;
	}
	public void setnLettere(int nLettere) {
		this.nLettere = nLettere;
	}
	
	// remuve contains add isCorretta
	
	
	

}


