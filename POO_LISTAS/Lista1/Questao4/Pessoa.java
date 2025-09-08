package POO_LISTAS.Lista1.Questao4;

public class Pessoa {
      double altura;
      double peso;
      String nome;
      
      public double calcularIMC() {
            return peso / (altura * altura);
      }
}
