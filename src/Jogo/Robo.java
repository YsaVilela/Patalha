package Jogo;

import java.util.List;

public class Robo extends Participante{

	public Robo(List<Pato> patos) {
		super(patos);
	}

	// Recebe qual modalidade deve ser analisada e qual o valor do pato escolhido pelo adversario e busca e retorna um que possa ganhar do jogador
	public Pato escolherPato(Modalidade modalidade, int valorAdversario) {
	    while (valorAdversario >= 0) {
	        for (Pato pato : super.getPatos()) {
	            if (pato.consultarPorModalidade(modalidade) > valorAdversario) {
	                System.out.println("\nPato escolhido pelo robo:");
	                pato.exibirPato();
	                return pato;
	            }
	        }
	        valorAdversario--; 
	    }

	    System.out.println("Pato não encontrado!");
	    return null;
	}

}
