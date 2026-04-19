package br.com.jogo_rpg.model.classe;

public abstract class Classe {
    private int vidaBase;
    private int danoBase;

    private String descricao;

    public Classe(int vidaBase, int danoBase) {
        this.vidaBase = vidaBase;
        this.danoBase = danoBase;
    }

    public String getDescricao() {
        return descricao;
    }
}
