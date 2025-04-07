/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication74;

import java.util.Scanner;


public class Burc extends User{
    
   Scanner klavye = new Scanner(System.in);
   public  String secim="";
   public int burc1;
   public int ay,gun;
   
   public Burc(){
    BurcHesaplama burc = new BurcHesaplama();
    burc.burcHesaplama();
    
}
   public Burc(String isim){
       super(isim);
       BurcHesaplama burc = new BurcHesaplama();
    burc.burcHesaplama();
   }
   
   
   public class BurcHesaplama{
       
      public int burcHesaplama(){
          System.out.println("Burcunuzu biliyor musunuz?  Evet ya da Hayir girin ");
          secim=klavye.next().toLowerCase();
        switch (secim) {
            case "evet":
                while (true) { // Döngü başlatılır
        try {
            System.out.print("Lütfen burcunuzu giriniz: \n1-Koç\n2-Boğa\n3-İkizler\n4-Yengeç\n5-Aslan\n6-Başak\n7-Terazi\n8-Akrep\n9-Yay\n10-Oğlak\n11-Kova\n12-Balık\n");
            burc1 = klavye.nextInt(); // Kullanıcıdan giriş alınır
            System.out.println();
            if (burc1 >= 1 && burc1 <= 12) { // Geçerli bir değer kontrolü
                break; // Döngüden çıkılır
            } else {
                System.out.println("Lütfen 1-12 arası geçerli bir rakam girin.");
            }
        } catch (Exception e) {
            System.out.println("Hata! Geçerli bir sayı girin.");
            klavye.nextLine(); // Scanner'daki hatalı girdiyi temizler
        }
    }
    return burc1; // Geçerli bir burç numarası döndürülür

                
            case "hayir":
                while(true){
                   try{
                System.out.print("Dogum ayinizi giriniz(1-12): ");
                ay=klavye.nextInt();
                if(ay<1 || ay>12){
                    System.out.println("Lutfen 1-12 arasi giris yapiniz.");
                }else{
                    break;
                }
                   }catch(Exception e){
                       System.out.println("Gecersiz giris.");
                       klavye.nextLine();
                   }
                }
                while(true){
                   try{
                System.out.print("Dogum gununuzu seciniz (1-31):");
                gun=klavye.nextInt();
                if(gun<1 || gun>31){
                    System.out.println("Lutfen 1-31 arasi giris yapiniz.");
                }else{
                    break;
                }
                   }catch(Exception e){
                       System.out.println("Gecersiz giris.");
                       klavye.nextLine();
                   }
                }
                return burcHesaplama(ay,gun);
                
            default :
                System.out.println("Gecersiz bir tercih yaptiniz!");
                return -1;
                
        }   
      }
      
                
    public int burcHesaplama(int ay, int gun){            
                if ((ay == 1 && gun >= 21) || (ay == 2 && gun <= 19)) {
                    System.out.println("Burcunuz Kova");
                    burc1 = 11;
                }
                
                else if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20)) {
                    System.out.println("Burcunuz Balik");
                    burc1 = 12;
                }
                
                else if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
                    System.out.println("Burcunuz Koc");
                    burc1 = 1;
                }
                
                else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) {
                    System.out.println("Burcunuz Boga");
                    burc1 = 2;
                }
                
                else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22)) {
                    System.out.println("Burcunuz Ikizler");
                    burc1 = 3;
                }
                
                else if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22)) {
                    System.out.println("Burcunuz Yengec");
                    burc1 = 4;
                }
                
                else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
                    System.out.println("Burcunuz Aslan");
                    burc1 = 5;
                }
                
                else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
                    System.out.println("Burcunuz Basak");

                    burc1 = 6;
                }
                
                else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
                    System.out.println("Burcunuz Terazi");
                    burc1 = 7;
                }
                else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
                    System.out.println("Burcunuz Akrep");
                    burc1 = 8;
                }
                
                else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
                    System.out.println("Burcunuz Yay");
                    burc1 = 9;
                }
                
                else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 20)) {
                    System.out.println("Burcunuz Oglak");
                    burc1 = 10;
                }
                
                else {
                    System.out.println("Gecersiz bir tarih girdiniz."); 
                    burc1=-1;
                }   
                
                
                return burc1;   

               
        }
        
       
   }
    
    
}
