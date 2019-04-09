package it.polito.tdp.anagrammi.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.lab05.model.Model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnagrammiController {
	Model model = new Model();

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField txtInserisci;

	@FXML
	private Button btnCalcoloAnagrammi;

	@FXML
	private TextArea txtAnagrammiCorretti;

	@FXML
	private TextArea txtAnagrammiErrati;

	@FXML
	void doCalcolaAnagrammi(ActionEvent event) {
		String parola;

		try {
			parola = txtInserisci.getText();
		} catch (NumberFormatException e) {
			txtInserisci.clear();
			txtInserisci.appendText("Parola inserita nel modo errato");
			return;

		}
		this.model.genera(parola);
		txtAnagrammiCorretti.clear();
		txtAnagrammiErrati.clear();
		for (String s : model.soluzioni) {

			if (model.isCorrect(s) == true) {
				txtAnagrammiCorretti.appendText(s + "\n");
			} else
				txtAnagrammiErrati.appendText(s + "\n");
		}

	}

	@FXML
	void doReset(ActionEvent event) {
		txtInserisci.clear();
		txtAnagrammiCorretti.clear();
		txtAnagrammiErrati.clear();

	}

	@FXML
	void initialize() {
		assert txtInserisci != null : "fx:id=\"txtInserisci\" was not injected: check your FXML file 'Anagrammi.fxml'.";
		assert btnCalcoloAnagrammi != null : "fx:id=\"btnCalcoloAnagrammi\" was not injected: check your FXML file 'Anagrammi.fxml'.";
		assert txtAnagrammiCorretti != null : "fx:id=\"txtAnagrammiCorretti\" was not injected: check your FXML file 'Anagrammi.fxml'.";
		assert txtAnagrammiErrati != null : "fx:id=\"txtAnagrammiErrati\" was not injected: check your FXML file 'Anagrammi.fxml'.";

	}

	public void setModel(Model model) {
		this.model = model;

	}
}
