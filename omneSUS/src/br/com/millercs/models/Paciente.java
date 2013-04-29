package br.com.millercs.models;

import java.util.List;


public class Paciente extends Pessoa {

	private List<Procedimento> procedimentos;

	public List<Procedimento> getProcedimentos() {
		return procedimentos;
	}

	public void setProcedimentos(List<Procedimento> procedimentos) {
		this.procedimentos = procedimentos;
	}

}