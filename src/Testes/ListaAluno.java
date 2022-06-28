package Testes;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
    public static void main(String args[])
    {
        Set<Aluno> conjunto = new HashSet<Aluno>();
        Aluno a = new Aluno("João da Silva", "Java", 6.2);
        Aluno b = new Aluno("Renata Oliveira", "Linux", 7.5);
        Aluno c = new Aluno("Bianca Silveira", "SO", 8.0);
        Aluno d = new Aluno("Kauan Santos", "Internet", 5.5);

        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);

        System.out.println(conjunto);
    }
}
