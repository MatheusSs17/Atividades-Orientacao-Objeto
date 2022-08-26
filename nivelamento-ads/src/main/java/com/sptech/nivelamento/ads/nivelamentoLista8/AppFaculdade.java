
package com.sptech.nivelamento.ads.nivelamentoLista8;

public class AppFaculdade {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("01212110", "Dom");
        Aluno a2 = new Aluno("01212111", "Mod");
        Faculdade f1 = new Faculdade("SP");
        
        f1.exibirAlunos();
        f1.matricularAluno(a2);
        f1.matricularAluno(a1);
        f1.exibirAlunos();
        f1.cancelarAluno("01212110");
        f1.exibirAlunos();
        f1.exibirCancelados();
        
        System.out.println(f1);
    }
}
