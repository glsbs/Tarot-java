/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication74;

import java.util.Scanner;


public class Okuma {
    
    Scanner klavye= new Scanner(System.in);
    
    private int secim=0;
    private int[] secilenKart= new int[3];
    public int tercih;
    private Kart kartlar;

    
    public Okuma(){
        
               baslat();
        
    }
    public void baslat(){
        konu();
        kartCekim();
        kartCagirma();
    }
    
    public void kartCekim(){
        secim=0;
        
        while(secim < secilenKart.length){
            int secilen=(int)(Math.random()*77);
            boolean kartKontrol = false; 
            
            for(int i=0; i<secim; i++){
                if(secilenKart[i]==secilen){
                    kartKontrol= true;
                    break;
                }
                
            }
            if(!kartKontrol){
                secilenKart[secim]=secilen;
                secim++;
               
            }
  
        }
    }
    //try catch  
      public int konu(){
          while(true){
        try{
            System.out.println("1)Genel Yorum\n2)Ask Yorum\n3)Kariyer Yorum \n Tercih sizin...");
            tercih=klavye.nextInt();
            System.out.println();
            if(tercih<1 || tercih>3){
            System.out.println("Lutfen 1-3 arasi tercih yapiniz.");
            }
            else{
              break;
            }
        }catch(Exception e){
            System.out.println("Gecersiz giris.");
            klavye.nextLine();
        }
          }
          return --tercih;
      }
          
          
        
    
      
      
    public void kartCagirma(){
        Kart kart;
      
        for( int i=0; i<3; i++){
            int numara= secilenKart[i];
            if(numara<22){
                 kart = new MajorArcana();
            System.out.println("Secilen  Arcana Karti: "+kart.getKart(numara)+" anlami " +kart.getAnlamlar(numara, tercih));
            System.out.println();
                  }
            else{
                numara=numara-22;
                kart=new MinorArcana();
                System.out.println("Secilen  Arcana Karti: "+kart.getKart(numara) + " anlami " +kart.getAnlamlar(numara, tercih));
            System.out.println();
            }
        
           }
    
}
}
