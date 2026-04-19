import br.com.jogo_rpg.model.jogo.Jogo;

Scanner in = new Scanner(System.in);

Jogo jogo;

void main() {

    boolean running = true;
    while (running) {
        System.out.println("1- Iniciar novo jogo");
        System.out.println("0- Sair");

        var opcEscolhida = in.nextInt();
        switch (opcEscolhida) {
            case 1: jogo = new Jogo();
                    jogo.iniciarJogo();
                        break;
            case 0: running=false;
                        break;
            default: System.out.println("Opcao inválida");
        }
    }

}
