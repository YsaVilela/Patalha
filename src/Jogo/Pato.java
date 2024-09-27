package Jogo;

public class Pato {
	private int beleza;
	private int canto;
	private int voo;
	
	public Pato(int beleza, int canto, int voo) {
		super();
		this.beleza = beleza;
		this.canto = canto;
		this.voo = voo;
	}
	
	// Retorna apenas o valor da modalidade escolhida
    public int consultarPorModalidade(Modalidade modalidade) {
        switch (modalidade) {
            case BELEZA:
                return beleza;
            case CANTO:
                return canto;
            case VOO:
                return voo;
            default:
                throw new IllegalArgumentException("Modalidade inválida!");
        }
    }
    
    // Exibe todos os atributos do pato
    public void exibirPato() {
    	System.out.println("Beleza: " + consultarPorModalidade(Modalidade.BELEZA));
		System.out.println("Canto: " + consultarPorModalidade(Modalidade.CANTO));
		System.out.println("Voô: " + consultarPorModalidade(Modalidade.VOO));
    }
	
}
