package POO_LISTAS.Lista6.Questao2;

import java.util.ArrayList;

public class Turma {
    private String disciplina;
    private Professor professor;
    private Turno turno;
    private ArrayList<Aluno> alunos;

    public Turma(String disciplina, Professor professor, Turno turno) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.turno = turno;
        this.alunos = new ArrayList<>();
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void incluirAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public Aluno obterAlunoMelhorNotaEnem() {
        if (alunos.isEmpty()) return null;
        Aluno melhor = alunos.get(0);
        for (Aluno a : alunos) {
            if (a.getNotaEnem() > melhor.getNotaEnem()) {
                melhor = a;
            }
        }
        return melhor;
    }

    @Override
    public String toString() {
        return "Disciplina: " + disciplina + " - " + professor + " - Turno: " + turno;
    }
}
