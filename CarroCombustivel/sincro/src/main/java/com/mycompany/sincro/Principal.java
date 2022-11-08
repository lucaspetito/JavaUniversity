
package com.mycompany.sincro;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Principal {

    
    public static void main(String[] args) {
    
       BombaCombustivel bomba1          = new BombaCombustivel();
       List<Carro>      carros          = new ArrayList<>();
       Carro            celta           = new Carro("Celta",    bomba1);
       Carro            gol             = new Carro("Gol",      bomba1);
       Carro            fusion          = new Carro("Fusion",   bomba1);
       Carro            corolla         = new Carro("Corolla",  bomba1);
       
       carros.add(celta);
       carros.add(gol);
       carros.add(fusion);
       carros.add(corolla);
       
      
     
        celta.start();
        gol.start();
        fusion.start();
        corolla.start();
       
          
     
       
       
    }
}
