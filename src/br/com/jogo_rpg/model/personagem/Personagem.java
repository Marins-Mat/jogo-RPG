package br.com.jogo_rpg.model.personagem;

import br.com.jogo_rpg.model.classe.Classe;
import br.com.jogo_rpg.model.raca.Raca;

public class Personagem {
    private int vida;
    private int dano;
    private Raca raca;
    private Classe classe;

    public Personagem(Raca raca, Classe classe) {
        this.raca = raca;
        this.classe = classe;
    }

    public int getVida() {
        return vida;
    }

    public int getDano() {
        return dano;
    }

    public Raca getRaca() {
        return raca;
    }

    public Classe getClasse() {
        return classe;
    }
}
