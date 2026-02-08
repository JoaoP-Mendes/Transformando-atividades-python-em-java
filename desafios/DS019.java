import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DS019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        Random random = new Random();

        System.out.print("Coloque um nome da lista: ");
        lista.add(input.next());
        
        System.out.print("Coloque um nome da lista: ");
        lista.add(input.next());

        System.out.print("Coloque um nome da lista: ");
        lista.add(input.next());

        System.out.print("Coloque um nome da lista: ");
        lista.add(input.next());

        System.out.print("Coloque um nome da lista: ");
        lista.add(input.next());

        int indiceSorteado = random.nextInt(lista.size());
        String nomeSorteado = lista.get(indiceSorteado);

        System.out.println("Nome sorteado: " + nomeSorteado);
        input.close();
    }
}
