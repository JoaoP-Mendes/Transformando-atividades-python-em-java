import java.util.Random;
import java.util.Scanner;

public class ds028 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Iniciando jogo de adivinhação");

        int computador = random.nextInt(6);
        System.out.print("Faça seu lance: ");
        int jogador = input.nextInt();
        int contador = 0;
        
        while (jogador != computador) {
            System.out.print("Errou, tente novamente: ");
            contador ++;
            jogador = input.nextInt();

            
        }
        System.out.printf("Parabens, você acertou! Maquina %d jogador %d ", computador, jogador);
        System.out.printf("Foram necessarias %d tentativas", contador);
        input.close();
    }
}
