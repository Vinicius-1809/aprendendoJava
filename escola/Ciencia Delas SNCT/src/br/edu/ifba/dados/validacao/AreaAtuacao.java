/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifba.dados.validacao;

/**
 *
 * @author alan
 */

public class AreaAtuacao extends Validacao{

    private String idAreaAtuacao;
    private String nomeArea;
    private String descricao;

    public AreaAtuacao(String idAreaAtuacao, String nomeArea, String descricao) {

        setIdAreaAtuacao(idAreaAtuacao);
        setNomeArea(nomeArea);
        setDescricao(descricao);

        validar();
    }

    @Override
    public void validar() {
        obrigatorio(idAreaAtuacao, "ID da área de atuação");
        obrigatorio(nomeArea, "Nome da área");
        obrigatorio(descricao, "Descrição da área");
    }

    public String getIdAreaAtuacao() {
        return idAreaAtuacao;
    }

    public void setIdAreaAtuacao(String valor) {
        idAreaAtuacao = obrigatorio(valor, "ID da área de atuação");
    }

    public String getNomeArea() {
        return nomeArea;
    }

    public void setNomeArea(String valor) {
        nomeArea = obrigatorio(valor, "Nome da área");
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String valor) {
        descricao = obrigatorio(valor, "Descrição da área");
    }
}
