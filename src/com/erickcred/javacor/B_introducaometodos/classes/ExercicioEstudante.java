package com.erickcred.javacor.B_introducaometodos.classes;

public class ExercicioEstudante {
    /**
     * Crie uma classe estudante com os seguintes atributos
     * Nome, Indeda, Notas -> três notas
     * crie um método para imprimir os dados e tirar a média desse aluno, caso a média sejá maior que 6
     * imprimir aprovado, senão reprovado.
     */

    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public ExercicioEstudante() {}

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Deve ser colocada uma idade valida");
            return;
        }
        this.idade = idade;
    }

    private double[] getNotas() {
        return this.notas;
    }
    public void setNotas(double... notas) {
        this.notas = notas;
    }

    private void media() {
        if (this.notas.length == 0) {
            System.out.println("Aluno ainda não tem nota para calculo");
            return;
        }

        double resultadoMedia = 0;
        for (double media : getNotas()) {
            System.out.print(media + ", ");
            resultadoMedia += media;
        }
        double media = resultadoMedia / this.notas.length;

        this.aprovado = media >= 6 || media >= 60;
        System.out.println((getAprovado() ? ("\nAprovado! Média: " + media) : ("\nReprovado! Média: " + media)));
    }

    public boolean getAprovado() {
        return this.aprovado;
    }

    public void dados() {
        System.out.print(
                "Nome: " + getNome()
                +"Idade: " + getIdade()
                +"\nNotas: "
        );
        media();
    }
}
