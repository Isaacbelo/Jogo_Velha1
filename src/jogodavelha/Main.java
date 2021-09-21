//Fonte: https://www.youtube.com/watch?v=HZSbuHodt1I&t=12s
package jogodavelha;

import java.util.Scanner;
/**
 *
 * @author Isaac Belo
 */
public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        JV jogo = new JV();
        String posicao;
        int valida = 0;  //Valida as jogadas enquanto estiver em 0, fica em loop
        int jogadas = 0; // Conta as jogadas

        //Enquanto for verdadeiro mostra tabuleiro, faz loop do-while, 
        while (true) {//*************************************
            System.out.println(":::::Jogo da Velha:::::");
            jogo.Mostrar();
             
            //Faça enquanto valida for == 0
            do {//inicia jogador 1-----------------------
                System.out.println("Jogador 1 informe uma posição: ");
                posicao = ler.next();//Ler posição
                while (!jogo.Valido(posicao)) {//Enquanto não for válido
                    System.out.println("Jogada Inválida, tente novamente!!!");
                    System.out.println("Jogador 1, informe uma posição: ");
                    posicao = ler.next();
                     valida = 0;
                }
                jogo.Jogada(posicao, "X");
                valida = 1;

            } while (valida == 0);//fim jogador 1 ---------
            
            jogadas ++;
            valida = 0;
            jogo.Mostrar();
         
            if(!jogo.Ganhou(jogadas).equals("null")){
            break;
            }
            //Faça enquanto valida for == 0
            do {//inicia jogador 2-----------------------
                System.out.println("Jogador 2 informe uma posição: ");
                posicao = ler.next();//Ler posição
                while (!jogo.Valido(posicao)) {//Enquanto não for válido
                    System.out.println("Jogada Inválida, tente novamente!!!");
                    System.out.println("Jogador 2, informe uma posição: ");
                    posicao = ler.next();
                     valida = 0;
                }
                jogo.Jogada(posicao, "O");
                valida = 1;

            } while (valida == 0);//fim jogador 2 ---------
            jogadas ++;
            valida = 0;
            jogo.Mostrar();
            
            if(!jogo.Ganhou(jogadas).equals("null")){
            break;
            }

        }//*************************************************
        System.out.println("O "+jogo.Ganhou(jogadas)+ " venceu!");
    }
}
