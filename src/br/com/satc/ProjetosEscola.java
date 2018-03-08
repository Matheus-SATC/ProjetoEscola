/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import Pessoa.Disciplina;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author giulia.157217
 */
public class ProjetosEscola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
            String nome;
            String departamento;
            char status;
            
            nome = JOptionPane.showInputDialog("informe o nome da disciplina: ");
            departamento = JOptionPane.showInputDialog("Informe o departamento: ");
            status = JOptionPane.showInputDialog("Informe o status: ").charAt(0);
            Disciplina escola = new Disciplina(nome, departamento, status);
            
            String nome2;
            String rg;
            String cpf;
            Date dataNascimento;
            int cargaHoraria;
            float valorHora;
            
            nome2 = JOptionPane.showInputDialog("Iforme o nome do professor: ");
            rg = JOptionPane.showInputDialog("Informe o rg do professor: ");
            cpf = JOptionPane.showInputDialog("Informe o rg do professor: ");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
            dataNascimento = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento do professor: "));
            cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horaria: "));
            valorHora = Float.compare(JOption.Pane.showInputDialog ("Informe o valor da hora"));
            Professor curso = new Professor(nome2, rg, cpf, dataNascimento, cargaHoraria, valorHora);
   
     
     

            
