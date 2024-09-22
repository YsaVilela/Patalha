package Jogo;

public enum Modalidade {
    BELEZA(1),
    CANTO(2),
    VOO(3);

    private final int valor;

    Modalidade(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
