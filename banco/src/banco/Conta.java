package banco;

import java.util.ArrayList;

import java.util.List;

public class Conta {
	private String nome;
	private double saldo;
	private Endereco endereco;
	
	
	public Conta(String nome, double saldo, Endereco endereco) {
		this.nome = nome;
		this.saldo = saldo;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", saldo=" + saldo + ", endereco=" + endereco.getRua() + "]" + endereco.getCidade();
	}
	
	
	
}