package POO_LISTAS.Lista1.Questao1;

public class App {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.peso = 50; 
        p.altura = 1.75; 
        p.nome = "João";

        System.out.println("O IMC de " + p.nome +  " é: " + p.calcularIMC());

        if (p.calcularIMC() < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (p.calcularIMC() >= 18.5 && p.calcularIMC() < 24.9) {
            System.out.println("Peso normal");
        } else if (p.calcularIMC() >= 25 && p.calcularIMC() < 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}
