package POO_LISTAS.Lista3.Questao2;

public class Funcionario {
    private String nome;
    private double salario;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

       public double calcularIrpf() {
        double imposto = 0.0;

        if (salario > 1903.98) {
            double faixa = Math.min(salario, 2826.65) - 1903.98;
            imposto += faixa * 0.075;
        }
        if (salario > 2826.65) {
            double faixa = Math.min(salario, 3751.05) - 2826.65;
            imposto += faixa * 0.15;
        }
        if (salario > 3751.05) {
            double faixa = Math.min(salario, 4664.68) - 3751.05;
            imposto += faixa * 0.225;
        }
        if (salario > 4664.68) {
            double faixa = salario - 4664.68;
            imposto += faixa * 0.275;
        }

        return imposto;
    }
}
