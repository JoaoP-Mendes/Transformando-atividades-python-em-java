import java.util.Scanner;

public class ds013 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o salário do funcinário: \nR$");
        double salario = input.nextDouble();

        double aumento = salario * 10 / 100;
        double novoSalario = salario + aumento;

        System.out.printf("\nO salário do funcionário teve um aumento de R$%.2f \nAntigo salário: R$%.2f\nNovo salário: R$%.2f",
           aumento, salario, novoSalario 
        );
        input.close();
    }
}
