package br.unicentro.acaddecomp;

public class ContaEspecial extends ContaBancaria{	
	private double adicional;
	
	public ContaEspecial (String nome1, double adicional){
		super (nome1);
		this.adicional = adicional;
	}
	
	public void retira (double valor){
		if ((getSaldo()<valor) && (getSaldo()+adicional<valor)){
			System.out.println("Saldo Insuficiente!");
		} else if ((getSaldo()<valor) && (getSaldo()+adicional>valor)){
			double temp = getSaldo();
			setSaldo((getSaldo()+adicional)-valor);
			adicional =- (valor - temp);
			System.out.println(adicional);
			System.out.println(getSaldo());
		} else {
			setSaldo(getSaldo()-valor);
			System.out.println(adicional);
			System.out.println(getSaldo());
		}
	}
	
}
