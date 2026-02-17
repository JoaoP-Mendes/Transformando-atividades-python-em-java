import java.util.Scanner;

public class ds008 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Insira uma distância em metros: ");
        double metros = input.nextDouble();

        double km = metros / 1000;
        double hm = metros / 100;
        double dam = metros / 10;
        double dm = metros * 10;
        double cm = metros * 100;
        double mm = metros * 1000;

        System.out.printf("\nA medida de %.2f m corresponde a \n%.3f km\n%.2f hm\n%.1f dam\n%.0f dm\n%.0f cm \n%.0f mm", metros, km, hm, dam, dm, cm, mm);
        input.close();
    }

}
