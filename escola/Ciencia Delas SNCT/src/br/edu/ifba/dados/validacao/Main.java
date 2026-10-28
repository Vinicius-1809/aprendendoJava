/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifba.dados.validacao;

/**
 *
 * @author alan
 */


public class Main{

    public static void main(String[] args) {

        try {
            Validacao registro = new Pesquisadora("dejshfejkshfuioshfo", "Marie Curie", null, null, "Pesquisadora", "I001", null);

            registro.validar();

            System.out.println("Pesquisadora validada com sucesso!");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
