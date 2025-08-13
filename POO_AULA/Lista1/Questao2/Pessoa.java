package POO_AULA.Lista1.Questao2;

public class Pessoa {
      double altura;
      double peso;
      String nome;
      
      public double calcularIMC() {
            return peso / (altura * altura);
      }
}
