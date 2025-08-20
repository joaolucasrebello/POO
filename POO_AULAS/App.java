package POO_AULAS;

import javax.swing.JOptionPane;

import POO_AULAS.JpaneExemplos.Pessoa;

public class App {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        
        Pessoa pessoa = new Pessoa(nome, sobrenome, idade);
        
     

        JOptionPane.showMessageDialog(null, "Pessoa criada com sucesso!");


        JOptionPane.showMessageDialog(null, pessoa.toString());
    }
}
