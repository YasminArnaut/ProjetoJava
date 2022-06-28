package Testes;
//Herança
public class Coordenador extends Pessoa {
        private String cursoCoordenador;
        public Coordenador(String nome, int matricula, String cursoCoordenador)
        {
                super(nome, matricula);
                this.cursoCoordenador = cursoCoordenador;
        }

        public String getCursoCoordenador() {
                return cursoCoordenador;
        }

        public void setCursoCoordenador(String cursoCoordenador) {
                this.cursoCoordenador = cursoCoordenador;
        }
}
