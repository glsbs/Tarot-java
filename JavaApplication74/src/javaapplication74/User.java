/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication74;
import java.util.Date;
import java.util.Scanner;


public class User {
    
    Scanner klavye = new Scanner(System.in);
    private String isim;
    private int coin=20;
    private java.util.Date tarih;
    public int secim;
    
    
    public User(){
       this.tarih = new java.util.Date(); // tarih

    }
    
    public User(String isim){
        this.isim=isim;
    }
    
    public void kategoriCagirma(){
        boolean dogruluk=false;
        while(!dogruluk){
        try{
        System.out.println("1-Tarot\t 2-Astroloji ");
        secim=klavye.nextInt();
        if(secim<1 || secim>2){
            System.out.println("1-2 arasında secim yapmanız gerek");
            
        }else{
            dogruluk=true;
        }
            
        }catch(Exception e){
            System.out.println("Gecersiz giris");
            klavye.nextLine();// hatali girşi temizler
        }
        }
        altKategori();
        coinHesap();
        
    }
    
    public void altKategori(){
        boolean dogruluk=false;
        if(secim==1){
            Okuma okuma = new Okuma();
        }else if(secim==2){
            while(!dogruluk){
            try{
            System.out.println("1-Yillik Burc Yorumu \t 2-Aylik Burc Yorumu\t 3-Burcunuzun Ozellikleri");
            int secim2=klavye.nextInt();
            if(secim2<1 || secim2>3){
                System.out.println("Lutfen 1-3 arasinda secim yapiniz.");
            }
            else{
            switch(secim2){
                case 1: 
                    YillikBurc yillikBurc = new YillikBurc();
                    dogruluk=true;
                    break;
                case 2:
                    AylikBurc aylikBurc = new AylikBurc();
                    dogruluk=true;
                    break;
                case 3:
                    BurcIslemleri burcIslemleri= new BurcIslemleri(); 
                    dogruluk=true;
                    break;
                default:
                    System.out.println("Gecersiz secim");
            }
            }
            }catch(Exception e){
                    System.out.println("Gecersiz giris.");
                    klavye.nextLine();
                    }
        }
        
    }
    }
    
    
   public void coinHesap(){
       coin-=10;
       System.out.println();
       System.out.println("\nCoininiz 10 azaldi");
       System.out.println("Kalan Coininiz "+coin);
      if(coin<=0){
           
           System.out.println( Tarih() + " Tarihinde Coininiz Bitmistir ");
               System.out.println("Sistemden cikisiniz gerceklesiyor...");
               System.exit(0);
               System.out.println("Gunluk sınıra ulasıldi");
      }else{
          devam();
      }
      
       
      
   }
   
   public void devam(){    

       System.out.println("Devam etmek ister misiniz");
       System.out.println("Evet ya da Hayir girin");
       String cevap;
       cevap=klavye.next().toLowerCase();
       switch(cevap){
           case "hayir" :
               System.out.println("Sistemden cikisiniz gerceklesiyor...");
               System.exit(0);
               break;
           case "evet" :
               kategoriCagirma();
               break;
           default:
               System.out.println("! HATA !");
               System.out.println();
               devam();
       }
   }
   
    public int getCoin(){
        return coin;
    }
    public void setCoin(int coin){
        this.coin=coin;
        if(coin==0){
            System.exit(0);
        }
    }
   public java.util.Date Tarih(){
       return this.tarih = new java.util.Date();
    
}
    
}
