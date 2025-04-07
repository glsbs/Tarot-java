/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication74;
import java.util.Scanner;


public class BurcIslemleri extends Burc {
    
        public BurcIslemleri(){ //yapıcı
       
        System.out.println("Burcunuzun ozellikleri"); 
        burcOzelligi();
       
       
    } public void burcOzelligi(){
         System.out.println(getOzellik(burc1));
   }
    
    
    public String getOzellik(int burc1){
        if(burc1>= 1 && burc1<=12)
        return ozellikler[burc1-1];
        
        else{
            return "Boyle bir burc yok";
    }
    }
  
    
    
  
    private String[] ozellikler={
        
        //Koç
        
        "Bu burcun mensupları, genellikle enerjik, cesur ve kararlı yapılarıyla tanınır. \n"
            + "Koç burcunun özellikleri arasında hızlı hareket etme ve ani kararlar alma \n"
            + "yetenekleri de bulunur. Koç burçları, genellikle bağımsızlığına düşkün ve \n"
            + "kendi yolunu çizmeyi seven bireylerdir.",
        
        //Boğa
        
        "Boğa burcu insanı cana yakın, merhametli ve sempatik yapısıyla biliniyor. \n"
            + "Toprak grubunda yer alan Boğa burçları, sakin ve güvenilir yapılarıyla da \n"
            + "tanınıyor. Keskin düzeyde maddi zekaya sahip olan bu insanlar hem gündelik \n"
            + "yaşamda hem de iş hayatında bu özellikleri ile kolaylık sağlıyorlar.",
        
        //İkizler
        
        "İkizler burcu, enerjik ve çok yönlü yapısıyla öne çıkar. Bir ortama girdiğinde \n"
            + "sürekli gülümsemesi, mutlu tavırları ve canayakınlığıyla göze çarpan bu \n"
            + "kişiler, hareketli yaşamayı sever. Ancak ikizler burcu özellikleri arasında \n"
            + "yer alan kararsızlık ve değişkenlik, zaman zaman maymun iştahlılığa dönüşebilir.",
        
        //Yengeç
        
        "Yengeç'ler duygusallıkları ve duyarlılıkları ile tanınırlar. Çevresindeki her insandan \n"
            + "da aynı hassasiyeti bekledikleri için, kolay geçinilebilir kişiler değildir. \n"
            + "İyi günlerinde neşeli, iyi kalpli, yardımsever, düşünceli ve anlayışlıdırlar. \n"
            + "Fakat herhangi belirgin bir neden olmadan somurtkan ve alıngan olabilirler.",
        
        //Aslan
        
        "Aslan Burcu, Zodyak'ın beşinci burcu olarak tanınır ve 23 Temmuz ile 22 Ağustos tarihleri \n"
            + "arasında doğanları temsil eder. Bu burcun insanları, kendilerine güvenen, cesur ve \n"
            + "doğal liderler olarak bilinirler. Ateş elementiyle ilişkilendirilen Aslan bireyleri, \n"
            + "adeta içlerinde yanan bir alev gibi enerjik ve tutkuludurlar.",
        
        //Başak
        
        "Başak burcu, detaycılığı ve analitik düşünce yapısıyla tanınır. Başak burcu \n"
            + "insanları, mantıklı ve pratik yaklaşımıyla sorunlara çözüm üretmede ustadır. \n"
            + "Başak burcunun özellikleri arasında dikkatli ve özenli olma, \n"
            + "küçük detaylara bile büyük önem verme bulunur.",
        
        //Terazi
        
        "Terazi burçları genel olarak akıllı, mantıklı ve aşk dolu özelliklere sahiplerdir. \n"
            + "Terazi burçları hayallerine ulaşmak için çok çalışırlar. Terazi burçları genel \n"
            + "olarak uzlaşı yanlısı ve kibar özellikleri ile bilinirler. İlişkilerinde \n"
            + "adil olan terazi burçları mantıkları ile birlikte hareket ederler.",
        
        //Akrep
        
        "Sabit bir su burcu olan Akrepler sadakatleri, bağlılıkları ve tutkularıyla tanınırlar. \n"
            + "İçgüdüleri ve doğuştan gelen durugörü yetenekleri ile insanların kendilerinin \n"
            + "bile farkında olmadığı yönlerini görme yeteneğine sahiptirler. Bu onların \n"
            + "hem en güçlü yönü hem de lanetidir.",
        
        //Yay
        
        " Yay burcunun temel nitelikleri arasında maceraperestlik, yenilik arayışı ve \n"
            + "iyimserlik öne çıkar. Yay burcu kadınları ve erkekleri, özgürlüğüne \n"
            + "düşkün ve maceracı ruhlarıyla tanınırlar.",
        
        //Oğlak
        
        "Temel özellikleri arasında kararlılık, disiplin, ciddiyet ve hedefe yönelik bir \n"
            + "bakış açısı bulunur. Oğlak burcu bireyleri genellikle çalışkan, \n"
            + "sorumluluk sahibi ve liderlik özellikleriyle bilinir.",
        
        //Kova
        
        "Hava grubuna ait olan Kova burcu, yenilikçi, özgür ruhlu ve bağımsız karakteriyle bilinir. \n"
            + "Bu burçta doğan insanlar, genellikle toplumsal meselelerle ilgilenir ve insan haklarına \n"
            + "büyük önem verirler. Kova burcu özellikleri arasından en belirginlerinden biri, \n"
            + "sıradışı düşünce yapılarına sahip olmalarıdır.",
        
        //Balık
        
        "Genel olarak uysallığı ile bilinen ve su grubu olan balık burçları 20 Şubat ile \n"
            + "20 Mart tarihleri arasında doğmuş kişilerdir. Balık burcu olan kişiler \n"
            + "genel olarak sabırlı, eli açık ve de duyarlı olan insanlardır. \n"
            + "Bu kişilerin her daim büyük bir inandırma yetenekleri bulunmaktadır."  
    };
    
}
