package br.com.gustavo.bank.modelo;

import java.io.Serializable;

public class Cliente implements Serializable{
	
	private String nome;
	private String profissao;
	private String cpf;
	
	
	public Cliente(String nome, String cpf, String profissao) {
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
	}
	public Cliente(String nome, String cpf) {
		this(nome, cpf, "Indefinido");
		//System.out.println("Profissão não informada, será alterado para o valor pardrão de: Indefinido.");
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return
				this.getNome() + "\n" + 
				this.getCpf() + "\n" +
				this.getProfissao() + ".";
	}
}
