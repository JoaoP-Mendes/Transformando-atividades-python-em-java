import java.util.Scanner;

public class ds034 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o salário do funcionário R$");
        double salario = input.nextDouble();
        double novoSalario = 0;

        if (salario <= 1250.0) {
             novoSalario = salario + (salario * 15 /100);
        } else {
             novoSalario = salario + (salario * 10 / 100);
        }
        System.out.printf("O funcionário que ganhava R$%.2f passará a ganhar R$%.2f", salario, novoSalario);
        input.close();
    }    
}
