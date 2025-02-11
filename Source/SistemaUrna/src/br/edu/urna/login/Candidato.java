/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.urna.login;

import java.io.File;

public class Candidato {
    private String nome;
    private String numero;
    private File foto;

    public Candidato(String nome, String numero, File foto) {
        this.nome = nome;
        this.numero = numero;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public File getFoto() {
        return foto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setFoto(File foto) {
        this.foto = foto;
    }

    public void adicionarVoto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int getVotos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
