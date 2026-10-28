/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifba.dados.validacao;

/**
 *
 * @author alan
 */



public class Pesquisadora extends Validacao {

    private String idPesquisadora;
    private String nomeCompleto;
    private String orcid;
    private String emailPesq;
    private String tipoPerfil;
    private String idInstituicao;
    private String curriculoLattes;

    public Pesquisadora(String idPesquisadora, String nomeCompleto, String orcid, String emailPesq, String tipoPerfil, String idInstituicao, String curriculoLattes) {

        setIdPesquisadora(idPesquisadora);
        setNomeCompleto(nomeCompleto);
        setOrcid(orcid);
        setEmailPesq(emailPesq);
        setTipoPerfil(tipoPerfil);
        setIdInstituicao(idInstituicao);
        setCurriculoLattes(curriculoLattes);

        validar();
    }

    @Override
    public void validar() {
        obrigatorio(idPesquisadora, "ID da pesquisadora");
        obrigatorio(nomeCompleto, "Nome completo");
        obrigatorio(tipoPerfil, "Tipo de perfil");
        obrigatorio(idInstituicao, "ID da instituição");

        if (orcid != null && orcid.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "ORCID inválido. não pode ser nulo.");
        }

        if (emailPesq == null || emailPesq.trim().isEmpty() || !emailPesq.contains("@")) {
            throw new IllegalArgumentException("E-mail da pesquisadora inválido exemplo: pesquisadora@gmail.oom");
        }
    }

    public String getIdPesquisadora() {
        return idPesquisadora;
    }

    public void setIdPesquisadora(String idPesquisadora) {
        this.idPesquisadora =
                obrigatorio(idPesquisadora, "ID da pesquisadora");
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = obrigatorio(nomeCompleto, "Nome completo");
    }

    public String getOrcid() {
        return orcid;
    }

    public void setOrcid(String orcid) {
        this.orcid = opcional(orcid);
    }

    public String getEmailPesq() {
        return emailPesq;
    }

    public void setEmailPesq(String emailPesq) {
        this.emailPesq = opcional(emailPesq);
    }

    public String getTipoPerfil() {
        return tipoPerfil;
    }

    public void setTipoPerfil(String tipoPerfil) {
        this.tipoPerfil = obrigatorio(tipoPerfil, "Tipo de perfil");
    }

    public String getIdInstituicao() {
        return idInstituicao;
    }

    public void setIdInstituicao(String idInstituicao) {
        this.idInstituicao =
                obrigatorio(idInstituicao, "ID da instituição");
    }

    public String getCurriculoLattes() {
        return curriculoLattes;
    }

    public void setCurriculoLattes(String curriculoLattes) {
        this.curriculoLattes = opcional(curriculoLattes);
    }
}
