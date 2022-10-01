
package com.mycompany.colecoesaula3;


public class Aluno extends Pessoa{
    
    private String matricula;
    
    public Aluno(String nome , String matricula){
        this.setNome(nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return this.getNome()+ " matricula : " + this.matricula; //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    
}
