/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication74;


public class AylikBurc extends Burc {
    
        public int aySecimi;
    
public AylikBurc(){ 
    konu();
    
    
}
public void konu(){
    int konu;
        boolean kontrol=false;
    System.out.println("Sadece bir aya bakmak istiyorsanız 1'e "
            + "Birden fazla aya Bakmak istiyorsanız 2'ye");
    while(!kontrol){
    try{
    konu=klavye.nextInt();
     if(konu==1){
        aySecimi();
        kontrol=true;
    }else if(konu==2){
        System.out.println("baslangic ayi");
        int baslangic=klavye.nextInt();
        System.out.println("bitis ayi");
        int bitis=klavye.nextInt();
        aySecimi(baslangic,bitis);
         setCoin(0);
         System.out.println("Birden fazla aya baktıginiz icin coininiz sifirlandi.");
         kontrol=true;
    }
    }catch(Exception e){
        System.out.println("Hata!!");
        System.out.println("Tekrar girin ");
        klavye.nextLine();
    }
} 
}

public void aySecimi(){
    System.out.println("Istediginiz ay 1-12 rakam girin");
    aySecimi=klavye.nextInt();
    System.out.println(aylikAnlamlar[aySecimi-1][burc1-1]);
    

}
// Overloading 1
public void aySecimi(int baslangicAy, int bitisAy){
    for (int i = baslangicAy; i <= bitisAy; i++) {
        System.out.println(i + ".ay icin Aylik burc yorumunuz:");
        System.out.println(aylikAnlamlar[i-1][burc1-1]);
    }
}
    


    protected static String[][] aylikAnlamlar={
          //ocak
       {
           
 "Koc: Kariyerde cesur adimlar atma zamani. Ask hayatinizda samimi konusmalar onem kazaniyor.\n" ,
"Boga: Maddi firsatlar kapinizi calabilir. Aile ile daha cok vakit gecirebilirsiniz.\n" ,
"Ikizler: Yeni baslangiclar icin enerjik bir ay. Sosyal cevrenizden destek gorebilirsiniz.\n" ,
"Yengec: Ev ve is arasinda denge kurmaniz gerekebilir. Romantik bir surpriz sizi bekliyor.\n" ,
"Aslan: Is projelerinde one cikma sansi var. Arkadas cevrenizde populerlik kazaniyorsunuz.\n" ,
"Basak: Finansal konularda dikkatli adimlar atin. Sagliginiza daha cok zaman ayirin.\n" ,
"Terazi: Yeni bir baslangic yapma enerjisi yuksek. Ask hayatinda denge kurabilirsiniz.\n" ,
"Akrep: Is ve kariyerde daha derin planlar yapma zamani. Iliskilerde duygusal baglar gucleniyor.\n" ,
"Yay: Yaratıcı projelerde basari sansi yuksek. Sosyal cevrenizden destek alabilirsiniz.\n" ,
"Oglak: Kariyer hedeflerinize ulasmak icin kararlisiniz. Sagliginiza ozen gosterin.\n" ,
"Kova: Yeni bir projeye adim atma zamani. Romantik bir gelisme yasanabilir.\n" ,
"Balik: Hayallerinize odaklanin. Kariyerde guclu baglantilar kurabilirsiniz."
        },
        //Şubat
        {
            "Koc: Hareketli ve sosyal bir ay sizi bekliyor. Ask hayatinizda heyecanli gelismeler olabilir.\n" ,
"Boga: Maddi konularda onemli kararlar alabilirsiniz. Saglik konularina dikkat edin.\n" ,
"Ikizler: Yaraticiliginiz zirvede. Ask hayatinizda daha fazla paylasim on planda.\n" ,
"Yengec: Is ve ev dengesini saglamaniz gerekiyor. Sosyal cevrenizden biriyle yakinlasabilirsiniz.\n" ,
"Aslan: Kariyerde yeni firsatlar kapida. Arkadaslarinizla guclu baglar kuruyorsunuz.\n" ,
"Basak: Planlama ve duzen konularinda one cikacaginiz bir ay. Duygusal baglar kuvvetlenebilir.\n" ,
"Terazi: Yaratici projelerde basarili olabilirsiniz. Ask hayatinda dengeyi koruyun.\n" ,
"Akrep: Icsel huzur arayisi ve derin dusunceler on planda. Kariyerde ilerleme zamani.\n" ,
"Yay: Seyahat ve egitim konularinda firsatlar cikabilir. Romantik bir surpriz kapida.\n" ,
"Oglak: Kariyer hedeflerinize yonelik guclu adimlar atabilirsiniz. Saglik enerjiniz artiyor.\n" ,
"Kova: Sosyal cevrenizle keyifli vakit gecireceginiz bir ay. Ask hayatinda yenilikler var.\n" ,
"Balik: Yaraticiliginiz artiyor. Hem kariyer hem de romantik iliskilerde sanslisiniz.",
        },
         //Mart
       {
    "Koc: Enerji ve motivasyon dolusunuz. Yeni projeler icin dogru zaman.\n" ,
"Boga: Maddi konularda sanslisiniz. Aile ici iletisim gucleniyor.\n" ,
"Ikizler: Iletisim becerilerinizle one cikabilirsiniz. Sosyal ortamlarda parliyorsunuz.\n" ,
"Yengec: Ruhsal ve duygusal olarak yenilenme zamani. Ask hayatinda surprizler var.\n" ,
"Aslan: Yaraticilik ve liderlik on planda. Is projelerinde dikkat cekiyorsunuz.\n" ,
"Basak: Kariyerinizde yeni firsatlar kapida. Saglik konularinda dikkatli olun.\n" ,
"Terazi: Romantik iliskilerde hareketlilik var. Is hayatinda dengeyi koruyun.\n" ,
"Akrep: Is projelerinde stratejik planlar yapmalisiniz. Duygusal baglar derinlesiyor.\n" ,
"Yay: Sosyal cevrenizde populerlik kazaniyorsunuz. Yaratici projelerde basari var.\n" ,
"Oglak: Yeni hedeflere yonelmek icin uygun zaman. Sagliginiza dikkat edin.\n" ,
"Kova: Sosyal iliskilerde yeni baslangiclar yapabilirsiniz. Romantizm artiyor.\n" ,
"Balik: Hayallerinizi gerceklestirme zamani. Hem is hem de ask hayatinda sanslisiniz."
        },
           //Nisan
       {
    "Koc: Enerjinizi hedeflerinize yoneltin. Sosyal ortamlarda dikkat cekeceksiniz.\n" ,
"Boga: Finansal konularda dikkatli adimlar atin. Aileden destek gorebilirsiniz.\n" ,
"Ikizler: Iletisim ve fikir alisverisleri on planda. Yeni bir arkadaslik baslayabilir.\n" ,
"Yengec: Kariyerinizde fark edilme zamani. Romantik bir gelisme yasayabilirsiniz.\n" ,
"Aslan: Is hayatinda liderlik yapabileceginiz firsatlar cikabilir. Ruhsal dengenize onem verin.\n" ,
"Basak: Planlama ve analiz yaparak basari kazanacaginiz bir ay. Aile iliskileriniz gucleniyor.\n" ,
"Terazi: Ask hayatinda yeni bir baslangic olabilir. Is yerinde uyumlu calismalar sizi bekliyor.\n" ,
"Akrep: Iceriden gelen bir enerjiyle buyuk adimlar atabilirsiniz. Duygusal olarak yenileniyorsunuz.\n" ,
"Yay: Sosyal cevreniz genisliyor. Seyahat planlari yapabilirsiniz.\n" ,
"Oglak: Is hayatinda ilerleme ve yeni firsatlar on planda. Sagliginiza ozen gosterin.\n" ,
"Kova: Yaratici projelerde parlayabilirsiniz. Ask hayatinda yenilikler var.\n" ,
"Balik: Hayallerinizin pesinden gidin. Hem is hem askta olumlu bir ay."
        },
           //Mayıs
       {
       "Koc: Hedeflerinize ulasmak icin hizli hareket etmelisiniz. Ask hayatinizda heyecan var.\n" ,
"Boga: Maddi konularda dengeyi saglayin. Aile ile keyifli vakit gecirebilirsiniz.\n" ,
"Ikizler: Yeni fikirler ve projeler icin harika bir zaman. Sosyal cevrenizde dikkat cekeceksiniz.\n" ,
"Yengec: Kariyerinizde yeni bir donem basliyor. Ruhsal sagliginiza dikkat edin.\n" ,
"Aslan: Liderlik yeteneklerinizle fark yaratabilirsiniz. Ask hayatinizda surprizler olabilir.\n" ,
"Basak: Is yerinde detaylara odaklanarak basari kazanabilirsiniz. Sagliginiza zaman ayirin.\n" ,
"Terazi: Is ve ask hayatinizda dengeyi bulmaniz gerekebilir. Yeni bir projeye baslayabilirsiniz.\n" ,
"Akrep: Iletisim becerilerinizle on plandasiniz. Duygusal baglar guclenebilir.\n" ,
"Yay: Seyahat ve yeni deneyimlere acik bir donem. Romantik bir surpriz yasayabilirsiniz.\n" ,
"Oglak: Kariyer hedeflerinize odaklanin. Sosyal iliskilerde dengeyi koruyun.\n" ,
"Kova: Sosyal aktiviteler ve arkadaslarla keyifli vakitler sizi bekliyor. Yeniliklere aciksiniz.\n" ,
"Balik: Yaraticiliginizi ortaya koyabileceginiz bir ay. Romantik bir bag kurulabilir."
        },
           //Haziran
       {
    "Koc: Enerjinizi dogru yone kanalize edin. Yeni baslangiclar icin hazirlik yapin.\n" ,
"Boga: Finansal kazanclariniz artabilir. Ev ve aile iliskilerinde huzur var.\n" ,
"Ikizler: Sosyal ortamlarda parlayacaginiz bir ay. Yeni projelere baslamak icin uygun zaman.\n" ,
"Yengec: Duygusal anlamda derin baglar kurabilirsiniz. Kariyerinizde ilerleme var.\n" ,
"Aslan: Liderliginizi gosterebileceginiz bir donem. Ask hayatinizda hareketlilik var.\n" ,
"Basak: Detaylara odaklanarak is hayatinda basarilar elde edebilirsiniz. Saglik on planda.\n" ,
"Terazi: Hem is hem ask hayatinda denge saglayabileceginiz bir ay. Sosyal ortamlarda aktif olun.\n" ,
"Akrep: Iceri donerek kendinizi yenileyebilirsiniz. Is projelerinde ilerleme kaydedebilirsiniz.\n" ,
"Yay: Sosyal aktivitelerle dolu bir ay sizi bekliyor. Romantik bir gelisme yasayabilirsiniz.\n" ,
"Oglak: Kariyer hedeflerinize ulasmak icin uygun bir donem. Ruhsal sagliginiza dikkat edin.\n" ,
"Kova: Yaratici projelerde on plandasiniz. Ask hayatinizda guzel bir gelisme olabilir.\n" ,
"Balik: Hem is hem ask hayatinda olumlu gelismeler sizi bekliyor. Hayallerinizin pesinden gidin."
        },
           //Temmuz
       {
    "Koc: Yeni projelere odaklanma zamani. Aile ile daha fazla vakit gecirebilirsiniz.\n" ,
"Boga: Maddi konularda ilerleme kaydedebilirsiniz. Sosyal iliskilerde dikkatli olun.\n" ,
"Ikizler: Enerji dolu bir ay sizi bekliyor. Yeni dostluklar kurabilirsiniz.\n" ,
"Yengec: Ev ve aile odakli bir donem. Duygusal baglariniz guclenecek.\n" ,
"Aslan: Kariyerinizde onemli adimlar atabilirsiniz. Ask hayatinizda heyecanli anlar var.\n" ,
"Basak: Detaylara dikkat ederek basarilar elde edeceksiniz. Ruhsal sagliginiza odaklanin.\n" ,
"Terazi: Is ve ask hayatinizda dengeyi korumaniz gerekebilir. Yeni bir baslangic kapida.\n" ,
"Akrep: Iceri donup kendinizi yenileyebileceginiz bir ay. Duygusal baglar derinlesiyor.\n" ,
"Yay: Sosyal cevrenizden destek alacaksiniz. Seyahat planlari on planda olabilir.\n" ,
"Oglak: Kariyer hedeflerinize ulasmak icin guclu bir enerjiye sahipsiniz. Sagliginiza dikkat edin.\n" ,
"Kova: Sosyal ortamlarda aktif olacak, yeni projeler baslatacaksiniz. Ask hayatiniz canlanabilir.\n" ,
"Balik: Hem is hem askta olumlu gelismeler yasayabilirsiniz. Hayalleriniz gerceklesebilir."
        },
           //Ağustos
       {
    "Koc: Hareketli ve sosyal bir ay sizi bekliyor. Yeni bir ask hayatiniza renk katabilir.\n" ,
"Boga: Maddi konularda dikkatli adimlar atin. Aile ile keyifli anlar paylasabilirsiniz.\n" ,
"Ikizler: Iletisim ve sosyal etkinlikler on planda. Ask hayatinizda yenilikler var.\n" ,
"Yengec: Duygusal acidan yogun bir ay. Kariyer hedeflerinize odaklanabilirsiniz.\n" ,
"Aslan: Liderlik ozelliklerinizi one cikarabileceginiz bir donem. Romantik surprizler sizi bekliyor.\n" ,
"Basak: Planlama ve analiz yaparak is hayatinizda basarilar elde edebilirsiniz. Sagliginiza onem verin.\n" ,
"Terazi: Yeni baglantilar kurabileceginiz bir ay. Ask hayatinizda duygusal bir gelisme olabilir.\n" ,
"Akrep: Duygusal anlamda guclu baglar kurabilirsiniz. Kariyerinizde yenilikler var.\n" ,
"Yay: Sosyal cevrenizde populerlik kazanacaksiniz. Seyahat ve yeni deneyimler sizi bekliyor.\n" ,
"Oglak: Kariyer hedeflerinize ulasmak icin sabirli olun. Ruhsal dengenize dikkat edin.\n" ,
"Kova: Yaratici projelerde dikkat cekeceksiniz. Ask hayatinizda olumlu gelismeler olabilir.\n" ,
"Balik: Hayallerinizin gerceklesecegi bir donem. Hem is hem askta sanslisiniz."
        },
           //Eylül
       {
    "Koc: Hedeflerinize odaklanarak buyuk adimlar atabilirsiniz. Sosyal iliskileriniz guclenecek.\n" ,
"Boga: Maddi konularda dikkatli olun. Aile iliskilerinizde dengeyi koruyun.\n" ,
"Ikizler: Yeni fikirler ve projeler icin ideal bir ay. Romantik bir gelisme yasayabilirsiniz.\n" ,
"Yengec: Ev ve is arasinda denge kurmaniz gerekebilir. Ruhsal sagliginiza ozen gosterin.\n" ,
"Aslan: Kariyerinizde yeni firsatlar kapinizi calabilir. Ask hayatinizda guzel surprizler var.\n" ,
"Basak: Detaylara odaklanarak is hayatinizda ilerleme kaydedebilirsiniz. Fiziksel saglik on planda.\n" ,
"Terazi: Romantik iliskilerde hareketlilik yasayabilirsiniz. Yeni projelere baslamak icin uygun bir zaman.\n" ,
"Akrep: Kariyerinizde dikkat cekeceksiniz. Duygusal anlamda daha derin baglar kurabilirsiniz.\n" ,
"Yay: Sosyal aktiviteler ve eglence dolu bir ay sizi bekliyor. Yeni bir seyahat planlayabilirsiniz.\n" ,
"Oglak: Kariyer hedefleriniz icin disiplinli calisma zamani. Ruhsal huzur arayisinda olun.\n" ,
"Kova: Sosyal ortamlarda aktif olacaksiniz. Ask hayatinizda yenilikler sizi bekliyor.\n" ,
"Balik: Hem is hem askta olumlu gelismeler yasayabilirsiniz. Hayallerinizin pesinden gidin."
        },
           //Ekim
       {
    "Koc: Sosyal ortamlarda dikkat cekeceksiniz. Kariyer hedeflerinize ulasmak icin enerji dolusunuz.\n" ,
"Boga: Finansal konularda yeni firsatlar yakalayabilirsiniz. Aile iliskilerinde huzur var.\n" ,
"Ikizler: Iletisim gucunuzle yeni baglantilar kurabilirsiniz. Ask hayatinizda yenilikler var.\n" ,
"Yengec: Duygusal anlamda derin baglar kurabileceginiz bir ay. Is hayatinda ilerleme bekleniyor.\n" ,
"Aslan: Liderlik ozelliklerinizi kullanarak is hayatinda fark yaratabilirsiniz. Ask hayatinizda surprizler var.\n" ,
"Basak: Planlama yeteneginizle basarilar elde edebilirsiniz. Sagliginiza zaman ayirin.\n" ,
"Terazi: Hem is hem ask hayatinizda denge saglayabileceginiz bir donem. Yeni baslangiclar sizi bekliyor.\n" ,
"Akrep: Icsel yolculuk ve yenilenme zamani. Duygusal baglar derinlesebilir.\n" ,
"Yay: Sosyal aktivitelerle dolu bir ay. Yeni seyahatler planlayabilirsiniz.\n" ,
"Oglak: Kariyer hedeflerinizde yeni firsatlar ortaya cikabilir. Ruhsal sagliginiza dikkat edin.\n" ,
"Kova: Yaratici projelerde parlayabilirsiniz. Ask hayatinizda guzel bir gelisme olabilir.\n" ,
"Balik: Hayallerinizin pesinden giderek buyuk adimlar atabilirsiniz. Hem is hem askta sanslisiniz."
        },
           //Kasım
       {
    "Koc: Hedeflerinize ulasmak icin kararlilikla ilerliyorsunuz. Aile iliskilerinde keyifli zamanlar sizi bekliyor.\n" ,
"Boga: Maddi konularda dikkatli olun. Sosyal iliskilerinizde guzel gelismeler var.\n" ,
"Ikizler: Yeni projeler ve fikirler icin uygun bir zaman. Romantik bir surpriz yasayabilirsiniz.\n" ,
"Yengec: Kariyerinizde yeni bir donem basliyor. Duygusal olarak yenileniyorsunuz.\n" ,
"Aslan: Liderlik yeteneklerinizi on plana cikarabileceginiz bir donem. Ask hayatinizda hareketlilik var.\n" ,
"Basak: Detaylara odaklanarak is hayatinda basarilar elde edebilirsiniz. Fiziksel sagliga dikkat.\n" ,
"Terazi: Hem sosyal hayatta hem askta olumlu gelismeler sizi bekliyor. Yeni baslangiclar yapabilirsiniz.\n" ,
"Akrep: Duygusal derinlik ve kariyerde ilerleme zamani. Kendinize olan guveniniz artiyor.\n" ,
"Yay: Enerjik bir donemdesiniz. Yeni seyahatler ve sosyal aktiviteler planlayabilirsiniz.\n" ,
"Oglak: Disiplinli calisma ile basarilar kazanabilirsiniz. Aile baglarinizi guclendirin.\n" ,
"Kova: Sosyal ortamlarda parlayacak ve yaratilanizla fark yaratacaksiniz. Ask hayatiniz canlanabilir.\n" ,
"Balik: Hem is hem ask hayatinizda guzel firsatlar kapinizda. Hayalleriniz gerceklesebilir."
        },
           //Aralık
       {
    "Koc: Yeni yil icin hedeflerinizi belirleyin. Is hayatinda ilerleme var. Ask hayatinizda guzel surprizler olabilir.\n" ,
"Boga: Maddi konularda saglam adimlar atiyorsunuz. Aile ile huzurlu bir ay sizi bekliyor.\n" ,
"Ikizler: Sosyal iliskiler ve yeni baslangiclar icin harika bir ay. Ask hayatinizda guzel bir gelisme var.\n" ,
"Yengec: Duygusal anlamda yenilenme ve is hayatinda guzel firsatlar sizi bekliyor.\n" ,
"Aslan: Liderlik yeteneklerinizle parlayabilirsiniz. Ask hayatinizda heyecanli anlar yasayabilirsiniz.\n" ,
"Basak: Detaylara dikkat ederek buyuk basarilar elde edeceksiniz. Saglik konularinda dikkatli olun.\n" ,
"Terazi: Ask hayatinizda olumlu gelismeler var. Is yerinde yeni firsatlar karsiniza cikabilir.\n" ,
"Akrep: Derin baglar kurabileceginiz bir donem. Is hayatinda yeniliklere hazir olun.\n" ,
"Yay: Sosyal ortamlarda keyifli zamanlar sizi bekliyor. Yeni yil icin planlar yapabilirsiniz.\n" ,
"Oglak: Kariyer hedeflerinize ulasmak icin kararlilikla ilerliyorsunuz. Ruhsal sagliginizi on planda tutun.\n" ,
"Kova: Yaraticiliginizi one cikarabileceginiz projeler sizi bekliyor. Ask hayatiniz canlanacak.\n" ,
"Balik: Hayallerinizin gerceklesecegi bir donemdesiniz. Hem is hem askta sanslisiniz."
        } 
  };
    
}
