package Jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Patalha {

	public static void main(String[] args) {
		//Criando patos e distribuindo
		List<Pato> patos = criarPatos();
		List<Pato> patosJogador = new ArrayList<>(patos.subList(10, 20));  
		List<Pato> patosRobo = new ArrayList<>(patos.subList(0, 10));   

		//Criando Robo, Jogador e o Placar para iniciar a partida
        Robo robo = new Robo(patosRobo);
        Jogador jogador = new Jogador(patosJogador);
        Placar placar = new Placar();
        
        System.out.print("Seja Bem Vindo! Vamos Patalhar? \n");

        //Pardida consister em 10 rodadas
        while(placar.getRodada() < 10) {
        	// exibe patos que estão disponiveis para o jogador
            jogador.exibirPatos();
            
            //Apresenta a modalidade e pede que o usuario escolha modalidade e o pato, ao ser feito a escolha é enviado para o robo fazer sua escolha 
            Modalidade modalidade = escolherModalidade();
            Pato patoJogador = escolherPato(jogador);
            Pato patoRobo = robo.escolherPato(modalidade, patoJogador.consultarPorModalidade(modalidade));
            
            //É verificado quem foi o ganhador da rodada
            placar.vericarGanhador(patoJogador.consultarPorModalidade(modalidade), patoRobo.consultarPorModalidade(modalidade));
            
            //Remove os patos já jogados das listas 
            robo.removerPatoJaJogado(patoRobo);
            jogador.removerPatoJaJogado(patoJogador);
            
            // Entre as rodadas deve aparecer a mensagem para dar continuidade na partida
            if(placar.getRodada() < 9) {
                System.out.println("\nPreparado para proxima rodada? Presione qualquer tecla...\n");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();	
            }
        }
        
        // Finalizar partida e exibir placar final e vencedor
        placar.finalizarPartida();

	}
	
	//No console é apresentado a mensagem para escolha do pato, retornando o pato escolhido
	static Pato escolherPato(Jogador jogador) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEscolha seu pato\n");
        int indexPato = (scanner.nextInt() - 1);
        
        if(indexPato <= jogador.getPatos().size()) {
        	return jogador.escolherPato(indexPato);
        }else {
        	System.out.println("Desculpe você não possui esse pato! =( ");
        	System.out.println("Escolha novamente!");
        	escolherPato(jogador);
        	return null;
        }
	}

	//No console é apresentado a mensagem para escolha da modalidade, retornando a modalidade escolhida
	static Modalidade escolherModalidade() {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("\nEscolha a modalidade:\n1- Beleza \n2- Canto \n3- Voo \n");
	    int modalidade = scanner.nextInt();

	    switch (modalidade) {
	    	case 1:
	    		return Modalidade.BELEZA;
	        case 2:
	            return Modalidade.CANTO;
	        case 3:
	            return Modalidade.VOO;
	        default:
	            System.out.println("Modalidade inválida! Tente novamente.");
	        return escolherModalidade(); 
	    }
	 }

	// É instanciado 20 patos com atributos de valores aleatório, retornando uma lista de patos para serem distribuidos
	static List<Pato> criarPatos() {
        List<Pato> patos = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int beleza = random.nextInt(11); 
            int canto = random.nextInt(11); 
            int voo = random.nextInt(11); 
            Pato pato = new Pato(beleza, canto, voo);
            patos.add(pato);
        }
        
        return patos;
	}

}
