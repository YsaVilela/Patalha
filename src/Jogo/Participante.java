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
	
	// Exibe a lista de patos que o participante possui
	void exibirPatos() {
		System.out.print("\nEssas são seus patos:\n");
		for(int p = 0; p < patos.size(); p++) {
			System.out.println("\n---------- Pato " + (p+1) + "----------" );
			patos.get(p).exibirPato();
		}
	}
	
	// Remove um pato da lista de patos disponiveis
	void removerPatoJaJogado(Pato pato) {
		patos.remove(patos.indexOf(pato));
	}
	
}
