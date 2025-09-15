package POO_LISTAS.Lista6.Questao1;

public class Professor {
    private String nome;
    private String email;
    private Titulacao titulacao;

    public Professor(String nome, String email, Titulacao titulacao) {
        this.nome = nome;
        this.email = email;
        this.titulacao = titulacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Titulacao getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return nome + " (" + titulacao + ")";
    }
}
