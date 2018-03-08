/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoa;

import java.util.Date;

/**
 *
 * @author giulia.157217
 */
public class Professor extends Pessoas {
    private int cargaHoraria;
    private float ValorHora;
    private float salario;

    public Professor(int cargaHoraria, float ValorHora, String nome, String rg, String cpf, Date dataNascimento) {
        super(nome, rg, cpf, dataNascimento);
        this.cargaHoraria = cargaHoraria;
        this.ValorHora = ValorHora;
        
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getValorHora() {
        return ValorHora;
    }

    public void setValorHora(float ValorHora) {
        this.ValorHora = ValorHora;
    }
    
    public float calcSalario(float valorHora, int cargaHoraria) { 
  
    return ValorHora * cargaHoraria;
       
    
}
}
