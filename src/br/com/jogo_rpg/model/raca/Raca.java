package br.com.jogo_rpg.model.raca;

public abstract class Raca {
    private int vidaBase;
    private int danoBase;

    private String descricao;

    public Raca(int vidaBase, int danoBase) {
        this.vidaBase = vidaBase;
        this.danoBase = danoBase;
    }

    public String getDescricao() {
        return descricao;
    }


}
