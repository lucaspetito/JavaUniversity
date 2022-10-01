
package com.mycompany.colecoesaula3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Laboratorio {
    
    private String              identificacao;
    private List<Aluno>         alunos;
    
    
    public Laboratorio(String ident){
        this.identificacao = ident;
        alunos = new ArrayList<>();
    }
    
    public void alocarAlunos(Aluno aluno){
        this.alunos.add(aluno);
    }
    
    public List<Aluno> exibirAlunos(){
        
         return alunos;
    }
    
    
    
    
    
}
