import java.util.Scanner;

public class ds012 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Coloque o preço do produto: ");
        double preco = input.nextDouble();
        double desconto = preco * 5 / 100;
        double valorFinal = preco - desconto;

        System.out.printf("\nO preço teve um desconto de R$%.2f de R$%.2f para R$%.2f",desconto, preco, valorFinal);

        /*System.out.printf("\nO preço teve um desconto de 5% de R$%.2f para R$%.2f", preco, desconto); 
        => Não posso usar % na linha do côdigo que dá erro*/
        input.close();
    }
}
//