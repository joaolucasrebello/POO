package POO_AULA.Lista1.Questao3;

public class Pessoa {
       double altura;
      double peso;
      String nome;
      
      public double calcularIMC() {
            return peso / (altura * altura);
      }
}
