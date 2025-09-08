package POO_LISTAS.Lista1.Questao3;

import java.util.Scanner;

public class App {
      public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           Pessoa p1 = new Pessoa();
            p1.nome = "Pessoa 1";
                  System.out.print("Digite a altura (em metros): ");
                  p1.altura = scanner.nextDouble();
                  scanner.nextLine();
                  System.out.print("Digite o peso (em kg): ");
                  p1.peso = scanner.nextDouble();
                  scanner.nextLine();
                  
                  Pessoa p2 = new Pessoa();
                  p2.nome = "Pessoa 2";
                  System.out.print("Digite a altura (em metros): ");
                  p2.altura = scanner.nextDouble();
                  scanner.nextLine();
                  System.out.print("Digite o peso (em kg): ");
                  p2.peso = scanner.nextDouble();
                  scanner.nextLine();

                  Pessoa p3 = new Pessoa();
                  p3.nome = "Pessoa 3";
                  System.out.print("Digite a altura (em metros): ");
                  p3.altura = scanner.nextDouble();
                  scanner.nextLine();
                  System.out.print("Digite o peso (em kg): ");
                  p3.peso = scanner.nextDouble();
                  scanner.nextLine();
                  System.out.printf("O IMC da " + p1.nome + " é: %.2f\n", p1.calcularIMC());
                  System.out.printf("O IMC da " + p2.nome + " é: %.2f\n", p2.calcularIMC());
                  System.out.printf("O IMC da " + p3.nome + " é: %.2f\n", p3.calcularIMC());

             scanner.close();
      }
      
}

