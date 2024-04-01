package com.faturamento;

public abstract class NotaFiscal { // abstract - vai impedir que instancie objetos dessa classe

	private String descricao;
	private double valorTotal;

	public NotaFiscal(String descricao, double valorTotal) {
		this.descricao = descricao;
		this.valorTotal = valorTotal;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public abstract double calcularImpostos(); // quem herdar nota fiscal tera que fazer uma subescrita desse metodo

	public void emitir() {
		System.out.printf("Emitindo nota fiscal para: %s%n", getDescricao());
		System.out.printf("Valor total: %.2f%n", getValorTotal());
		System.out.printf("Impostos: %.2f%n", calcularImpostos());
	}

}
