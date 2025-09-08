package POO_LISTAS.Lista4.Questao1;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        setSalario(salario);
    }

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
        if (salario <= 0) {
            throw new IllegalArgumentException("Salário deve ser maior que Zero");
        }
        this.salario = salario;
    }

    public FaixaIrpf identificarFaixaIrpf() {
        if (salario <= 1903.98) return FaixaIrpf.PRIMEIRA;
        else if (salario <= 2826.65) return FaixaIrpf.SEGUNDA;
        else if (salario <= 3751.05) return FaixaIrpf.TERCEIRA;
        else if (salario <= 4664.68) return FaixaIrpf.QUARTA;
        else return FaixaIrpf.QUINTA;
    }

    public double calcularIrpf() {
        double imposto = 0.0;

        if (salario > 1903.98) {
            double faixa2 = Math.min(salario, 2826.65) - 1903.98;
            imposto += faixa2 * 0.075;
        }
        if (salario > 2826.65) {
            double faixa3 = Math.min(salario, 3751.05) - 2826.65;
            imposto += faixa3 * 0.15;
        }
        if (salario > 3751.05) {
            double faixa4 = Math.min(salario, 4664.68) - 3751.05; 
            imposto += faixa4 * 0.225;
        }
        if (salario > 4664.68) {
            double faixa5 = salario - 4664.68;
            imposto += faixa5 * 0.275;
        }

        return Math.round(imposto * 100.0) / 100.0;
    }
}