package it.polito.tdp.lab05.model;



public class TestAnagrammi {
	public static void main(String[] args) {
		

		Model parola = new Model() ;
		
		parola.genera("tutto");
    for (String s: parola.soluzioni) {
    		
        	if(parola.isCorrect(s)==true) {
        		System.out.println("corretta:"+s);
        	}else System.out.println("errata:"+s);
    	}
	}
	

}
