/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifba.dados.validacao;

/**
 *
 * @author alan
 */

public class Titulacao extends Validacao{

    private String idTitulacao;
    private String nivelTitulacao;
    private String nivelFormacao;
    private String descricao;

    public Titulacao(String idTitulacao, String nivelTitulacao, String nivelFormacao, String descricao) {

        setIdTitulacao(idTitulacao);
        setNivelTitulacao(nivelTitulacao);
        setNivelFormacao(nivelFormacao);
        setDescricao(descricao);

        validar();
    }

    @Override
    public void validar() {
        obrigatorio(idTitulacao, "ID da titulação");
        obrigatorio(nivelTitulacao, "Nível da titulação");
        obrigatorio(nivelFormacao, "Nível de formação");
        obrigatorio(descricao, "Descrição da titulação");
    }

    public String getIdTitulacao() {
        return idTitulacao;
    }

    public void setIdTitulacao(String valor) {
        idTitulacao = obrigatorio(valor, "ID da titulação");
    }

    public String getNivelTitulacao() {
        return nivelTitulacao;
    }

    public void setNivelTitulacao(String valor) {
        nivelTitulacao = obrigatorio(valor, "Nível da titulação");
    }

    public String getNivelFormacao() {
        return nivelFormacao;
    }

    public void setNivelFormacao(String valor) {
        nivelFormacao = obrigatorio(valor, "Nível de formação");
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String valor) {
        descricao = obrigatorio(valor, "Descrição da titulação");
    }
}
