package br.com.millercs.models;

import java.util.Date;

public class Procedimento {

	private int codigoDoProcedimento;

	private TipoDoProcedimento tipoDoProcedimento;

	private Pessoa solicitanteDoProcedimento;

	private Pessoa realizadorDoProcedimento;

	private Pessoa paciente;

	private Entidade entidade;
	
	private Date data;

	public int getCodigoDoProcedimento() {
		return codigoDoProcedimento;
	}

	public void setCodigoDoProcedimento(int codigoDoProcedimento) {
		this.codigoDoProcedimento = codigoDoProcedimento;
	}

	public TipoDoProcedimento getTipoDoProcedimento() {
		return tipoDoProcedimento;
	}

	public void setTipoDoProcedimento(TipoDoProcedimento tipoDoProcedimento) {
		this.tipoDoProcedimento = tipoDoProcedimento;
	}

	public Pessoa getSolicitanteDoProcedimento() {
		return solicitanteDoProcedimento;
	}

	public void setSolicitanteDoProcedimento(Pessoa solicitanteDoProcedimento) {
		this.solicitanteDoProcedimento = solicitanteDoProcedimento;
	}

	public Pessoa getRealizadorDoProcedimento() {
		return realizadorDoProcedimento;
	}

	public void setRealizadorDoProcedimento(Pessoa realizadorDoProcedimento) {
		this.realizadorDoProcedimento = realizadorDoProcedimento;
	}

	public Pessoa getPaciente() {
		return paciente;
	}

	public void setPaciente(Pessoa paciente) {
		this.paciente = paciente;
	}

	public Entidade getEntidade() {
		return entidade;
	}

	public void setEntidade(Entidade entidade) {
		this.entidade = entidade;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}