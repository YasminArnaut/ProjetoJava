package Poo;

public class Nome {
    //Instanciando a pessoa1 do tipo pessoa, passando os tres parametros, para imprimir o nome da pessoa.
    public static void main (String args[]){
        Pessoa pessoa1 = new Pessoa("Maria", "Antonia","Oliveira");
        System.out.println(pessoa1.getNomeCompleto());

    }
}
