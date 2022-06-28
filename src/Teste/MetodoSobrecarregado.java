package Teste;

public class MetodoSobrecarregado {
    public void testaMetodosSobrecarregados() {
        System.out.printf("Salario em número inteiro: %d \n", salario(1000));
        System.out.printf("Salario em número inteiro: %f \n", salario(7.500));
    }

    public int salario(int valorInt) {
        System.out.printf("Salario com argumentoInteiro: %d \n", valorInt);
        return valorInt * valorInt;
    }

    public double salario(double valorDouble) {
        System.out.printf("Salario com argumento double: %f \n", valorDouble);
        return valorDouble * valorDouble;

    }

}
