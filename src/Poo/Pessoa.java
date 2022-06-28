package Poo;

public class Pessoa {
    //Atributos
    private String primeiroNome;
    private String ultimoNome;
    private String nomesDoMeio;

    //construtor com mesmo nome da classe, passando os paramentros dos construtores
    //associando parametros com atributos, atribuindo parametro pra cada atributo
    public Pessoa(String primeiro, String meio, String ultimo) {
        primeiroNome = primeiro;
        ultimoNome = ultimo;
        nomesDoMeio = meio;
    }
  //metodo criado para concatenar nome, nome do meio e ultimo nome
    public String getNomeCompleto() {
        String nomeCompleto = primeiroNome + " " + nomesDoMeio + " " + ultimoNome;
        return nomeCompleto;
    }

}
