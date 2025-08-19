package POO_AULA.Lista2.Questao1;

import java.util.Scanner;
public class App{
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[3]; 
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();

            System.out.printf("Digite o nome da %dª pessoa: ", i + 1);
            pessoas[i].setNome(scanner.nextLine());

            System.out.print("Digite a altura (em metros): ");
            pessoas[i].setAltura(scanner.nextDouble()); 
            scanner.nextLine(); 

            System.out.print("Digite o peso (em kg): ");
            pessoas[i].setPeso(scanner.nextDouble());
            scanner.nextLine(); 

      
      }

      System.out.println("IMC das pessoas:");
      for (int i = pessoas.length - 1; i >= 0; i--) {
            double imc = pessoas[i].calcularIMC();
            System.out.printf("%dª pessoa (%s): IMC = %.2f%n", i + 1, pessoas[i].getNome(), imc);
      }
      scanner.close();
      }

}


      
