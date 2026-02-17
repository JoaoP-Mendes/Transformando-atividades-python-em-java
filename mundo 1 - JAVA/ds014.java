import java.util.Scanner;

public class ds014 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Coloque a temperatura em °C: ");
        double graus = input.nextDouble();
        double Fare = 9 * graus / 5 + 32;

        System.out.printf("A temperatura em %.1fºC corresponde a %.1fºf", graus, Fare);
        input.close();
    }
}
