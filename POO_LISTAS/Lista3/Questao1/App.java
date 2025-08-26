package POO_LISTAS.Lista3.Questao1;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
           Funcionario f1 = new Funcionario();
        System.out.print("Digite o nome do funcionário: ");
        f1.setNome(scanner.nextLine());
        System.out.print("Digite o salário do funcionário: ");
        f1.setSalario(scanner.nextDouble());
        System.out.printf("Funcionário: %s | IRPF: R$ %.2f%n", f1.getNome(), f1.calcularIrpf());
        scanner.close();
    }


}