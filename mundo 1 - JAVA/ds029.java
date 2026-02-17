import java.util.Scanner;

public class ds029 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual a velocidade do carro? ");
        double velocidade = input.nextDouble();

        if(velocidade > 80.0) {
            System.out.print("Multado! Você excedeu o limite permitido de 80KM/h");
            double multa = (velocidade - 80) * 7;
            System.out.printf("\nVocê foi multado no valor de R$%.2f", multa);
        }
        System.out.print("Dirija com seguraça, tenha um bom dia!");
        input.close();
    }
}
