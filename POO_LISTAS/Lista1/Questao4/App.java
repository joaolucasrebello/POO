package POO_AULA.Lista1.Questao4;

import java.util.Scanner;

public class App {
      public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           Pessoa p1 = new Pessoa();
           System.out.print("Digite o nome da primeira pessoa: ");
             p1.nome = scanner.nextLine();
                  System.out.print("Digite a altura (em metros): ");
                  p1.altura = scanner.nextDouble();
                  scanner.nextLine();
                  System.out.print("Digite o peso (em kg): ");
                  p1.peso = scanner.nextDouble();
                  scanner.nextLine();
                  
                  Pessoa p2 = new Pessoa();
                  System.out.print("Digite o nome da segunda pessoa: ");
                  p2.nome = scanner.nextLine(); 
                  System.out.print("Digite a altura (em metros): ");
                  p2.altura = scanner.nextDouble();
                  scanner.nextLine();
                  System.out.print("Digite o peso (em kg): ");
                  p2.peso = scanner.nextDouble();
                  scanner.nextLine();

                  Pessoa p3 = new Pessoa();
                  System.out.print("Digite o nome da terceira pessoa: ");
                  p3.nome = scanner.nextLine();
                  System.out.print("Digite a altura (em metros): ");
                  p3.altura = scanner.nextDouble();
                  scanner.nextLine();
                  System.out.print("Digite o peso (em kg): ");
                  p3.peso = scanner.nextDouble();
                  scanner.nextLine();
                  System.out.printf("O IMC de " + p3.nome + " é: %.2f\n", p3.calcularIMC());
                  System.out.printf("O IMC de " + p2.nome + " é: %.2f\n", p2.calcularIMC());
                  System.out.printf("O IMC de " + p1.nome + " é: %.2f\n", p1.calcularIMC());

             scanner.close();
      }
}
