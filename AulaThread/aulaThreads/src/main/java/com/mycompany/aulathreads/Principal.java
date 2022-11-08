package com.mycompany.aulathreads;



public class Principal {

    public static void main(String[] args) {
        System.out.println("Threads");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        
        try {
            Thread.sleep(6000);
        } catch (InterruptedException ex) {
            
            System.out.println("Error");
        }
        
        Thread t1 = new Thread(new MinhaThread("Thread1"));
          Thread t2 = new Thread(new MinhaThread("Thread2"));
            Thread t3 = new Thread(new MinhaThread("Thread3"));
              Thread t4 = new Thread(new MinhaThread("Thread4"));
                Thread t5 = new Thread(new MinhaThread("Thread5"));
                t5.setPriority(Thread.MAX_PRIORITY);
                
                System.out.println(t2.getState());
        t1.start();t2.start();t3.start();t4.start();t5.start();
        System.out.println(t2.getState());
        System.out.println("FIM");
        
        
        
    }
    
}
