package jogodavelha;

/**
 *
 * @author Isaac Belo
 */
public class JV {

    String[][] tabuleiro = {{"1", "2", "3"},
    {"4", "5", "6"},
    {"7", "8", "9"}};

    //Método mostrar tabuleiro
    public void Mostrar() {//------------------------------
        for (int li = 0; li < 3; li++) {
            for (int col = 0; col < tabuleiro.length; col++) {
                System.out.printf(" " + tabuleiro[li][col]);
            }
            System.out.println("\n");
        }

    }//---------------------------------------------

    public boolean Valido(String p) {
        for (int li = 0; li < 3; li++) {
            for (int col = 0; col < tabuleiro.length; col++) {
                if (tabuleiro[li][col].equals(p)) {
                    return true;
                }
            }
        }

        return false;
    } //---------------------------------------------

    public void Jogada(String p, String j) { //p = posição j = jogador
        if (p.equals("1")) {
            tabuleiro[0][0] = j;
        } else if (p.equals("2")) {
            tabuleiro[0][1] = j;
        } else if (p.equals("3")) {
            tabuleiro[0][2] = j;
        } else if (p.equals("4")) {
            tabuleiro[1][0] = j;
        } else if (p.equals("5")) {
            tabuleiro[1][1] = j;
        } else if (p.equals("6")) {
            tabuleiro[1][2] = j;
        } else if (p.equals("7")) {
            tabuleiro[2][0] = j;
        } else if (p.equals("8")) {
            tabuleiro[2][1] = j;
        } else if (p.equals("9")) {
            tabuleiro[2][2] = j;
        }

    } //---------------------------------------------- 

    public String Ganhou(int jogadas) {
        String[] T = new String[8]; // cria posições para a matriz

        String vencedor = "null";

        if (jogadas == 9) {
            vencedor = "EMPATE";
        }

        //Verifica Posição das linhas "xxx" ou "000"
        T[0] = tabuleiro[0][0] + tabuleiro[0][1] + tabuleiro[0][2];
        T[1] = tabuleiro[1][0] + tabuleiro[1][1] + tabuleiro[1][2];
        T[2] = tabuleiro[2][0] + tabuleiro[2][1] + tabuleiro[2][2];

        //Verifica Posição das colunas
        T[3] = tabuleiro[0][0] + tabuleiro[0][1] + tabuleiro[0][2];
        T[4] = tabuleiro[1][0] + tabuleiro[1][1] + tabuleiro[1][2];
        T[5] = tabuleiro[2][0] + tabuleiro[2][1] + tabuleiro[2][2];

        //Verifica diagonais
        T[6] = tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2];
        T[7] = tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0];

        for (int i = 0; i < T.length; i++) {
            if (T[i].equals("XXX")) {
                vencedor = "Jogador 1 ganhou!!!";
            } else if (T[i].equals("000")) {
                vencedor = "Jogador 2 ganhou!!!";
            }
        }

        return vencedor;
    } //--------------------------

}
