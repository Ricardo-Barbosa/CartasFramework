package br.edu.ifpi.ads.aoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deque {
	
	private ComportamentoDeque comportamentoRemocao;
	
	public Deque(ComportamentoDeque comportamentoRemocao) {
		super();
		this.comportamentoRemocao = comportamentoRemocao;
	}

	private List<Carta> cartas = new ArrayList<Carta>();
	
	public void inserir(Carta carta) {
		cartas.add(carta);
	}
	
	public Carta retirar() {
		if (cartas.isEmpty())
			return null;
		
		// Hummmmmmm!!! Smells a bit better
		if (comportamentoRemocao == ComportamentoDeque.FIRST)
			return cartas.remove(0);
		else if (comportamentoRemocao == ComportamentoDeque.LAST)
			return cartas.remove(cartas.size() - 1);
		
		return null;
	}
        
        public void gerarDeque(){
            for (Naipe n: Naipe.values()) {
                for (ValorCarta v : ValorCarta.values()) {
                    this.inserir(new Carta(n,v));
                }
                
            }
        }
        
        public void exibeDeque(){
            if(!this.cartas.isEmpty()){
                for (Carta c:this.cartas) {
                    System.out.println(c);
                }
            }
        }
        
        public void embaralhar(){
            if(!this.cartas.isEmpty()){
                Collections.shuffle(this.cartas);
            }
            else{
                System.out.println("Não há Deque");
            }
        }

}
