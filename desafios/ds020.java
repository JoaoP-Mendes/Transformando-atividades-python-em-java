import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ds020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        System.out.print("Adicione um nome na lista: ");
        lista.add(input.next());

        System.out.print("Adicione um nome na lista: ");
        lista.add(input.next());

        System.out.print("Adicione um nome na lista: ");
        lista.add(input.next());

        System.out.print("Adicione um nome na lista: ");
        lista.add(input.next());

        System.out.print("Adicione um nome na lista: ");
        lista.add(input.next());

        System.out.print(lista);
        
    }
}
