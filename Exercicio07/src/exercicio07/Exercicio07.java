
package exercicio07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Exercicio07 {

    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5));

        Set<Integer> set = new HashSet<>(lista);
        lista = new ArrayList<>(set);

        System.out.println(lista);
    }
}
