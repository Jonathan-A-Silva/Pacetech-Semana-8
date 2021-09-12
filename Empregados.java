package Semana8;

public class Empregados {

    private String nome;
    private String sobrenome;
    private double salario;

    public Empregados(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public double calcularsalarioanual() {
        double salarioanual = salario * 12;
        return salarioanual;
    }

    public double calcularsalarioanual10porcento() {
        salario = salario * 1.1;
        return calcularsalarioanual();
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getnome() {
        return nome;
    }
//sobrenome

    public void setsobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getsobrenome() {
        return sobrenome;
    }
//salario

    public void setsalario(double salario) {
        if (salario < 0) {
            this.salario = 0;
        } else {
            this.salario = salario;
        }
    }

    public double getsalario() {
        return salario;
    }

}
