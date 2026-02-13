import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Collections;

public class ds020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        for(var rep = 1;rep <= 5; rep++){
            System.out.printf("Adicione o %dº nome na lista: ", rep);
            lista.add(input.next());

        }
        Collections.shuffle(lista);
        System.out.print(lista);
        input.close(); 
    }
}
