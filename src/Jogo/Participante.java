package Jogo;

import java.util.List;

public abstract class Participante{
	private List<Pato> patos;
	
	public Participante(List<Pato> patos) {
		 this.patos = patos;
	}
	
	public List<Pato> getPatos() {
		return patos;
	}

	void exibirPatos() {
		System.out.print("\nEssas são seus patos:\n");
		for(int p = 0; p < patos.size(); p++) {
			System.out.println("\n---------- Pato " + (p+1) + "----------" );
			patos.get(p).exibirPato();
		}
	}
	
	void removerPatoJaJogado(Pato pato) {
		patos.remove(patos.indexOf(pato));
	}
}
