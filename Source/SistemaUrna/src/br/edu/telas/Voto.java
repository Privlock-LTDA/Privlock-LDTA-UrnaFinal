/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.telas;

/**
 *
 * @author Aluno
 */
public class Voto {
    private String numeroCandidato;
    private String nomeCandidato;
    private String nomeEleitor;

    public Voto(String numeroCandidato, String nomeCandidato, String nomeEleitor) {
        this.numeroCandidato = numeroCandidato;
        this.nomeCandidato = nomeCandidato;
        this.nomeEleitor = nomeEleitor;
    }

    public String getNumeroCandidato() {
        return numeroCandidato;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public String getNomeEleitor() {
        return nomeEleitor;
    }

    @Override
    public String toString() {
        return "Voto{" +
                "numeroCandidato='" + numeroCandidato + '\'' +
                ", nomeCandidato='" + nomeCandidato + '\'' +
                ", nomeEleitor='" + nomeEleitor + '\'' +
                '}';
    }
}
