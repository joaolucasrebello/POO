package POO_LISTAS.Lista6.Questao2;

public class Aluno {
    private int matricula;
    private String nome;
    private double notaEnem;

    public Aluno(int matricula, String nome, double notaEnem) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaEnem = notaEnem;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaEnem() {
        return notaEnem;
    }

    public void setNotaEnem(double notaEnem) {
        this.notaEnem = notaEnem;
    }

    @Override
    public String toString() {
        return nome + " (Matrícula: " + matricula + ", ENEM: " + notaEnem + ")";
    }
}
