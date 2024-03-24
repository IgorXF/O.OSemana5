package att2;

import entidades.Aluno;
import entidades.Telefone;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author igorxf
 */
public class Att2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Aluno> aluno = new ArrayList<>();
        Telefone t1 = new Telefone("32","3737-9888", "trabalho", "vivo");
        Telefone t2 = new Telefone("31","3212-1212", "casa", "tim");
        Aluno a1 = new Aluno("Igor","2024-12", "igor@gmail.com", "Computação");
        aluno.add(a1);
        a1.addTelefone(t1);
        a1.addTelefone(t2);
        
        Telefone t3 = new Telefone("33","3737-9888", "trabalho", "vivo");
        Telefone t4 = new Telefone("32","3212-1212", "casa", "claro");
        Aluno a2 = new Aluno("Mylena","2024-12", "mylena@gmail.com", "Computação");
        aluno.add(a2);
        a2.addTelefone(t3);
        a2.addTelefone(t4);
       
        Telefone t5 = new Telefone("31","3737-9888", "trabalho", "tim");
        Telefone t6 = new Telefone("35","3212-1212", "casa", "claro");
        Aluno a3 = new Aluno("otavio","2024-12", "otavio@gmail.com", "Computação");
        aluno.add(a3);
        a3.addTelefone(t5);
        a3.addTelefone(t6);
                
        Telefone t7 = new Telefone("33","3737-9888", "trabalho", "vivo");
        Telefone t8 = new Telefone("35","3212-1212", "casa", "oi");
        Aluno a4 = new Aluno("victor","2024-12", "victor@gmail.com", "Computação");
        aluno.add(a4);
        a4.addTelefone(t7);
        a4.addTelefone(t8);
        
        Telefone t9 = new Telefone("34","3737-9888", "trabalho", "tim");
        Telefone t10 = new Telefone("35","3212-1212", "casa", "oi");
        Aluno a5 = new Aluno("Karla","2024-12", "Karla@gmail.com", "Computação");
        aluno.add(a5);
        a5.addTelefone(t9);
        a5.addTelefone(t10);
       
        mesmoDDD(aluno);
        mesmaOperadora(aluno);
    }
    
    public static void mesmoDDD(List<Aluno> alunos){
         Map<String, List<Aluno>> dddParaAlunos = new HashMap<>();
         for (Aluno aluno : alunos) {
            for (Telefone telefone : aluno.getTel()) {
                String ddd = telefone.getDDD();
                
                 if (!dddParaAlunos.containsKey(ddd)) {
                    dddParaAlunos.put(ddd, new ArrayList<>());
                 }
                 dddParaAlunos.get(ddd).add(aluno);
           } 
         }
        System.out.println("Alunos agrupados por DDD:");
        dddParaAlunos.entrySet().forEach(entry -> {
        System.out.println("DDD: " + entry.getKey());
        entry.getValue().forEach(aluno -> System.out.println("Nome: " + aluno.getNome()));
        });
    }
    
    
     public static void mesmaOperadora(List<Aluno> alunos) {
        Map<String, List<Aluno>> operadoraDosAlunos = new HashMap<>();

        for (Aluno aluno : alunos) {
            for (Telefone telefone : aluno.getTel()) {
                String operadora = telefone.getOperadora();

                if (!operadoraDosAlunos.containsKey(operadora)) {
                    operadoraDosAlunos.put(operadora, new ArrayList<>());
                }
                operadoraDosAlunos.get(operadora).add(aluno);
            }
        }

       System.out.println("Alunos agrupados por operadora:");
       operadoraDosAlunos.entrySet().forEach(entry -> {
       System.out.println("Operadora: " + entry.getKey());
       entry.getValue().forEach(aluno -> System.out.println("Nome: " + aluno.getNome()));
       });
    }
}
