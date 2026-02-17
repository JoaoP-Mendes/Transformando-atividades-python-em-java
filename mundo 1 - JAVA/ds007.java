import java.util.Scanner;

public class ds007{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
        System.out.print("Insira a 1° nota do aluno: ");
        double nota1 = input.nextDouble();
        System.out.print("Insira a 2ª nota do aluno: ");
        double nota2 = input.nextDouble();
        double media = (nota1 + nota2) / 2;
        
        System.out.printf("\nA média do aluno é %.1f", media);
        input.close();
    }
}