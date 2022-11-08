package com.mycompany.aulathreads;

public class MinhaThread implements Runnable{

    private String nome;
    
    public MinhaThread(String n){
        this.nome = n;
    }
    
    @Override
    public void run() {
        System.out.println(this.nome);
    
    }
    
}
