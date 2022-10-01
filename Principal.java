
package com.mycompany.colecoesaula3;

import java.util.*;


public class Principal {

    
    public static void main(String[] args) {
        
        List lista1 = new ArrayList();
        lista1.add("item1");
        lista1.add("item2");
        lista1.add("item3");
        lista1.add("item1");
        
       // System.out.println(lista1);
        
       // System.out.println(lista1.get(2));
        
       // System.out.println(lista1.indexOf("item1"));
        
        
//        System.out.println("\n\n\n\n Lista com SET : ");
//        
//        Set lista2 = new HashSet();
//        lista2.add("item1");
//        lista2.add("item2");
//        lista2.add("item3");
//        lista2.add("item1");
//        
//        System.out.println(lista2);
//        
//        System.out.println(lista2.size());
//        
//        System.out.println("\n\n\n\n Lista com MAP : ");
//        
        Map<String, Aluno> lista3 = new HashMap<>();
        
        lista3.put("chave1", new Aluno("aluno1", "2001"));
        lista3.put("chave2", new Aluno("aluno2", "2002"));
        lista3.put("chave3", new Aluno("aluno3", "2003"));
        
        System.out.println(lista3.get("chave3"));
//        
//        System.out.println(lista3.get("chave2"));
//      //  System.out.println(lista2.indexOf("item1"));
        
        
        
    }
    
}
