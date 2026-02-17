import java.util.Scanner;

public class ds026 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = input.next().toLowerCase();
        System.out.print("\nQual letra gostaria de procurar? ");
        String teste = input.next();
        char letra = teste.charAt(0);

        int contador = 0;
        int primeirocaractere = frase.indexOf("a");
        int ultimoCaractere =  frase.lastIndexOf("a");


        for(int i = 0; i < frase.length();i++) {
            if (frase.charAt(i) == letra) {
                contador ++;
            }
        }
        System.out.printf("Existem %d %s na frase.",  contador, letra);
        System.out.printf("\nO primeiro %s aparece na posicação %d",letra, primeirocaractere + 1);
        System.out.printf("\nO ultimo %s aparece na posição %d", letra, ultimoCaractere + 1);
        input.close();
        
    }
}
