package br.com.millercs.models;

public class Entidade {

	private int codigoDaEntidade;

	private String tituloDaEntidade;

	private Ambito ambito;

	public int getCodigoDaEntidade() {
		return codigoDaEntidade;
	}

	public void setCodigoDaEntidade(int codigoDaEntidade) {
		this.codigoDaEntidade = codigoDaEntidade;
	}

	public String getTituloDaEntidade() {
		return tituloDaEntidade;
	}

	public void setTituloDaEntidade(String tituloDaEntidade) {
		this.tituloDaEntidade = tituloDaEntidade;
	}

	public Ambito getAmbito() {
		return ambito;
	}

	public void setAmbito(Ambito ambito) {
		this.ambito = ambito;
	}

}