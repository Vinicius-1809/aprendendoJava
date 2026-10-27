/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifba.dados.validacao;

/**
 *
 * @author alan
 */
public class PesquisadoraAreaAtuacao {
    private int idAreaAtuacao;	
    private String nomeArea;	
    private String descricao;

    public int getIdAreaAtuacao() {
        return idAreaAtuacao;
    }

    public void setIdAreaAtuacao(int idAreaAtuacao) {
        this.idAreaAtuacao = idAreaAtuacao;
    }

    public String getNomeArea() {
        return nomeArea;
    }

    public void setNomeArea(String nomeArea) {
        if (nomeArea!=null && nomeArea.trim().isEmpty()) {
            this.nomeArea = nomeArea;            
        } else {
            throw new IllegalArgumentException ("Area Não pode ser vazia");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    

    
    
}
