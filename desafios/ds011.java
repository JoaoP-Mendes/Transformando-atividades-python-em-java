import java.util.Scanner;

public class ds011 {
    public static void main(String[]args){  
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a largura da parede: ");
        double largura = input.nextDouble();
        System.out.println("Insira a altura da parede: ");
        double altura = input.nextDouble();
        double area = largura * altura; 

        System.out.printf("Sua parede tem a dimensão de %.2f x %.2f e sua area é de %.2fm2", largura, altura, area);

        double tinta = area / 2;
        System.out.printf("\nPara pintar essa parede será necessário %.2fL de tinta", tinta);

    }
}
