package POO_LISTAS.Lista6.Questao2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppTurma extends JFrame {
    private Turma turma;
    private JTextArea taRelatorio;

    public AppTurma() {
        setTitle("Gerenciamento de Turma");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Painel de informações iniciais da turma
        JPanel painelTurma = new JPanel(new GridLayout(5, 2, 5, 5));

        JTextField tfDisciplina = new JTextField();
        JTextField tfProfNome = new JTextField();
        JTextField tfProfEmail = new JTextField();

        JComboBox<Titulacao> cbTitulacao = new JComboBox<>(Titulacao.values());
        JComboBox<Turno> cbTurno = new JComboBox<>(Turno.values());

        painelTurma.add(new JLabel("Disciplina:"));
        painelTurma.add(tfDisciplina);
        painelTurma.add(new JLabel("Professor:"));
        painelTurma.add(tfProfNome);
        painelTurma.add(new JLabel("E-mail:"));
        painelTurma.add(tfProfEmail);
        painelTurma.add(new JLabel("Titulação:"));
        painelTurma.add(cbTitulacao);
        painelTurma.add(new JLabel("Turno:"));
        painelTurma.add(cbTurno);

        JButton btnCriarTurma = new JButton("Criar Turma");
        painelTurma.add(btnCriarTurma);

        add(painelTurma, BorderLayout.NORTH);

        // Área de texto para relatório
        taRelatorio = new JTextArea();
        taRelatorio.setEditable(false);
        add(new JScrollPane(taRelatorio), BorderLayout.CENTER);

        // Painel de botões
        JPanel painelBotoes = new JPanel();
        JButton btnIncluir = new JButton("Incluir Aluno");
        JButton btnRelatorio = new JButton("Mostrar Relatório");
        painelBotoes.add(btnIncluir);
        painelBotoes.add(btnRelatorio);
        add(painelBotoes, BorderLayout.SOUTH);

        // Ações
        btnCriarTurma.addActionListener(e -> {
            String disciplina = tfDisciplina.getText();
            String nomeProf = tfProfNome.getText();
            String emailProf = tfProfEmail.getText();
            Titulacao titulacao = (Titulacao) cbTitulacao.getSelectedItem();
            Turno turno = (Turno) cbTurno.getSelectedItem();

            Professor prof = new Professor(nomeProf, emailProf, titulacao);
            turma = new Turma(disciplina, prof, turno);

            JOptionPane.showMessageDialog(this, "Turma criada com sucesso!");
        });

        btnIncluir.addActionListener(e -> incluirAlunoDialog());
        btnRelatorio.addActionListener(e -> mostrarRelatorio());
    }

    private void incluirAlunoDialog() {
        if (turma == null) {
            JOptionPane.showMessageDialog(this, "Crie a turma primeiro!");
            return;
        }

        JTextField tfMatricula = new JTextField();
        JTextField tfNome = new JTextField();
        JTextField tfNotaEnem = new JTextField();

        Object[] campos = {
                "Matrícula:", tfMatricula,
                "Nome:", tfNome,
                "Nota ENEM:", tfNotaEnem
        };

        int opcao = JOptionPane.showConfirmDialog(
                this, campos, "Incluir Aluno",
                JOptionPane.OK_CANCEL_OPTION
        );

        if (opcao == JOptionPane.OK_OPTION) {
            try {
                int matricula = Integer.parseInt(tfMatricula.getText());
                String nome = tfNome.getText();
                double nota = Double.parseDouble(tfNotaEnem.getText());

                turma.incluirAluno(new Aluno(matricula, nome, nota));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Erro: matrícula e nota precisam ser numéricos!");
            }
        }
    }

    private void mostrarRelatorio() {
        if (turma == null) {
            JOptionPane.showMessageDialog(this, "Crie a turma primeiro!");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(turma.toString()).append("\n\n");
        sb.append("Alunos:\n");
        for (Aluno a : turma.getAlunos()) {
            sb.append(" - ").append(a.toString()).append("\n");
        }
        Aluno melhor = turma.obterAlunoMelhorNotaEnem();
        if (melhor != null) {
            sb.append("\nAluno com melhor nota no ENEM: ").append(melhor.toString());
        }
        taRelatorio.setText(sb.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AppTurma().setVisible(true);
        });
    }
}
