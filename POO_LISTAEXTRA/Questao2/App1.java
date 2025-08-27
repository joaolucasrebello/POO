package Questao2;

import javax.swing.JOptionPane;

public class App1 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(
            JOptionPane.showInputDialog("Digite o nome:"),
            Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:")),
            Double.parseDouble(JOptionPane.showInputDialog("Digite o peso:")),
            Double.parseDouble(JOptionPane.showInputDialog("Digite a altura:"))
        );

        JOptionPane.showMessageDialog(null, 
            "Nome: " + p1.getNome() +
            "\nIdade: " + p1.getIdade() +
            "\nPeso: " + p1.getPeso() +
            "\nAltura: " + p1.getAltura()
        ); 
    }
}
