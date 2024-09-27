package Jogo;

import java.util.List;

public class Jogador extends Participante{
	
	public Jogador(List<Pato> patos) {
		super(patos);
	}

	// Busca e retorna o pato escolhido pelo jogador
	public Pato escolherPato(int indexPato) {
		Pato patoEscolhido = super.getPatos().get(indexPato);
		System.out.print("\nPato Escolhido: \n");
    	patoEscolhido.exibirPato();
		return patoEscolhido;
	}
	
}
