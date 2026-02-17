import java.util.Scanner;

public class ds018 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o ângulo que você deseja: ");
        double angulo = input.nextDouble();
        double seno = Math.sin(angulo);
        double cosseno = Math.cos(angulo);
        double tangente = Math.tan(angulo);
        
        System.out.printf("\nO angulo de %.2f tem o SENO de %.2f", angulo, seno);

        System.out.printf("\nO angulo de %.2f tem o COSSENO de %.2f", angulo, cosseno);

        System.out.printf("\nO angulo de %.2f tem a TANGENTE de %.2f", angulo, tangente);
        input.close();
    }
}
