package Questao4;

public class App3 {
    public static void incrementarIdade(Pessoa p) {
        p.setIdade(p.getIdade() + 5); // altera o próprio objeto
        System.out.println("Dentro da função incrementarIdade: " + p.getIdade());
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 15, 60.0, 1.70);

        System.out.println("Antes do incremento: " + p1.getIdade());

        incrementarIdade(p1);

        System.out.println("Depois do incremento: " + p1.getIdade());
    }
    
}
