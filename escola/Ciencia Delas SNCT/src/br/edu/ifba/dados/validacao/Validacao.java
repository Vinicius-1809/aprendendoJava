/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifba.dados.validacao;

/**
 *
 * @author alan
 */
public abstract class Validacao {
    
    
    public abstract void validar();
    
    
        protected String obrigatorio(String valor, String campo) {
        
        if (valor == null || valor.trim().isEmpty()){
            throw new IllegalArgumentException(campo + " não pode ser nulo ou vazio." );
        }
        return valor.trim();
    }

    protected String opcional(String valor) {
        if (valor == null || valor.trim().isEmpty()){
            return null;
        }
        return valor.trim();
    }
    
    
    
}
