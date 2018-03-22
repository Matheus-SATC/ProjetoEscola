/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import Pessoa.Aluno;
import Pessoa.Disciplina;
import Pessoa.Professor;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
    
int escMenu=0;
ArrayList<Disciplina>materias= new ArrayList<>();
ArrayList<Aluno>estudantes= new ArrayList<>();
ArrayList<Professor>professores= new ArrayList<>();
do{
    
    escMenu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções: \n"
            + "1. Cadastro Disciplinas \n"
            + "2. Cadastro de Alunos \n"
            + "3. Cadastro de Professores \n"
            + "4. Sair "));
    
    switch(escMenu){
        
        case 1: 
            do {
                String nome = JOptionPane.showInputDialog("Qual o nome: ");
                String departamento = JOptionPane.showInputDialog("Qual departamento: ");
                char status = JOptionPane.showInputDialog("Status:").charAt(0);
                materias.add(new Disciplina(nome, departamento, status));
            }while ((JOptionPane.showConfirmDialog(null, "Deseja continuar?")) == 0);
            break;
            
         case 2:{
         
            
           String nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno: ");
           String rgAluno = JOptionPane.showInputDialog("Informe o RG do aluno: ");
           String cpfAluno = JOptionPane.showInputDialog("Informe o CPF do aluno: ");
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
           Date dataNascimentoAluno = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento do aluno: "));  
           int matriculaAluno = Integer.parseInt(JOptionPane.showInputDialog("Informe a matricula: "));
           Date dataMatriculaAluno = sdf.parse(JOptionPane.showInputDialog("Informe a data da matricula: "));
                estudantes.add(new Aluno(matriculaAluno,dataMatriculaAluno,nomeAluno,rgAluno,cpfAluno,dataNascimentoAluno));
            if ((JOptionPane.showConfirmDialog(null, "O aluno já se cadastrou em alguma materia??")) == 0);
            String materiasExistentes = "";
            for(Disciplina materia : materias){
                materiasExistentes += materias.indexOf(materia) + " " + materia.getNome() + "\n";
            }
            do{
                int esc = Integer.parseInt(JOptionPane.showInputDialog(" -- Informe a matéria --  \n" +materiasExistentes));
                estudantes.get(estudantes.size( ) -1).getDisciplina().add(materias.get(esc));
            }while((JOptionPane.showConfirmDialog(null,"Tem outra materia para cadastrar?"))== 0);
                    }
                    
                    
            break;
    
            
          case 3:{
            
             String nomeProfessor = JOptionPane.showInputDialog("Iforme o nome do professor: ");
            String rgProfessor = JOptionPane.showInputDialog("Informe o RG do professor: ");
            String cpfProfessor = JOptionPane.showInputDialog("Informe o CPF do professor: ");
             SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
            Date dataNascimentoProfessor = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento do professor: "));
            int cargaHorariaProfessor = Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horaria: "));
           float valorHoraProfessor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da hora: "));
                professores.add(new Professor(cargaHorariaProfessor,valorHoraProfessor,nomeProfessor,rgProfessor,cpfProfessor,dataNascimentoProfessor));
                   if ((JOptionPane.showConfirmDialog(null, "O professor já se cadastrou em alguma materia??")) == 0);
            String materiaExistentes = "";
            for(Disciplina materia : materias){
                materiaExistentes += materias.indexOf(materia) + " " + materia.getNome() + "\n";
            }
            do{
                int esc = Integer.parseInt(JOptionPane.showInputDialog(" -- Informe a matéria --  \n" +materiaExistentes));
                professores.get(professores.size( ) -1).getDisciplina().add(materias.get(esc));
            }while((JOptionPane.showConfirmDialog(null,"Tem outra materia para cadastrar?"))== 0);
          }
            break;
          
    }
            
    } while (escMenu !=4);


}


}




