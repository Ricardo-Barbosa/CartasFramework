package br.edu.ifpi.ads.aoo;

public class Carta {
	
	Naipe naipe = Naipe.ESPADAS;
	
	ValorCarta valor = ValorCarta.AS;

	public Carta() {
	}
	
	public Carta(Naipe naipe, ValorCarta valor) {
		super();
		this.naipe = naipe;
		this.valor = valor;
	}



	public Naipe getNaipe() {
		return naipe;
	}

	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}
	
	public Cor getCor() {
		return naipe.getCor();
	}

	public ValorCarta getValor() {
		return valor;
	}

	public void setValor(ValorCarta valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "[" + naipe + " - " + valor + "]";
	}

}
