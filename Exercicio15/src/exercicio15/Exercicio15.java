
package exercicio15;

import java.util.ArrayList;


public class Exercicio15 {

    
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Ana", 8.0));
        alunos.add(new Aluno("Carlos", 7.5));

        double soma = 0;

        for (Aluno a : alunos) {
            System.out.println(a.nome + " - " + a.nota);
            soma += a.nota;
        }

        System.out.println("Média: " + soma / alunos.size());
    }
}
