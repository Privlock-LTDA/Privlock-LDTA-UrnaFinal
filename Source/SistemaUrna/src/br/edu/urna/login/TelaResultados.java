/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.urna.login;

import br.edu.telas.GerenciadorDeVotos; // Importação da classe GerenciadorDeVotos
import br.edu.telas.Voto; // Caso precise acessar o Voto também
import javax.swing.*;
import java.awt.*;

public class TelaResultados extends JFrame {

    private JTextArea jTextAreaResultados;

    // Construtor da tela de resultados
    public TelaResultados() {
        initComponents();
        exibirResultados();
    }

    // Inicialização dos componentes da interface gráfica
    private void initComponents() {
        setTitle("Resultados da Votação");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Criação do JTextArea para exibição dos resultados
        jTextAreaResultados = new JTextArea();
        jTextAreaResultados.setEditable(false); // Não permite edição
        jTextAreaResultados.setFont(new Font("Arial", Font.PLAIN, 14));
        jTextAreaResultados.setLineWrap(true);
        jTextAreaResultados.setWrapStyleWord(true);

        // Adiciona o JTextArea dentro de um JScrollPane para rolagem
        JScrollPane jScrollPane = new JScrollPane(jTextAreaResultados);
        add(jScrollPane, BorderLayout.CENTER);

        // Botão para fechar a tela
        JButton btnFechar = new JButton("Fechar");
        btnFechar.addActionListener(e -> dispose()); // Fecha a janela
        add(btnFechar, BorderLayout.SOUTH);

        // Configura o tamanho da janela
        setSize(400, 300);
        setLocationRelativeTo(null); // Centraliza a tela
    }

    // Método que exibe os resultados na tela
    private void exibirResultados() {
        StringBuilder resultados = new StringBuilder();

        // Acessa a lista estática de votos da classe GerenciadorDeVotos
        for (Voto voto : GerenciadorDeVotos.getVotos()) {
            resultados.append("Candidato: ").append(voto.getNomeCandidato())
                    .append(" | Número: ").append(voto.getNumeroCandidato())
                    .append(" | Eleitor: ").append(voto.getNomeEleitor())
                    .append("\n");
        }

        // Coloca os resultados no JTextArea
        jTextAreaResultados.setText(resultados.toString());
    }
}
