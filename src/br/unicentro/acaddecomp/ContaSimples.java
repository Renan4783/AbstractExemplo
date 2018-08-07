package br.unicentro.acaddecomp;

public class ContaSimples extends ContaBancaria {
	
	public ContaSimples (String nome1){
		super (nome1);
	}
	
	public void retira (double valor){
		if (getSaldo()<valor){
			System.out.println("Saldo Insuficiente!");
		} else {
			setSaldo(getSaldo()-valor);
			System.out.println(getSaldo());
		}
	}
	
}
