
package exercicio11;

import java.util.ArrayList;
import java.util.Arrays;


public class Exercicio11 {

    
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>(Arrays.asList(1.5, 2.5, 3.0));

        double soma = 0;
        for (double n : lista) {
            soma += n;
        }

        System.out.println("Soma: " + soma);
    }
}
