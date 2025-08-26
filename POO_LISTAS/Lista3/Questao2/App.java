package POO_LISTAS.Lista3.Questao2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i] = new Funcionario(); // instancia antes de usar os setters

            System.out.printf("Digite o nome do funcionário %d: ", i + 1);
            funcionarios[i].setNome(scanner.nextLine());

            System.out.printf("Digite o salário do funcionário %d: ", i + 1);
            funcionarios[i].setSalario(scanner.nextDouble());
            scanner.nextLine(); // consumir quebra de linha
        }

        System.out.println("\n--- Lista de Funcionários ---");
        for (Funcionario f : funcionarios) {
            System.out.printf("Nome: %s | Salário: R$ %.2f | IRPF: R$ %.2f%n",
                    f.getNome(), f.getSalario(), f.calcularIrpf());
        }

        scanner.close();
    }
}
