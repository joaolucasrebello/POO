package POO_AULA.Lista2.Questao2;


public class App {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setnumero(1234);
        conta1.setTitular("Kanye");
        conta1.depositar(1000.0);
        conta1.depositar(700.0);
        System.out.println("Saldo de " + conta1.getTitular() + ": " + conta1.getSaldo());
   
        ContaBancaria conta2 = new ContaBancaria();
        conta2.setnumero(5678);
        conta2.setTitular("West");
        conta2.depositar(5000.0);
        System.out.println("Saldo de " + conta2.getTitular() + ": " + conta2.getSaldo());
        conta2.sacar(3000.0);
        System.out.println("Saldo de " + conta2.getTitular() + " após saque: " + conta2.getSaldo());

        conta2.transferir(conta1, 1800.0);
        System.out.println("Saldo de " + conta1.getTitular() + " após transferência: " + conta1.getSaldo());
        System.out.println("Saldo de " + conta2.getTitular() + " após transferência: " + conta2.getSaldo());

        System.out.println("Conta 1 - Titular: " + conta1.getTitular() + ", Número: " + conta1.getNumero() + ", Saldo: " + conta1.getSaldo());
        System.out.println("Conta 2 - Titular: " + conta2.getTitular() + ", Número: " + conta2.getNumero() + ", Saldo: " + conta2.getSaldo());



    }

}