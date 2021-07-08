package com.erickcred.javacor.D_sobrecargaconstrutores.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Estudante {

    private String nome;
    private String matricula;
    private double[] notas;
    private Date dataMatricula;

    public Estudante(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    public Estudante(String nome, String matricula, String dataMatricula) {
        this(nome, matricula);
        try {
            this.dataMatricula = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(dataMatricula);
        } catch (ParseException pe) {
            Logger.getLogger(Estudante.class.getName()).log(Level.SEVERE, null, pe);
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public Date dataMatricula() {
        return this.dataMatricula;
    }

    private double[] getNotas() {
        return this.notas;
    }
    public void setNotas(double... notas) {
        this.notas = notas;
    }

    public void notas() {
        double media = 0;
        for (double nota : this.notas) {
            System.out.print(nota + ", ");
            media += nota;
        }
        media = media / notas.length;
        System.out.printf("\nMédia: %.2f ", media);
        System.out.println((media >= 6 || media >= 60) ? "Aprovado" : "Reprovado");
    }

    public void estudanteDados() {
        System.out.print(
            "Nome: " + getNome() + " - Matricula: " + getMatricula() + " - Data Matricula: " + dataMatricula()
            +"\nNotas: "
        );
        notas();
    }
}
