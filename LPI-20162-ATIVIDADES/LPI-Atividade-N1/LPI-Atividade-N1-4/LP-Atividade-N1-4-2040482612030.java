/*------------------------------------------------------------------*
 * Disciplina: Linguagem de Programacao I                           *
 *             Prof. Verissimo                                      *
 *------------------------------------------------------------------*
 * Objetivo do Programa: Simular as jogadas do Xeque Pastor em um    *
 *                       tabuleiro de xadrez usando matriz 8x8.     *
 * Data - 02/09/2026                                                *
 * Autor: Felipe Garcia                                             *
 *------------------------------------------------------------------*/

public class Main {
    // Constantes do Tabuleiro
    private static final int TAMANHO_TABULEIRO = 8;
    private static final String VAZIO = "   ";
    private static final String ORIGEM = " ...";
    public static void main(String[] args) {
        String[][] tabuleiro = new String[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];
        // 1. Estado Inicial
        inicializarTabuleiro(tabuleiro);
        exibirTabuleiro(tabuleiro, "Posicao Incial do tabuleiro");
        // 2. Jogada 1
        // Brancas: e2 -> e4 (Peao do Rei: PB5)
        // Pretas: e7 -> e5 (Peao do Rei: pP5)
        System.out.println("\n====================== Jogada #1 ======================");
        executarMovimento(tabuleiro, 6, 4, 4, 4, "PB5", "-------------Brancas jogam e4-------------");
        executarMovimento(tabuleiro, 1, 4, 3, 4, "pP5", "-------------Pretas jogam e5-------------");
        // 3. Jogada 2
        // Brancas: f1 -> c4 (Bispo do Rei: BB6)
        // Pretas: b8 -> c6 (Cavalo da Dama: cP2)
        System.out.println("\n====================== Jogada #2 ======================");
        executarMovimento(tabuleiro, 7, 5, 4, 2, "BB6", "-------------Brancas jogam Bc4-------------");
        executarMovimento(tabuleiro, 0, 1, 2, 2, "cP2", "-------------Pretas jogam Cc6-------------");
        // 4. Jogada 3
        // Brancas: d1 -> h5 (Dama: DB4)
        // Pretas: g8 -> f6 (Cavalo do Rei: cP7)
        System.out.println("\n====================== Jogada #3 ======================");
        executarMovimento(tabuleiro, 7, 3, 3, 7, "DB4", "-------------Brancas jogam Dh5-------------");
        executarMovimento(tabuleiro, 0, 6, 2, 5, "cP7", "-------------Pretas jogam Cf6-------------");
        // 5. Jogada 4 - Lance Final (Xeque Mate)
        // Brancas capturam Peao em f7: h5 -> f7 (Dxf7#)
        System.out.println("\n================== Jogada #4 (Xeque Mate) ==================");
        executarMovimento(tabuleiro, 3, 7, 1, 5, "DB4", "-------Brancas capturam Peao pP6 em f7 e dão Xeque Mate (Dxf7#)-------");
    }
    /**
     * Preenche a matriz com as pecas nas posicoes iniciais
     */
    private static void inicializarTabuleiro(String[][] tab) {
        // Pecas Pretas (Linha 0 e Linha 1)
        tab[0] = new String[]{"tP1", "cP2", "bP3", "dP4", "rP5", "bP6", "cP7", "tP8"};
        tab[1] = new String[]{"pP1", "pP2", "pP3", "pP4", "pP5", "pP6", "pP7", "pP8"};
        // Casas Vazias (Linhas 2 a 5)
        for (int i = 2; i <= 5; i++) {
            for (int j = 0; j < TAMANHO_TABULEIRO; j++) {
                tab[i][j] = VAZIO;
            }
        }
        // Pecas Brancas (Linha 6 e Linha 7)
        tab[6] = new String[]{"PB1", "PB2", "PB3", "PB4", "PB5", "PB6", "PB7", "PB8"};
        tab[7] = new String[]{"TB1", "CB2", "BB3", "DB4", "RB5", "BB6", "CB7", "TB8"};
    }
    /**
     * Executa o movimento no tabuleiro, marcando a origem e destino
     */
    private static void executarMovimento(String[][] tab, int linOrigem, int colOrigem, int linDestino, int colDestino, String peca, String titulo) {
        tab[linOrigem][colOrigem] = ORIGEM;
        tab[linDestino][colDestino] = peca;
        exibirTabuleiro(tab, titulo);
    
        // Limpa o indicador de origem " ..." para a casa ficar vazia nas proximas exibicoes
        tab[linOrigem][colOrigem] = VAZIO;
    }
    /**
     * Exibe o tabuleiro e os indices no console
     */
    private static void exibirTabuleiro(String[][] tab, String titulo) {
        System.out.println("=================================================");
        System.out.println("          " + titulo);
        System.out.println("=================================================");
        System.out.println("   -a- -b- -c- -d- -e- -f- -g- -h-");

        for (int i = 0; i < TAMANHO_TABULEIRO; i++) {
            int numLinha = TAMANHO_TABULEIRO - i;
            System.out.print(numLinha + " ");
            for (int j = 0; j < TAMANHO_TABULEIRO; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}