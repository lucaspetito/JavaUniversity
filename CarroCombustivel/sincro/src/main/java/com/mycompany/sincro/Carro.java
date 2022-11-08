
package com.mycompany.sincro;


public class Carro extends Thread{

    private String  modelo;
    private Integer combustivel;
    private BombaCombustivel bomba1;
    
    public Carro(String m, BombaCombustivel bomba){
        this.modelo = m;
        combustivel = 40;
        this.bomba1 = bomba;
    }
    
    @Override
   public void run(){
                
            rodar();
            
        
       
       
    }
    
   public void rodar(){
    System.out.println("Modelo - " + this.getModelo() + " começou a rodar");
    System.out.println("Tanque - " + this.getCombustivel() + "l");
        while (getCombustivel() > 0){
            try{
            Thread.sleep(100);
                
            }catch(Exception e){}
            System.out.println("Modelo -" + this.getModelo());
            System.out.println("Marcador-" + this.combustivel--);
        }
        System.out.println(this.getModelo() + "- Precisa abastecer - " + this.getState());
       this.bomba1.abastecer(this);
        
      
    }  

    /**
     * @param combustivel the combustivel to set
     */
    public void setCombustivel(Integer combustivel) {
        this.combustivel = combustivel;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the combustivel
     */
    public Integer getCombustivel() {
        return combustivel;
    }
}
