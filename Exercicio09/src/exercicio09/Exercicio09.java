
package exercicio09;

import java.util.ArrayList;


public class Exercicio09 {

    
    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("Ana");
        lista1.add("João");

        ArrayList<String> lista2 = new ArrayList<>(lista1);

        System.out.println(lista1);
        System.out.println(lista2);
    }
}
