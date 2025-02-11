/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.telas;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeVotos {
    private List<Voto> votos;

    public GerenciadorDeVotos() {
        this.votos = new ArrayList<>();
    }

    public void adicionarVoto(Voto voto) {
        votos.add(voto);
    }

    public List<Voto> getVotos() {
        return votos;
    }

    // Exibir os votos de forma organizada
    public String exibirResultados() {
        StringBuilder resultados = new StringBuilder();
        for (Voto voto : votos) {
            resultados.append("Candidato: ").append(voto.getNomeCandidato())
                    .append(" | Número: ").append(voto.getNumeroCandidato())
                    .append(" | Eleitor: ").append(voto.getNomeEleitor())
                    .append("\n");
        }
        return resultados.toString();
    }
}
