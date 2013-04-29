package br.com.millercs.models;

import java.util.List;

public class TipoDoProcedimento {

	private int codigoTipoDoProcedimento;
	
	private String codigoCID10;

	private List<String> dadosDesejados;

	private List<String> dadosObtidos;

	public int getCodigoTipoDoProcedimento() {
		return codigoTipoDoProcedimento;
	}

	public void setCodigoTipoDoProcedimento(int codigoTipoDoProcedimento) {
		this.codigoTipoDoProcedimento = codigoTipoDoProcedimento;
	}

	public List<String> getDadosDesejados() {
		return dadosDesejados;
	}

	public void setDadosDesejados(List<String> dadosDesejados) {
		this.dadosDesejados = dadosDesejados;
	}

	public List<String> getDadosObtidos() {
		return dadosObtidos;
	}

	public void setDadosObtidos(List<String> dadosObtidos) {
		this.dadosObtidos = dadosObtidos;
	}

	public String getCodigoCID10() {
		return codigoCID10;
	}

	public void setCodigoCID10(String codigoCID10) {
		this.codigoCID10 = codigoCID10;
	}

}