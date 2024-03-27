package com.heranca.banco;

public class CaixaEletronico {

	public static final double TARIFA_TRANSFERENCIA = 10;
	public static final double TARIFA_IMPRESSAO_DEMONSTRATIVO = 5;

	public void transferir(Conta contaOrigem, Conta contaDestino, double valorTransferencia) { // Conta - supertipo
		System.out.printf("Transferindo R$%.2f da conta %d/%d para %d/%d%n", valorTransferencia,
				contaOrigem.getAgencia(), contaOrigem.getNumero(), contaDestino.getAgencia(), contaDestino.getNumero());

		contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA); // tem a tarifa de 10
		contaDestino.depositar(valorTransferencia);
	}

	public void imprimirDemonstrativo(Conta conta) {
		if (conta.possuiGratuidadeImpressao()) { // evitando o uso do instanceof e usando mais o polimorfismo
			System.out.println("Impressão do demonstrativo gratuita");
		} else {
			debitarTarifaImpressaoDemonstrativo(conta);
		}
		conta.imprimirDemonstrativo();
	}

	private void debitarTarifaImpressaoDemonstrativo(Conta conta) {
		System.out.printf("Custo da impressão: R$%.2f%n", TARIFA_IMPRESSAO_DEMONSTRATIVO);
		conta.sacar(TARIFA_IMPRESSAO_DEMONSTRATIVO);
	}

}
