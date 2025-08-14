package POO_AULA.Lista2.Questao1;

public class App {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setTitular("João");
        conta1.setSaldo(1000.0);    
        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo inicial: " + conta1.getSaldo());
    }
}
