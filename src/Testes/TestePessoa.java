package Testes;
//Herança
public class TestePessoa {
    public static void main(String args[])
    {
        Pessoa alissa = new Pessoa("Alissa",555);
        Funcionario1 joao = new Funcionario1("João",222,"TI");
        Pessoa maria = new Funcionario1("Maria",333,"Informatica--Desenvolvimento");
        Pessoa antonio = new Coordenador("Antonio",444,"CC");

        System.out.println(alissa.getMatricula());
        System.out.println(joao.getDepartamento());
        System.out.println(maria.getMatricula());
        System.out.println(antonio.getNome());
    }
}
