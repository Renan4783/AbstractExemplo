package br.unicentro.acaddecomp;

public class TestaContasBancarias {
	public static void main (String args[]){
		//Não é possível instanciar esta classe
		//ContaBancaria cteste = new ContaBancaria("teste");
		ContaSimples conta1 = new ContaSimples("João");
		ContaEspecial conta2 = new ContaEspecial("Carlos", 500);
		conta1.deposita(2000);
		conta2.deposita(3000);
		conta1.retira(2500);
		conta2.retira(3500);
	}
}
