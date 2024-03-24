/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package att3;

import classes.Disciplina;
import entidade.Aluno;
import entidade.Professor;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author igorxf
 */
public class Att3 {
    
    public static void main(String[] args) {
        Professor professor = new Professor("Professor X", "M", 45, "12345678901");
        
        List<Aluno> alunos = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            alunos.add(new Aluno("Aluno " + i, 'M', 20, "cpf" + i, "matricula" + i, 2024));
        }

        Disciplina disciplina = new Disciplina("Matemática", 1, "Segunda-feira 10:00");
        disciplina.setProfessor(professor);
        disciplina.setAlunos(alunos);

        System.out.println(disciplina);
        
        Disciplina copiaDisciplina = new Disciplina(disciplina);

        System.out.println(copiaDisciplina);
    }
}
