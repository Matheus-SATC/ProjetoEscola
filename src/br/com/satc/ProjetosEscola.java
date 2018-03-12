/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import Pessoa.Aluno;
import Pessoa.Disciplina;
import Pessoa.Professor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author giulia.157217
 */
public class ProjetosEscola {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
    
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
            cpf = JOptionPane.showInputDialog("Informe o cpf do professor: ");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
            dataNascimento = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento do professor: "));
            cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horaria: "));
            valorHora = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da hora: "));
            Professor curso = new Professor(cargaHoraria,valorHora,nome2,rg,cpf,dataNascimento);
   
            String nome3;
            String rg3;
            String cpf3;
            Date dataNascimento3;
            int matricula;
            Date dataMatricula;
             
            nome3 = JOptionPane.showInputDialog("Informe o nome do aluno: ");
            rg3 = JOptionPane.showInputDialog("Informe o rg do aluno: ");
            cpf3 = JOptionPane.showInputDialog("Informe o cpf do aluno: ");
            dataNascimento3 = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento do aluno: "));  
            matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matricula: "));
            dataMatricula = sdf.parse(JOptionPane.showInputDialog("Informe a data da matricula: "));
            Aluno colegio = new Aluno(matricula,dataMatricula,nome3,rg3,cpf3,dataNascimento);
           
            JOptionPane.showMessageDialog(null, escola.toString());
            JOptionPane.showMessageDialog(null, curso.toString());
            JOptionPane.showMessageDialog(null, colegio.toString());
    }
    
}