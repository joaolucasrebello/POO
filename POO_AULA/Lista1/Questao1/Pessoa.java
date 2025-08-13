public class Pessoa {
    double altura;
    double peso;
    String nome;

    public double calcularIMC() {
        return peso / (altura * altura);
    }
}
