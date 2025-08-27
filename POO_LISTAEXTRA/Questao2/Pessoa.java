package Questao2;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }

    public String setNome(String nome) {
        if (nome == null || nome.isEmpty()|| nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser nulo,branco ou vazio.");
        }  else {
            this.nome = nome;
            return nome;
        }
        
    }
    public int setIdade(int idade) {
        if (idade < 1 || idade > 130) {
            throw new IllegalArgumentException("Idade não pode ser menor que 1 ou maior que 130.");
        }else {
             this.idade = idade;
             return idade;
        }
    }
    public double setPeso(double peso) {
        if (peso < 1 || peso > 500) {
            throw new IllegalArgumentException("Peso não pode ser menor que 1 ou maior que 500.");
        }else {
            this.peso = peso;
            return peso;    
        }
       
    }
    public double setAltura(double altura) {
        if (altura < 0.5 || altura > 3) {
            throw new IllegalArgumentException("Altura não pode ser menor que 0.5 ou maior que 3.");
        }else {
            this.altura = altura;
            return altura;
        }
    
    }


    
}
