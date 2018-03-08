/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoa;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author giulia.157217
 */
public class Aluno extends Pessoas  {
    private int matricula;
    private Date dataMatricula;
    
   ArrayList<Disciplina> Disciplina = new ArrayList<Disciplina>();

    public Aluno(int matricula, Date dataMatricula, String nome, String rg, String cpf, Date dataNascimento) {
        super(nome, rg, cpf, dataNascimento);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
        
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> Disciplina) {
        this.Disciplina = Disciplina;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", dataMatricula=" + dataMatricula + ", Disciplina=" + Disciplina + '}';
    }

   
    }

  
    

