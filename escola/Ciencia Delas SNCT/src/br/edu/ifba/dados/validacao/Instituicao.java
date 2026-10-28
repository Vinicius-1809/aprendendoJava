/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifba.dados.validacao;

/**
 *
 * @author alan
 */

public class Instituicao extends Validacao{

    private String idInstituicao;
    private String nomeInst;
    private String sigla;
    private String tipoInstituicao;
    private String pais;
    private String estadoProvincia;
    private String cidade;
    private String emailInst;
    private String site;

    public Instituicao(String idInstituicao, String nomeInst, String sigla, String tipoInstituicao, String pais, String estadoProvincia, String cidade, String emailInst, String site) {

        setIdInstituicao(idInstituicao);
        setNomeInst(nomeInst);
        setSigla(sigla);
        setTipoInstituicao(tipoInstituicao);
        setPais(pais);
        setEstadoProvincia(estadoProvincia);
        setCidade(cidade);
        setEmailInst(emailInst);
        setSite(site);

        validar();
    }

    @Override
    public void validar() {
        obrigatorio(idInstituicao, "ID da instituição");
        obrigatorio(nomeInst, "Nome da instituição");
        obrigatorio(tipoInstituicao, "Tipo de instituição");
        obrigatorio(pais, "País");
        obrigatorio(estadoProvincia, "Estado/Província");
        obrigatorio(cidade, "Cidade");

        if (emailInst == null || emailInst.trim().isEmpty() || !emailInst.contains("@")) {
            throw new IllegalArgumentException("E-mail institucional inválido. exemplo de email: instituto@gmail.com");
        }
    }

    public String getIdInstituicao() {
        return idInstituicao;
    }

    public void setIdInstituicao(String valor) {
        idInstituicao = obrigatorio(valor, "ID da instituição");
    }

    public String getNomeInst() {
        return nomeInst;
    }

    public void setNomeInst(String valor) {
        nomeInst = obrigatorio(valor, "Nome da instituição");
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String valor) {
        sigla = opcional(valor);
    }

    public String getTipoInstituicao() {
        return tipoInstituicao;
    }

    public void setTipoInstituicao(String valor) {
        tipoInstituicao = obrigatorio(valor, "Tipo de instituição");
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String valor) {
        pais = obrigatorio(valor, "País");
    }

    public String getEstadoProvincia() {
        return estadoProvincia;
    }

    public void setEstadoProvincia(String valor) {
        estadoProvincia = obrigatorio(valor, "Estado/Província");
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String valor) {
        cidade = obrigatorio(valor, "Cidade");
    }

    public String getEmailInst() {
        return emailInst;
    }

    public void setEmailInst(String valor) {
        emailInst = opcional(valor);
    }

    public String getSite() {
        return site;
    }

    public void setSite(String valor) {
        site = opcional(valor);
    }
}
