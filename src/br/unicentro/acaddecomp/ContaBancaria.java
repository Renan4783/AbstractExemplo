package br.unicentro.acaddecomp;

public abstract class ContaBancaria {
	
	private String nome;
	private double saldo;
	
	public ContaBancaria (String nome1){
		this.nome = nome1;
		this.saldo = 0;
	}
	
	public abstract void retira (double valor);
	
	public void deposita (double valor){
		setSaldo(valor+getSaldo());
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void setSaldo (double saldo){
		this.saldo = saldo;
	}
	
}
