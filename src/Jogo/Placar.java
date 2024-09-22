package Jogo;

public class Placar {
	private int pontosJogador;
	private int pontosRobo;
	private int rodada; 
	
	public int getPontosJogador() {
		return pontosJogador;
	}

	public int getPontosRobo() {
		return pontosRobo;
	}
	
	public int getRodada() {
		return rodada;
	}

	void exibirPlacar() {
		System.out.println("\nRodada " + rodada);
		System.out.println("Jogador 1: " + pontosJogador + " pontos");
		System.out.println("Robo: " + pontosRobo + " pontos");
	}
	
	void vericarGanhador(int patoJogador1, int patoRobo) {
		rodada += 1;
		if(patoJogador1 > patoRobo) {
			pontosJogador += 1;
			exibirGanhador("Você");
		}else if(patoJogador1 < patoRobo) {
			pontosRobo += 1;
			exibirGanhador("Robô");
		}else {
			System.out.println("\nDeu empate");
		}
		exibirPlacar();
	}
	
	void exibirGanhador(String ganhador) {
		System.out.println("\n" + ganhador + " ganhou essa rodada!!!");
	}
	
	void finalizarPartida() {
		if(pontosJogador > pontosRobo) {
			System.out.println("\nParabens! Você ganhou!!!");
		} else if (pontosJogador < pontosRobo) {
			System.out.println("\nNão foi dessa vez =( Você perdeu!");
		} else {
			System.out.println("\nDeu empate");
		}
		pontosJogador = 0;
		pontosRobo = 0;
	}
}