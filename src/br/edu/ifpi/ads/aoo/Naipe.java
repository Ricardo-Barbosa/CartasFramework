package br.edu.ifpi.ads.aoo;

public enum Naipe {

	ESPADAS(Cor.PRETO), PAUS(Cor.PRETO), COPAS(Cor.VERMELHO), OUROS(Cor.VERMELHO);

	private Naipe(Cor cor) {
		this.cor = cor;
	}

	private Cor cor;

	public Cor getCor() {
		return cor;
	}

}
