
package exercicio05;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio05 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cidades = new ArrayList<>();

        cidades.add("Porto Alegre");
        cidades.add("São Paulo");
        cidades.add("Rio");
        cidades.add("Curitiba");
        cidades.add("Florianópolis");

        System.out.println(cidades);

        System.out.print("Cidade a substituir: ");
        String antiga = sc.nextLine();

        System.out.print("Nova cidade: ");
        String nova = sc.nextLine();

        int index = cidades.indexOf(antiga);

        if (index != -1) {
            cidades.set(index, nova);
        }

        System.out.println(cidades);
    }
}
