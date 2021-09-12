
package Semana8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o Primeiro nome da pessoa");
        String nome = leitor.next();

        System.out.println("Digite o Sobrenome da pessoa");
        String sobrenome = leitor.next();

        System.out.println("Digite o salario da pessoa");
        double salario = leitor.nextDouble();

        Empregados empregado = new Empregados(nome, sobrenome, salario);

        System.out.println("empregado:" + empregado.getnome() + " " + empregado.getsobrenome());
        System.out.println("Salario mensal:" + empregado.getsalario());
        System.out.println("Salario anual:" + empregado.calcularsalarioanual());
        System.out.println("Salario anual com 10% de aumento:" + empregado.calcularsalarioanual10porcento());
        System.out.println("Salario mensal com 10% de aumento:" + empregado.getsalario());
    }

}
 