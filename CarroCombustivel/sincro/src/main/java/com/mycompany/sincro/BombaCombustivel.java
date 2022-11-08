
package com.mycompany.sincro;


public class BombaCombustivel extends Thread{
    
    public void run(){
        
    }
    
     
    
    public synchronized void abastecer (Carro c){
        System.out.println(c.getModelo() + " Abastecendo");
        Integer valor = c.getCombustivel();
        while (valor <= 40){
           try{
               Thread.sleep(200);
           }catch(Exception e){}
            System.out.println("Modelo " + c.getModelo() +
                    " combustivel" + c.getCombustivel());
            
            c.setCombustivel(valor++);
        }
        System.out.println(c.getModelo() + " Tanque cheio");
    }
    
}
