package it.polito.tdp.lab05.model;



public class TestAnagrammi {
	public static void main(String[] args) {
		

		Model parola = new Model() ;
		
		parola.genera("tutto");
		System.out.println(parola.soluzioni.toString());
	}

}
