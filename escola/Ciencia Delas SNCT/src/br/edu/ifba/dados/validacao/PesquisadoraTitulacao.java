/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifba.dados.validacao;

/**
 *
 * @author alan
 */

public class PesquisadoraTitulacao extends Validacao{

    private String idPesquisadoraTitulacao;
    private String idPesquisadora;
    private String idTitulacao;
    private String nomeCurso;
    private String idInstituicao;
    private String anoConclusao;

    public PesquisadoraTitulacao(String idPesquisadoraTitulacao, String idPesquisadora, String idTitulacao, String nomeCurso, String idInstituicao, String anoConclusao) {

        setIdPesquisadoraTitulacao(idPesquisadoraTitulacao);
        setIdPesquisadora(idPesquisadora);
        setIdTitulacao(idTitulacao);
        setNomeCurso(nomeCurso);
        setIdInstituicao(idInstituicao);
        setAnoConclusao(anoConclusao);

        validar();
    }

    @Override
    public void validar() {
        obrigatorio(idPesquisadoraTitulacao, "ID do vínculo pesquisadora-titulação");
        obrigatorio(idPesquisadora, "ID da pesquisadora");
        obrigatorio(idTitulacao, "ID da titulação");
        obrigatorio(nomeCurso, "Nome do curso");
        obrigatorio(idInstituicao, "ID da instituição");

        if (anoConclusao != null &&! anoConclusao.trim().isEmpty()) {
            throw new IllegalArgumentException("Ano de conclusão nao pode ser nulo.");
        }
    }

    public String getIdPesquisadoraTitulacao() {
        return idPesquisadoraTitulacao;
    }

    public void setIdPesquisadoraTitulacao(String valor) {
        idPesquisadoraTitulacao = obrigatorio(valor, "ID do vínculo pesquisadora-titulação");
    }

    public String getIdPesquisadora() {
        return idPesquisadora;
    }

    public void setIdPesquisadora(String valor) {
        idPesquisadora = obrigatorio(valor, "ID da pesquisadora");
    }

    public String getIdTitulacao() {
        return idTitulacao;
    }

    public void setIdTitulacao(String valor) {
        idTitulacao = obrigatorio(valor, "ID da titulação");
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String valor) {
        nomeCurso = obrigatorio(valor, "Nome do curso");
    }

    public String getIdInstituicao() {
        return idInstituicao;
    }

    public void setIdInstituicao(String valor) {
        idInstituicao = obrigatorio(valor, "ID da instituição");
    }

    public String getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(String valor) {
        anoConclusao = opcional(valor);
    }
}
