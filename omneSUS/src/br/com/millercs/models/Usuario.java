package br.com.millercs.models;

import java.sql.Date;

public class Usuario extends Pessoa {

	private String login, senha;
	private int permissoes;
	private Date ultimoLogin;
	
	public Date getUltimoLogin() {
		return ultimoLogin;
	}

	public void setUltimoLogin(Date ultimoLogin) {
		this.ultimoLogin = ultimoLogin;
	}

	public int getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(int permissoes) {
		this.permissoes = permissoes;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
