package Questao3;

public class App2 {

    
    public static void incrementarInteiro(int inteiro) {
        inteiro = inteiro + 10; 
        System.out.println("Dentro da função incrementarInteiro: " + inteiro);
    }

    public static void main(String[] args) {
        int numero = 20; 
        System.out.println("Antes da chamada da função: " + numero);

        incrementarInteiro(numero); 

        System.out.println("Depois da chamada da função: " + numero);
    }
}

/* Resposta à pergunta

 O conteúdo da variável não mudou após a chamada da função.

Justificativa:
Em Java, variáveis de tipos primitivos (int, double, char, etc.) são passadas por valor, ou seja, o método incrementarInteiro recebeu apenas uma cópia da variável numero.
Quando a função somou 10, modificou somente a cópia interna, não o valor original.

Se quisermos que a alteração seja refletida fora do método, precisaríamos:

Usar um objeto (por exemplo, Integer dentro de uma classe própria).

Ou retornar o novo valor e atualizar a variável com o retorno. */