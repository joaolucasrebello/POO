package POO_AULA.Lista1.Questao2;

import java.util.Scanner;
public class App {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            Pessoa p1 = new Pessoa();
            System.out.print("Digite o nome: ");
            p1.nome = scanner.nextLine();
            
            System.out.print("Digite a altura (em metros): ");
            p1.altura = scanner.nextDouble();
            
            System.out.print("Digite o peso (em kg): ");
            p1.peso = scanner.nextDouble();
            
            double imc = p1.calcularIMC();
            System.out.printf("O IMC de " + p1.nome + " é: %.2f\n", imc);
                        
            scanner.close();
      }
}
