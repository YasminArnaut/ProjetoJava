package Testes;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
    public static void main(String args[])
    {
        Map<String,Aluno> mapa = new TreeMap<String,Aluno>();
        Aluno a = new Aluno("João da Silva", "Java", 6.2);
        Aluno b = new Aluno("Renata Oliveira", "Linux", 7.5);
        Aluno c = new Aluno("Bianca Silveira", "SO", 8.0);
        Aluno d = new Aluno("Kauan Santos", "Internet", 5.5);

        mapa.put("João da Silva", a);
        mapa.put("Renata Oliveira",b);
        mapa.put("Bianca Silveira",c);
        mapa.put("Kauan Santos",d);

        System.out.println(mapa);
        System.out.println(mapa.get("Renata Oliveira"));

        Collection<Aluno> alunos = mapa.values();
        for(Aluno e:alunos){
            System.out.println(e);
        }
    }
}
