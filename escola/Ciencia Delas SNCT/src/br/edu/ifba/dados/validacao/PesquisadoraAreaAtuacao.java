/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifba.dados.validacao;

/**
 *
 * @author alan
 */

public class PesquisadoraAreaAtuacao extends Validacao{

    private String idPesquisadora;
    private String idAreaAtuacao;

    public PesquisadoraAreaAtuacao(String idPesquisadora, String idAreaAtuacao) {

        setIdPesquisadora(idPesquisadora);
        setIdAreaAtuacao(idAreaAtuacao);

        validar();
    }

    @Override
    public void validar() {
        obrigatorio(idPesquisadora, "ID da pesquisadora");
        obrigatorio(idAreaAtuacao, "ID da área de atuação");
    }

    public String getIdPesquisadora() {
        return idPesquisadora;
    }

    public void setIdPesquisadora(String valor) {
        idPesquisadora = obrigatorio(valor, "ID da pesquisadora");
    }

    public String getIdAreaAtuacao() {
        return idAreaAtuacao;
    }

    public void setIdAreaAtuacao(String valor) {
        idAreaAtuacao = obrigatorio(valor, "ID da área de atuação");
    }
}
