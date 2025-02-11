/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.urna.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;

public class TelaCadastro extends JFrame {
    private final JTextField txtNome;
    private final JTextField txtNumero;
    private final JButton btnCarregarFoto;
    private final JLabel lblFoto;
    private File arquivoFoto;

    private ArrayList<Candidato> candidatos; // Lista de candidatos

    public TelaCadastro() {
        candidatos = new ArrayList<>(); // Inicializa a lista de candidatos

        setTitle("Cadastro de Candidato");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JLabel lblNome = new JLabel("Nome:");
        txtNome = new JTextField(20);
        JLabel lblNumero = new JLabel("Número:");
        txtNumero = new JTextField(10);

        btnCarregarFoto = new JButton("Carregar Foto");
        lblFoto = new JLabel();
        lblFoto.setPreferredSize(new Dimension(200, 200));
        lblFoto.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JButton btnSalvar = new JButton("Salvar");

        add(lblNome);
        add(txtNome);
        add(lblNumero);
        add(txtNumero);
        add(btnCarregarFoto);
        add(lblFoto);
        add(btnSalvar);

        styleBotao(btnCarregarFoto);
        styleBotao(btnSalvar);

        btnCarregarFoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carregarFoto();
            }
        });

        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarCandidato();
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int resposta = JOptionPane.showConfirmDialog(
                        null, 
                        "Você tem certeza que deseja sair?", 
                        "Confirmar", 
                        JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    dispose();
                }
            }
        });
    }

    private void styleBotao(JButton botao) {
        botao.setBackground(new Color(192, 192, 192));
        botao.setForeground(Color.BLACK);
        botao.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        botao.setFocusPainted(false);
        botao.setFont(new Font("Arial", Font.BOLD, 12));

        botao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botao.setBackground(new Color(169, 169, 169));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                botao.setBackground(new Color(192, 192, 192));
            }
        });
    }

    private void carregarFoto() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecione uma foto");
        int resultado = fileChooser.showOpenDialog(null);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            arquivoFoto = fileChooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(arquivoFoto.getPath());
            lblFoto.setIcon(icon);
            lblFoto.setText("");
        }
    }

    private void salvarCandidato() {
        String nome = txtNome.getText();
        String numero = txtNumero.getText();

        if (nome.isEmpty() || numero.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
            return;
        }

        if (arquivoFoto == null) {
            JOptionPane.showMessageDialog(null, "Por favor, carregue uma foto.");
            return;
        }

        // Criar um objeto Candidato e adicionar à lista
        Candidato candidato = new Candidato(nome, numero, arquivoFoto);
        candidatos.add(candidato); // Adiciona o candidato à lista de candidatos

        JOptionPane.showMessageDialog(null, "Candidato " + nome + " com número " + numero + " cadastrado com sucesso!");

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro candidato?", "Cadastro Concluído", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            limparCampos();
        } else {
            voltarParaLogin();
        }
    }

    private void limparCampos() {
        txtNome.setText("");
        txtNumero.setText("");
        lblFoto.setIcon(null);
        arquivoFoto = null;
    }

    private void voltarParaLogin() {
        new TelaLogin().setVisible(true);
        dispose();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaCadastro().setVisible(true));
    }
}
