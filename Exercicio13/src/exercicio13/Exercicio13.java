
package exercicio13;

import java.util.ArrayList;
import java.util.Arrays;


public class Exercicio13 {

    
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(6,7,8,9,10));

        ArrayList<Integer> l3 = new ArrayList<>();
        l3.addAll(l1);
        l3.addAll(l2);

        System.out.println(l3);
    }
}
