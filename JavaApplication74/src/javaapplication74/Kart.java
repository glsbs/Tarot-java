/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication74;


public abstract class Kart extends User {
    
        public Kart(){
        System.out.println("Kart cekildi");
    }
   public Kart(String isim){
       super(isim);
   }
    public abstract String getAnlamlar(int tercih,int KartNumara);
    public abstract String getKart(int numara);
    
}
