
package com.mycompany.colecoesaula3;

import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PrincipalExercicio4 {

    
    public static void main(String[] args) {
        try {
            //Pilha   - Last in First Out
            
            Stack pilha = new Stack();
            
            
            pilha.add("estagio4");
            pilha.add("estagio3");
            pilha.add("estagio2");
            pilha.add("estagio1");
            
            while(!pilha.peek().toString().equalsIgnoreCase("estagio4")){
                Thread.sleep(20000);
            System.out.println(pilha.pop() + "Ejetou");
            }
            
            
            
            System.out.println(pilha.peek());
        } catch (InterruptedException ex) {
            Logger.getLogger(PrincipalExercicio4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
