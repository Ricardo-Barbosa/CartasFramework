package br.edu.ifpi.ads.testes;

import br.edu.ifpi.ads.aoo.Carta;
import br.edu.ifpi.ads.aoo.ComportamentoDeque;
import br.edu.ifpi.ads.aoo.Deque;
import br.edu.ifpi.ads.aoo.Naipe;
import br.edu.ifpi.ads.aoo.ValorCarta;

public class TesteBasico {

	public static void main(String[] args) {
		Deque a = new Deque(ComportamentoDeque.FIRST);
		Deque b = new Deque(ComportamentoDeque.LAST);
		
		Carta as = new Carta(Naipe.COPAS, ValorCarta.AS);
		Carta valete = new Carta(Naipe.COPAS, ValorCarta.VALETE);
		
                b.gerarDeque();
                b.exibeDeque();
                System.out.println("\nEmbaralhado\n");
                b.embaralhar();
                b.exibeDeque();
                
                
		
	}
}
