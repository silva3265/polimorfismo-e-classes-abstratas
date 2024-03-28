package com.faturamento;

public class GestorFiscal {
	
	public void emitirNotasFiscais(NotaFiscal... notasFiscais) { // Vai receber uma ou varias notas fiscais
        for (NotaFiscal notaFiscal : notasFiscais) {
            notaFiscal.emitir();
            System.out.println("---------------");
        }
    }

}
