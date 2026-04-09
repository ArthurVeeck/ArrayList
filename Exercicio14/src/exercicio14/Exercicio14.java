
package exercicio14;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio14 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        int op;

        do {
            System.out.println("1-Adicionar\n2-Remover\n3-Listar\n0-Sair");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    tarefas.add(sc.nextLine());
                    break;
                case 2:
                    tarefas.remove(sc.nextLine());
                    break;
                case 3:
                    System.out.println(tarefas);
                    break;
            }
        } while (op != 0);
    }
}
