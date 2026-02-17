import java.util.Scanner;

public class ds031 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual será a distancia da viagem? ");
        double km = input.nextDouble();
        
        if(km >= 200.0) {
            System.out.printf("O valor da viagem será R$%.2f", km * 0.45);
        } else {System.out.printf("O valor da viagem ficará R$%.2f", km * 0.50);}
        input.close();
    }
}

